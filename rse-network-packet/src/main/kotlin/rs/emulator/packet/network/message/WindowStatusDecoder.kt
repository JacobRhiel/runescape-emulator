package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.buffer.type.DataType
import rs.emulator.packet.GamePacketReader
import rs.emulator.packet.network.message.impl.WindowStatusMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class WindowStatusDecoder : MessageDecoder<WindowStatusMessage>() {

    override fun decode(opcode: Int, reader: GamePacketReader): WindowStatusMessage
    {
        return WindowStatusMessage(
            reader.getSigned(DataType.BYTE).toInt(),
            reader.getSigned(DataType.SHORT).toInt(),
            reader.getSigned(DataType.SHORT).toInt()
        )
    }
}