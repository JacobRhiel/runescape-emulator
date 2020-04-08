package rs.emulator.entity.update.segment

import rs.emulator.buffer.packet.GamePacketBuilder

/**
 * @author Tom <rspsmods@gmail.com>
 */
interface SynchronizationSegment {

    fun encode(buf: GamePacketBuilder)
}