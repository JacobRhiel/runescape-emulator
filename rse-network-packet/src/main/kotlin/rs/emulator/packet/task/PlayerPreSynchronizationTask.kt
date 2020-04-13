package rs.emulator.packet.task

import rs.emulator.entity.actor.player.Player
import rs.emulator.packet.network.message.impl.RebuildNormalMessage
import rs.emulator.world.map.old.region.chunk.*

/**
 * @author Tom <rspsmods@gmail.com>
 */
object PlayerPreSynchronizationTask : SynchronizationTask<Player> {

    override fun run(pawn: Player) {
        pawn.handleFutureRoute()
        pawn.movementQueue.cycle()

        val last = pawn.lastKnownRegionBase
        val current = pawn.tile

        if (last == null || shouldRebuildRegion(last, current)) {
            val regionX = ((current.x shr 3) - (Chunk.MAX_VIEWPORT shr 4)) shl 3
            val regionZ = ((current.z shr 3) - (Chunk.MAX_VIEWPORT shr 4)) shl 3

            pawn.lastKnownRegionBase = Coordinate(regionX, regionZ, current.height)

            println("regionx: " + regionX + ", z: " + regionZ)

            val xteaService = pawn.xteaKeyService

            /*val rebuildMessage = RebuildNormalMessage(current.x shr 3, current.z shr 3, xteaService)
                instance != null -> RebuildRegionMessage(current.x shr 3, current.z shr 3, 1, instance.getCoordinates(pawn.tile), xteaService)
                else ->*/
            pawn.channel.write(RebuildNormalMessage(current.x shr 3, current.z shr 3, xteaService))
        }
    }

    private fun shouldRebuildRegion(old: Coordinate, new: Tile): Boolean {
        val dx = new.x - old.x
        val dz = new.z - old.z

        return dx <= Player.NORMAL_VIEW_DISTANCE || dx >= Chunk.MAX_VIEWPORT - Player.NORMAL_VIEW_DISTANCE - 1
                || dz <= Player.NORMAL_VIEW_DISTANCE || dz >= Chunk.MAX_VIEWPORT - Player.NORMAL_VIEW_DISTANCE - 1
    }
}