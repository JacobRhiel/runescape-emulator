package rs.emulator.entity.actor.player.update.segment

import rs.emulator.packet.GamePacketBuilder
import rs.emulator.buffer.type.DataType
import rs.emulator.buffer.type.order.DataOrder
import rs.emulator.buffer.type.transform.DataTransformation
import rs.emulator.entity.actor.Direction
import rs.emulator.entity.actor.player.Player
import rs.emulator.entity.actor.update.mask.ChatMessage
import rs.emulator.entity.actor.update.mask.ChatMessage.Companion.huffman
import rs.emulator.entity.update.UpdateBlockType
import rs.emulator.entity.update.segment.SynchronizationSegment
import rs.emulator.world.map.old.region.chunk.Tile

/**
 * @author Tom <rspsmods@gmail.com>
 */
class PlayerUpdateBlockSegment(val other: Player, private val newPlayer: Boolean) : SynchronizationSegment
{

    override fun encode(buf: GamePacketBuilder)
    {
        var mask = other.blockBuffer.blockValue()
        val blocks = other.playerUpdateBlocks

        var forceFacePawn = false
        var forceFaceTile = false

        var forceFace: Tile? = null
        println("new player: $newPlayer")
        if (newPlayer)
        {
            mask = mask or blocks.updateBlocks[UpdateBlockType.APPEARANCE]!!.bit

            when
            {
                other.blockBuffer.faceDegrees != 0    ->
                {
                    mask = mask or blocks.updateBlocks[UpdateBlockType.FACE_TILE]!!.bit
                    forceFaceTile = true
                }
                other.blockBuffer.facePawnIndex != -1 ->
                {
                    mask = mask or blocks.updateBlocks[UpdateBlockType.FACE_PAWN]!!.bit
                    forceFacePawn = true
                }
                else                                  ->
                {
                    mask = mask or blocks.updateBlocks[UpdateBlockType.FACE_TILE]!!.bit
                    forceFace = other.tile.step(Direction.NORTH)//other.lastFacingDirection)
                }
            }
        }

        if (mask >= 0x100)
        {
            mask = mask or blocks.updateBlockExcessMask
            println("mask: $mask")
            buf.put(DataType.BYTE, mask and 0xFF)
            buf.put(DataType.BYTE, mask shr 8)
        } else
        {
            println("adding header: ${mask and 0xFF}")
            buf.put(DataType.BYTE, mask and 0xFF)
        }

        blocks.updateBlockOrder.forEach { blockType ->
            val force = when (blockType)
            {
                UpdateBlockType.FACE_TILE  -> forceFaceTile || forceFace != null
                UpdateBlockType.FACE_PAWN  -> forceFacePawn
                UpdateBlockType.APPEARANCE -> newPlayer
                else                       -> false
            }
            if (other.hasBlock(blockType) || force)
            {
                write(buf, blockType, forceFace)
            }
        }
    }

    private fun write(buf: GamePacketBuilder, blockType: UpdateBlockType, forceFace: Tile?)
    {
        val blocks = other.playerUpdateBlocks

        println("writing block: $blockType")

        when (blockType)
        {

            UpdateBlockType.PUBLIC_CHAT    ->
            {
                val structure = blocks.updateBlocks[blockType]!!.values

                val chatMessage = other.blockBuffer.publicChat
                val compressed = ByteArray(256)
                val length = huffman.compress(chatMessage.text, compressed)

                buf.put(
                    structure[0].type,
                    structure[0].order,
                    structure[0].transformation,
                    (chatMessage.color.id shl 8) or chatMessage.effect.id
                )
                buf.put(structure[1].type, structure[1].order, structure[1].transformation, chatMessage.icon)
                buf.put(
                    structure[2].type,
                    structure[2].order,
                    structure[2].transformation,
                    if (chatMessage.type == ChatMessage.ChatType.AUTOCHAT) 1 else 0
                )
                buf.put(structure[3].type, structure[3].order, structure[3].transformation, length + 1)

                // NOTE(Tom): seems that they don't use reverse bytes as they once use to.
                // If they do at some point read reverse bytes, we can add support for it.
                // To fix the issues that would arise, simply write the smart after the bytes.
                buf.putSmart(chatMessage.text.length)
                buf.putBytes(structure[4].transformation, compressed, 0, length)
            }

            UpdateBlockType.FORCE_CHAT     ->
            {
                // NOTE(Tom): do not need the structure since this value is always
                // written as a string.
                buf.putString(other.blockBuffer.forceChat)
            }

            UpdateBlockType.MOVEMENT       ->
            {
                val structure = blocks.updateBlocks[blockType]!!.values
                buf.put(
                    structure[0].type, structure[0].order, structure[0].transformation,
                    if (other.blockBuffer.teleport) 127 else if (other.steps?.runDirection != null) 2 else 1
                )
            }

            UpdateBlockType.FACE_TILE      ->
            {
                val structure = blocks.updateBlocks[blockType]!!.values
                if (forceFace != null)
                {
                    val srcX = other.tile.x * 64
                    val srcZ = other.tile.z * 64
                    val dstX = forceFace.x * 64
                    val dstZ = forceFace.z * 64
                    val degreesX = (srcX - dstX).toDouble()
                    val degreesZ = (srcZ - dstZ).toDouble()
                    buf.put(
                        structure[0].type,
                        structure[0].order,
                        structure[0].transformation,
                        (Math.atan2(degreesX, degreesZ) * 325.949).toInt() and 0x7ff
                    )
                } else
                {
                    buf.put(
                        structure[0].type,
                        structure[0].order,
                        structure[0].transformation,
                        other.blockBuffer.faceDegrees
                    )
                }
            }

            UpdateBlockType.APPEARANCE     ->
            {
                val appBuf = GamePacketBuilder()
                /*appBuf.put(DataType.BYTE, Appearance.DEFAULT.gender.id)
                appBuf.put(DataType.BYTE, *//*other.skullIcon*//*-1)
                appBuf.put(DataType.BYTE, *//*other.prayerIcon*//*-1)

                val translation = arrayOf(0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1)
                val arms = 6
                val hair = 8
                val beard = 11

                val equipment = arrayOf(1038, 9787, 19553, 4151, 24420, 12817, 24421, 7462, 13239, 19550, -1, -1)

                val styles = intArrayOf(-1, -1, -1, -1, 21, -1, 26, 38, 3, 33, 42, 14)

                appBuf.put(DataType.BYTE, 0)
                appBuf.put(DataType.BYTE, 0)
                appBuf.put(DataType.BYTE, 0)
                appBuf.put(DataType.BYTE, 0)
                appBuf.put(DataType.BYTE, 1)
                appBuf.put(DataType.BYTE, 21)
                appBuf.put(DataType.BYTE, 0)
                appBuf.put(DataType.BYTE, 1)
                appBuf.put(DataType.BYTE, 26)
                appBuf.put(DataType.BYTE, 1)
                appBuf.put(DataType.BYTE, 38)
                appBuf.put(DataType.BYTE, 1)
                appBuf.put(DataType.BYTE, 3)
                appBuf.put(DataType.BYTE, 1)
                appBuf.put(DataType.BYTE, 33)
                appBuf.put(DataType.BYTE, 1)
                appBuf.put(DataType.BYTE, 42)
                appBuf.put(DataType.BYTE, 1)
                appBuf.put(DataType.BYTE, 14)

                for (i in 0 until 5)
                {
                    val colors = arrayOf(3, 4, 2, 3, 2)
                    appBuf.put(DataType.BYTE, colors[i])
                }

                val animations = intArrayOf(808, 823, 823, 820, 821, 822, 824)

                *//* val weapon = other.equipment[3] // Assume slot 3 is the weapon.
                 if (weapon != null) {
                     val def = weapon.getDef(other.world.definitions)
                     def.renderAnimations?.forEachIndexed { index, anim ->
                         animations[index] = anim
                     }
                 }*//*

                animations.forEach { anim ->
                    appBuf.put(DataType.SHORT, anim)
                }

                appBuf.putString(*//*other.username*//*"gpi")
                appBuf.put(DataType.BYTE, *//*other.combatLevel*//*3)
                appBuf.put(DataType.SHORT, 0)//skill level
                appBuf.put(DataType.BYTE, 0)//is hidden
                println("appbuf: ${appBuf.byteBuf.array().toTypedArray().contentDeepToString()}")
*/
                val structure = blocks.updateBlocks[blockType]!!.values

                appBuf.putBytesReverse(byteArrayOf(0, -1, -1, 0, 0, 0, 0, 1, 21, 0, 1, 26, 1, 38, 1, 3, 1, 33, 1, 42, 1, 14, 3, 4, 2, 3, 2, 3, 40, 3, 55, 3, 51, 3, 52, 3, 53, 3, 54, 3, 56, 71, 112, 105, 0, 3, 0, 0, 0))

                buf.put(
                    structure[0].type,
                    structure[0].order,
                    structure[0].transformation,
                    appBuf.byteBuf.readableBytes()
                )

                buf.putBytes(structure[1].transformation, appBuf.byteBuf)

            }

            UpdateBlockType.HITMARK        ->
            {
                val structure = blocks.updateBlocks[blockType]!!.values

                val hitmarkCountStructure = structure[0]
                val hitbarCountStructure = structure[1]
                val hitbarPercentageStructure = structure[2]
                val hitbarToPercentageStructure = structure[3]

                val hits = other.blockBuffer.hits
                val hitbars = hits.filter { it.hitbar != null }

                buf.put(
                    hitmarkCountStructure.type,
                    hitmarkCountStructure.order,
                    hitmarkCountStructure.transformation,
                    hits.size
                )
                hits.forEach { hit ->
                    val hitmarks = Math.min(2, hit.hitmarks.size)

                    /*
                     * Inform the client of how many hitmarkers to decode.
                     */
                    if (hitmarks == 0)
                    {
                        buf.putSmart(32766)
                    } else if (hitmarks > 1)
                    {
                        buf.putSmart(32767)
                    }

                    for (i in 0 until hitmarks)
                    {
                        val hitmark = hit.hitmarks[i]
                        buf.putSmart(hitmark.type)
                        buf.putSmart(hitmark.damage)
                    }

                    buf.putSmart(hit.clientDelay)
                }

                buf.put(
                    hitbarCountStructure.type,
                    hitbarCountStructure.order,
                    hitbarCountStructure.transformation,
                    hitbars.size
                )
                hitbars.forEach { hit ->
                    val hitbar = hit.hitbar!!
                    buf.putSmart(hitbar.type)
                    buf.putSmart(hitbar.depleteSpeed)

                    if (hitbar.depleteSpeed != 32767)
                    {
                        var percentage = hitbar.percentage
                        if (percentage == -1)
                        {
                            val max = 1//other.getMaxHp()
                            val curr = Math.min(max, /*other.getCurrentHp()*/1)
                            percentage =
                                if (max == 0) 0 else ((curr.toDouble() * hitbar.maxPercentage.toDouble() / max.toDouble())).toInt()
                            if (percentage == 0 && curr > 0)
                            {
                                percentage = 1
                            }
                        }

                        buf.putSmart(hitbar.delay)
                        buf.put(
                            hitbarPercentageStructure.type,
                            hitbarPercentageStructure.order,
                            hitbarPercentageStructure.transformation,
                            percentage
                        )
                        if (hitbar.depleteSpeed > 0)
                        {
                            buf.put(
                                hitbarToPercentageStructure.type,
                                hitbarToPercentageStructure.order,
                                hitbarToPercentageStructure.transformation,
                                0
                            )
                        }
                    }
                }
            }

            UpdateBlockType.FACE_PAWN      ->
            {
                val structure = blocks.updateBlocks[blockType]!!.values
                buf.put(
                    structure[0].type, structure[0].order, structure[0].transformation,
                    other.blockBuffer.facePawnIndex
                )
            }

            UpdateBlockType.ANIMATION      ->
            {
                val structure = blocks.updateBlocks[blockType]!!.values
                buf.put(structure[0].type, structure[0].order, structure[0].transformation, 65535/*other.blockBuffer.animation*/)
                buf.put(
                    structure[1].type,
                    structure[1].order,
                    structure[1].transformation,
                    0/*other.blockBuffer.animationDelay*/
                )
            }

            UpdateBlockType.GFX            ->
            {
                val structure = blocks.updateBlocks[blockType]!!.values
                buf.put(structure[0].type, structure[0].order, structure[0].transformation, other.blockBuffer.graphicId)
                buf.put(
                    structure[1].type,
                    structure[1].order,
                    structure[1].transformation,
                    (other.blockBuffer.graphicHeight shl 16) or other.blockBuffer.graphicDelay
                )
            }

            UpdateBlockType.FORCE_MOVEMENT ->
            {
                val structure = blocks.updateBlocks[blockType]!!.values
                buf.put(
                    structure[0].type,
                    structure[0].order,
                    structure[0].transformation,
                    other.blockBuffer.forceMovement.diffX1
                )
                buf.put(
                    structure[1].type,
                    structure[1].order,
                    structure[1].transformation,
                    other.blockBuffer.forceMovement.diffZ1
                )
                buf.put(
                    structure[2].type,
                    structure[2].order,
                    structure[2].transformation,
                    other.blockBuffer.forceMovement.diffX2
                )
                buf.put(
                    structure[3].type,
                    structure[3].order,
                    structure[3].transformation,
                    other.blockBuffer.forceMovement.diffZ2
                )
                buf.put(
                    structure[4].type,
                    structure[4].order,
                    structure[4].transformation,
                    other.blockBuffer.forceMovement.clientDuration1
                )
                buf.put(
                    structure[5].type,
                    structure[5].order,
                    structure[5].transformation,
                    other.blockBuffer.forceMovement.clientDuration2
                )
                buf.put(
                    structure[6].type,
                    structure[6].order,
                    structure[6].transformation,
                    other.blockBuffer.forceMovement.directionAngle
                )
            }

            UpdateBlockType.UNKNOWN_1 ->
            {

                buf.put(DataType.BYTE, DataOrder.BIG, DataTransformation.NEGATE, 2)

            }

            UpdateBlockType.UNKNOWN_2 ->
            {

                buf.put(DataType.SHORT, DataOrder.LITTLE, DataTransformation.ADD, 253)

            }

            UpdateBlockType.CONTEXT_MENU ->
            {
                buf.putString("")
                buf.putString("")
                buf.putString("")
            }
            else                           -> throw RuntimeException("Unhandled update block type: $blockType")
        }
    }
}