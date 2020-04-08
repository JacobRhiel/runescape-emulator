package rs.emulator.entity.actor.player.update.segment

import rs.emulator.buffer.packet.GamePacketBuilder
import rs.emulator.entity.update.segment.SynchronizationSegment

/**
 * @author Tom <rspsmods@gmail.com>
 */
class PlayerSkipCountSegment(val count: Int) : SynchronizationSegment
{

    override fun encode(buf: GamePacketBuilder) {
        /*
         * Signal to the client that the player does not need to be decoded.
         */
        buf.putBits(1, 0)

        when {
            count == 0 -> {
                buf.putBits(2, 0)
            }
            count < 32 -> {
                buf.putBits(2, 1)
                buf.putBits(5, count)
            }
            count < 256 -> {
                buf.putBits(2, 2)
                buf.putBits(8, count)
            }
            count < 2048 -> {
                buf.putBits(2, 3)
                buf.putBits(11, count)
            }
        }
    }
}