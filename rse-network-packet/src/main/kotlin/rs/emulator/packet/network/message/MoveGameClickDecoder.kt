package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.buffer.type.DataType
import rs.emulator.packet.GamePacketReader
import rs.emulator.packet.network.message.impl.MoveGameClickMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class MoveGameClickDecoder : MessageDecoder<MoveGameClickMessage>() {

    override fun decode(opcode: Int, reader: GamePacketReader): MoveGameClickMessage
    {
        val x = reader.getUnsigned(DataType.SHORT).toInt()
        val type = reader.getSigned(DataType.BYTE).toInt()
        val z = reader.getUnsigned(DataType.SHORT).toInt()

        return MoveGameClickMessage(x, z, type)
    }
}