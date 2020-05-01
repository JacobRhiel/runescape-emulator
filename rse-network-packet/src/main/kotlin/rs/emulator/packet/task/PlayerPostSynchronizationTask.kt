package rs.emulator.packet.task

import rs.emulator.entity.actor.player.Player
import rs.emulator.utilities.logger
import rs.emulator.entity.old.region.chunk.Tile

/**
 * @author Tom <rspsmods@gmail.com>
 */
object PlayerPostSynchronizationTask : SynchronizationTask<Player> {

    override fun run(pawn: Player) {
        val oldTile = pawn.lastTile
        val moved = oldTile == null || !oldTile.sameAs(pawn.tile)
        val changedHeight = oldTile?.height != pawn.tile.height

        if (moved) {
            logger().error("moved? {}, lastTile {} new Tile {}", moved, pawn.lastTile, pawn.tile)
            pawn.lastTile = Tile(pawn.tile.x, pawn.tile.z, pawn.tile.height)
        }
        pawn.moved = false
        pawn.steps = null
        pawn.blockBuffer.clean()

        /*if (moved) {
            val oldChunk = if (oldTile != null) Collision.chunks.get(oldTile.chunkCoords, createIfNeeded = false) else null
            val newChunk = Collision.chunks.get(pawn.tile.chunkCoords, createIfNeeded = false)
            if (newChunk != null && (oldChunk != newChunk || changedHeight)) {
               // pawn.world.getService(GameService::class.java)?.let { service ->
                    val newSurroundings = newChunk.coords.getSurroundingCoords()
                    if (!changedHeight) {
                        val oldSurroundings = oldChunk?.coords?.getSurroundingCoords() ?: ObjectOpenHashSet()
                        newSurroundings.removeAll(oldSurroundings)
                    }

                    newSurroundings.forEach { coords ->
                        val chunk = Collision.chunks.get(coords, createIfNeeded = false) ?: return@forEach
                        val messages = chunk.sendUpdates(pawn)
                        if (messages.isNotEmpty()) {
                            println("not empty?!")
                            val local = pawn.lastKnownRegionBase!!.toLocal(coords.toTile())
                            pawn.channel.write(UpdateZonePartialEnclosedMessage(local.x, local.z, PacketConstants.MESSAGE_ENCODER_SET!!, PacketConstants.MESSAGE_STRUCTURE_SET!!, *messages.toTypedArray()))
                        }
                        else println("empty----------------------------")
                    }
                }
                if (!changedHeight) {
                    if (oldChunk != null) {
                        //pawn.world.plugins.executeChunkExit(pawn, oldChunk.hashCode())
                    }
                   // pawn.world.plugins.executeChunkEnter(pawn, newChunk.hashCode())
                }
           // }
        }*/
    }
}