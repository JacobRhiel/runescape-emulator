package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.buffer.type.DataType
import rs.emulator.packet.GamePacketReader
import rs.emulator.packet.network.message.impl.MoveMinimapClickMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class MoveMinimapClickDecoder : MessageDecoder<MoveMinimapClickMessage>() {

    override fun decode(opcode: Int, reader: GamePacketReader): MoveMinimapClickMessage
    {
        val x = reader.getSigned(DataType.SHORT).toInt()
        val type = reader.getSigned(DataType.BYTE).toInt()
        val z = reader.getSigned(DataType.SHORT).toInt()

        return MoveMinimapClickMessage(x, z, type)
    }
}