package gg.rsmod.net.packet

import gg.rsmod.game.message.MessageStructureSet
import rs.emulator.packet.IPacketMetadata
import rs.emulator.packet.PacketType
import rs.emulator.utilities.logger

/**
 * An [IPacketMetadata] implementation that is responsible for exposing
 * packet metadata based on their opcode.
 *
 * @author Tom <rspsmods@gmail.com>
 */
class PacketMetadata(private val structures: MessageStructureSet) :
    IPacketMetadata
{

    /**
     * Logging in case of null value should be handled in usage implementation.
     */
    override fun getType(opcode: Int): PacketType? = structures.get(opcode)?.type

    override fun getLength(opcode: Int): Int {
        val structure = structures.get(opcode)
        if (structure == null) {
            logger().warn("No message structure found for message with opcode {}.", opcode)
            return 0
        }
        return structure.length
    }

    override fun shouldIgnore(opcode: Int): Boolean {
        val structure = structures.get(opcode)
        if (structure == null) {
            logger().warn("No message structure found for message with opcode {}.", opcode)
            return true
        }
        return structure.ignore
    }

}
