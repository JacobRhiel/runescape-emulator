package rs.emulator.entity.actor.player.update.segment

import rs.emulator.packet.GamePacketBuilder
import rs.emulator.entity.actor.player.Player
import rs.emulator.entity.update.segment.SynchronizationSegment
import rs.emulator.utilities.logger

/**
 * @author Tom <rspsmods@gmail.com>
 */
class PlayerTeleportSegment(private val other: Player, private val encodeUpdateBlocks: Boolean) : SynchronizationSegment
{

    override fun encode(buf: GamePacketBuilder) {
        /*
         * Signal to the client that [other] needs to be decoded.
         */
        buf.putBits(1, 1)
        /*
         * Does [other] have pending [gg.rsmod.game.sync.block.UpdateBlockType]s?
         */
        buf.putBit(encodeUpdateBlocks)
        /*
         * Signal to the client that [other] has been moved without actual
         * walking being involved.
         */
        buf.putBits(2, 3)

        /*
         * The difference from [other]'s last tile as far as [player]'s client is
         * concerned.
         */
        val diffX = other.tile.x - (other.lastTile?.x ?: 0)
        val diffZ = other.tile.z - (other.lastTile?.z ?: 0)
        val diffH = other.tile.height - (other.lastTile?.height ?: 0)

        logger().warn("x {} lastX {} z {} lastZ {}", other.tile.x, other.lastTile?.x ?: 0, other.tile.z, other.lastTile?.z ?: 0)

        /*
         * If the move is within a short radius, we want to save some bandwidth.
         */
        if (Math.abs(diffX) <= Player.NORMAL_VIEW_DISTANCE && Math.abs(diffZ) <= Player.NORMAL_VIEW_DISTANCE) {
            /*
             * Signal to the client that the difference in tiles are within
             * viewing distance.
             */
            buf.putBits(1, 0)
            /*
             * Write the difference in tiles.
             */
            buf.putBits(2, diffH and 0x3)
            buf.putBits(5, diffX and 0x1F)
            buf.putBits(5, diffZ and 0x1F)
            println("teleport block segment")
        } else {
            /*
             * Signal to the client that the difference in tiles are not within
             * viewing distance.
             */
            buf.putBits(1, 1)
            /*
             * Write the difference in tiles.
             */
            buf.putBits(2, diffH and 0x3)
            buf.putBits(14, diffX and 0x3FFF)
            buf.putBits(14, diffZ and 0x3FFF)
            println("teleport block segment")
        }
    }
}