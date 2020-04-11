package rs.emulator.entity.actor.player.update.segment

import rs.emulator.packet.GamePacketBuilder
import rs.emulator.entity.update.segment.SynchronizationSegment

/**
 * @author Tom <rspsmods@gmail.com>
 */
class SetBitAccessSegment : SynchronizationSegment
{

    override fun encode(buf: GamePacketBuilder) {
        buf.switchToBitAccess()
    }
}