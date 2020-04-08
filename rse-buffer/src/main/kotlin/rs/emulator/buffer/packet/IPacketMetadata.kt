package rs.emulator.buffer.packet

import rs.emulator.buffer.packet.PacketType

/**
 * @author Tom <rspsmods@gmail.com>
 */
interface IPacketMetadata {

    fun getType(opcode: Int): PacketType?

    fun getLength(opcode: Int): Int

    fun shouldIgnore(opcode: Int): Boolean
}