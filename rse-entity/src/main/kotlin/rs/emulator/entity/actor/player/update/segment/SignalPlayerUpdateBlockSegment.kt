package rs.emulator.entity.actor.player.update.segment

import rs.emulator.packet.GamePacketBuilder
import rs.emulator.entity.update.segment.SynchronizationSegment

/**
 * @author Tom <rspsmods@gmail.com>
 */
class SignalPlayerUpdateBlockSegment : SynchronizationSegment
{

    override fun encode(buf: GamePacketBuilder) {
        /*
         * Signal to the client that the player needs to be decoded.
         */
        buf.putBits(1, 1)
        /*
         * Signal to the client that the player requires
         * [gg.rsmod.game.sync.block.UpdateBlockType] decoding.
         */
        buf.putBits(1, 1)
        /*
         * Signal to the client that the player does not need their location
         * decoded.
         */
        buf.putBits(2, 0)
    }
}