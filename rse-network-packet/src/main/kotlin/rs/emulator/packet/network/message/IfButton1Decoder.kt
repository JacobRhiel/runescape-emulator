package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.buffer.type.DataType
import rs.emulator.packet.GamePacketReader
import rs.emulator.packet.network.message.impl.IfButtonMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class IfButton1Decoder : MessageDecoder<IfButtonMessage>() {

    override fun decode(opcode: Int, reader: GamePacketReader): IfButtonMessage
    {
        val hash = reader.getSigned(DataType.INT).toInt()
        val slot = reader.getSigned(DataType.SHORT).toInt()
        val item = reader.getSigned(DataType.SHORT).toInt()
        return IfButtonMessage(
            hash = hash,
            option = opcode,
            slot = if (slot == 0xFFFF) -1 else slot,
            item = if (item == 0xFFFF) -1 else item
        )
    }
}