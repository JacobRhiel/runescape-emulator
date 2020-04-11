package rs.emulator.packet.task

import rs.emulator.packet.GamePacketBuilder
import rs.emulator.packet.PacketType
import rs.emulator.entity.actor.player.Player
import rs.emulator.entity.actor.player.update.segment.*
import rs.emulator.entity.update.segment.SynchronizationSegment
import rs.emulator.world.WorldRepository

/**
 * @author Tom <rspsmods@gmail.com>
 */
object PlayerSynchronizationTask : SynchronizationTask<Player> {

    private const val MAX_LOCAL_PLAYERS = 255

    private const val MAX_PLAYER_ADDITIONS_PER_CYCLE = 40

    override fun run(player: Player)
    {
        val updateProtocol = player.updateProtocol

        val buf = GamePacketBuilder(
            player.playerUpdateBlocks.updateOpcode,
            PacketType.VARIABLE_SHORT
        )

        val maskBuf = GamePacketBuilder()

        val segments = getSegments(player)
        for (segment in segments) {
            segment.encode(if (segment is PlayerUpdateBlockSegment) maskBuf else buf)
        }

        buf.putBytes(maskBuf.byteBuf)

        player.channel.write(buf.toGamePacket())

        updateProtocol.gpiLocalCount = 0
        updateProtocol.gpiExternalCount = 0

        for (i in 1 until 2048)
        {
            if (updateProtocol.gpiLocalPlayers[i] != null) {
                updateProtocol.gpiLocalIndexes[updateProtocol.gpiLocalCount++] = i
            } else {
                updateProtocol.gpiExternalIndexes[updateProtocol.gpiExternalCount++] = i
            }
            updateProtocol.gpiInactivityFlags[i] = updateProtocol.gpiInactivityFlags[i] shr 1
        }
    }

    private fun getSegments(player: Player): List<SynchronizationSegment>
    {

        val segments = mutableListOf<SynchronizationSegment>()

        segments.add(SetBitAccessSegment())
        addLocalSegments(player, true, segments)
        segments.add(SetByteAccessSegment())

        segments.add(SetBitAccessSegment())
        addLocalSegments(player, false, segments)
        segments.add(SetByteAccessSegment())

        var added = 0

        segments.add(SetBitAccessSegment())
        added += addExternalSegments(player, true, added, segments)
        segments.add(SetByteAccessSegment())

        segments.add(SetBitAccessSegment())
        added += addExternalSegments(player, false, added, segments)
        segments.add(SetByteAccessSegment())
        return segments
    }

    private fun addLocalSegments(player: Player, initial: Boolean, segments: MutableList<SynchronizationSegment>) {
        var skipCount = 0

        val updateProtocol = player.updateProtocol

        for (i in 0 until updateProtocol.gpiLocalCount) {
            val index = updateProtocol.gpiLocalIndexes[i]
            val local = updateProtocol.gpiLocalPlayers[index]

            val skip = when (initial) {
                true -> (updateProtocol.gpiInactivityFlags[index] and 0x1) != 0
                else -> (updateProtocol.gpiInactivityFlags[index] and 0x1) == 0
            }

            if (skip) {
                continue
            }

            if (skipCount > 0) {
                skipCount--
                updateProtocol.gpiInactivityFlags[index] = updateProtocol.gpiInactivityFlags[index] or 0x2
                continue
            }

            if (local != player && (local == null || shouldRemove(player, local))) {
                val lastTileHash = updateProtocol.gpiTileHashMultipliers[index]
                val currTileHash = local?.tile?.asTileHashMultiplier ?: 0
                val updateTileHash = lastTileHash != currTileHash

                segments.add(RemoveLocalPlayerSegment(updateTileHash))
                if (updateTileHash) {
                    segments.add(PlayerLocationHashSegment(lastTileHash, currTileHash))
                }

                updateProtocol.gpiLocalPlayers[index] = null
                updateProtocol.gpiTileHashMultipliers[index] = currTileHash

                continue
            }

            val requiresBlockUpdate = local.blockBuffer.isDirty()
            if (requiresBlockUpdate) {
                segments.add(PlayerUpdateBlockSegment(other = local, newPlayer = false))
            }
            if (local.moved) {
                segments.add(PlayerTeleportSegment(other = local, encodeUpdateBlocks = requiresBlockUpdate))
            } else if (local.steps != null) {
                var dx = DIRECTION_DELTA_X[local.steps!!.walkDirection!!.playerWalkValue]
                var dz = DIRECTION_DELTA_Z[local.steps!!.walkDirection!!.playerWalkValue]
                var running = local.steps!!.runDirection != null

                var direction = 0
                if (running) {
                    dx += DIRECTION_DELTA_X[local.steps!!.runDirection!!.playerWalkValue]
                    dz += DIRECTION_DELTA_Z[local.steps!!.runDirection!!.playerWalkValue]
                    direction = getPlayerRunningDirection(dx, dz)
                    running = direction != -1
                }
                if (!running) {
                    direction = getPlayerWalkingDirection(dx, dz)
                }

                segments.add(PlayerWalkSegment(encodeUpdateBlocks = requiresBlockUpdate, running = running,
                        direction = direction))

                if (!requiresBlockUpdate && running) {
                    segments.add(PlayerUpdateBlockSegment(other = local, newPlayer = false))
                }
            } else if (requiresBlockUpdate) {
                println("requires updating")
                segments.add(SignalPlayerUpdateBlockSegment())
            } else {
                for (j in i + 1 until updateProtocol.gpiLocalCount) {
                    val nextIndex = updateProtocol.gpiLocalIndexes[j]
                    val next = updateProtocol.gpiLocalPlayers[nextIndex]
                    val skipNext = when (initial) {
                        true -> (updateProtocol.gpiInactivityFlags[nextIndex] and 0x1) != 0
                        else -> (updateProtocol.gpiInactivityFlags[nextIndex] and 0x1) == 0
                    }
                    if (skipNext) {
                        continue
                    }
                    if (next == null || next.blockBuffer.isDirty() || /*next.moved || next.steps != null || */next != player && shouldRemove(player, next)) {
                        break
                    }
                    skipCount++
                }
                segments.add(PlayerSkipCountSegment(skipCount))
                updateProtocol.gpiInactivityFlags[index] = updateProtocol.gpiInactivityFlags[index] or 0x2
            }
        }

        if (skipCount > 0) {
            throw RuntimeException()
        }
    }

    /**
     * @return
     * The total amount of external players that were added to the local player
     * list.
     */
    private fun addExternalSegments(player: Player, initial: Boolean, previouslyAdded: Int, segments: MutableList<SynchronizationSegment>): Int {
        var skipCount = 0
        var added = previouslyAdded

        val updateProtocol = player.updateProtocol

        for (i in 0 until updateProtocol.gpiExternalCount) {
            val index = updateProtocol.gpiExternalIndexes[i]

            val skip = when (initial) {
                true -> (updateProtocol.gpiInactivityFlags[index] and 0x1) == 0
                else -> (updateProtocol.gpiInactivityFlags[index] and 0x1) != 0
            }

            if (skip) {
                continue
            }

            if (skipCount > 0) {
                skipCount--
                updateProtocol.gpiInactivityFlags[index] = updateProtocol.gpiInactivityFlags[index] or 0x2
                continue
            }

            val nonLocal = if (index < 2000) WorldRepository.players[index] else null

            if (nonLocal != null && added < MAX_PLAYER_ADDITIONS_PER_CYCLE && updateProtocol.gpiLocalCount + added < MAX_LOCAL_PLAYERS
                    && shouldAdd(player, nonLocal)) {

                val oldTileHash = updateProtocol.gpiTileHashMultipliers[index]
                val currTileHash = nonLocal.tile.asTileHashMultiplier

                val tileUpdateSegment = if (oldTileHash == currTileHash) null else PlayerLocationHashSegment(oldTileHash, currTileHash)

                segments.add(AddLocalPlayerSegment(other = nonLocal, locationSegment = tileUpdateSegment))
                segments.add(PlayerUpdateBlockSegment(other = nonLocal, newPlayer = true))

                updateProtocol.gpiInactivityFlags[index] = updateProtocol.gpiInactivityFlags[index] or 0x2
                updateProtocol.gpiTileHashMultipliers[index] = currTileHash
                updateProtocol.gpiLocalPlayers[index] = nonLocal

                added++
                continue
            }

            for (j in i + 1 until updateProtocol.gpiExternalCount) {
                val nextIndex = updateProtocol.gpiExternalIndexes[j]
                val skipNext = when (initial) {
                    true -> (updateProtocol.gpiInactivityFlags[nextIndex] and 0x1) == 0
                    else -> (updateProtocol.gpiInactivityFlags[nextIndex] and 0x1) != 0
                }
                if (skipNext) {
                    continue
                }
                val next = if (nextIndex < 2000) WorldRepository.players[nextIndex] else null
                if (next != null && (shouldAdd(player, next) || next.tile.asTileHashMultiplier != updateProtocol.gpiTileHashMultipliers[nextIndex])) {
                    break
                }
                skipCount++
            }
            segments.add(PlayerSkipCountSegment(count = skipCount))
            updateProtocol.gpiInactivityFlags[index] = updateProtocol.gpiInactivityFlags[index] or 0x2
        }

        if (skipCount > 0) {
            throw RuntimeException()
        }

        return added
    }

    private fun shouldAdd(player: Player, other: Player): Boolean = /*!other.invisible && */other.tile.isWithinRadius(player.tile, Player.NORMAL_VIEW_DISTANCE) && other != player

    private fun shouldRemove(player: Player, other: Player): Boolean = /*!other.isOnline || other.invisible || */!other.tile.isWithinRadius(player.tile, Player.NORMAL_VIEW_DISTANCE)

    val DIRECTION_DELTA_X = intArrayOf(-1, 0, 1, -1, 1, -1, 0, 1)
    val DIRECTION_DELTA_Z = intArrayOf(-1, -1, -1, 0, 0, 1, 1, 1)

    fun getPlayerWalkingDirection(dx: Int, dy: Int): Int {
        if (dx == -1 && dy == -1) {
            return 0
        }
        if (dx == 0 && dy == -1) {
            return 1
        }
        if (dx == 1 && dy == -1) {
            return 2
        }
        if (dx == -1 && dy == 0) {
            return 3
        }
        if (dx == 1 && dy == 0) {
            return 4
        }
        if (dx == -1 && dy == 1) {
            return 5
        }
        if (dx == 0 && dy == 1) {
            return 6
        }
        return if (dx == 1 && dy == 1) {
            7
        } else -1
    }

    fun getPlayerRunningDirection(dx: Int, dy: Int): Int {
        if (dx == -2 && dy == -2)
            return 0
        if (dx == -1 && dy == -2)
            return 1
        if (dx == 0 && dy == -2)
            return 2
        if (dx == 1 && dy == -2)
            return 3
        if (dx == 2 && dy == -2)
            return 4
        if (dx == -2 && dy == -1)
            return 5
        if (dx == 2 && dy == -1)
            return 6
        if (dx == -2 && dy == 0)
            return 7
        if (dx == 2 && dy == 0)
            return 8
        if (dx == -2 && dy == 1)
            return 9
        if (dx == 2 && dy == 1)
            return 10
        if (dx == -2 && dy == 2)
            return 11
        if (dx == -1 && dy == 2)
            return 12
        if (dx == 0 && dy == 2)
            return 13
        if (dx == 1 && dy == 2)
            return 14
        return if (dx == 2 && dy == 2) 15 else -1
    }

}
