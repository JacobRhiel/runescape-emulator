package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.buffer.type.DataType
import rs.emulator.packet.GamePacketReader
import rs.emulator.packet.network.message.impl.EventAppletFocusMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class EventAppletFocusDecoder : MessageDecoder<EventAppletFocusMessage>() {

    override fun decode(opcode: Int, reader: GamePacketReader): EventAppletFocusMessage
    {
        val state = reader.getSigned(DataType.BYTE).toInt()
        return EventAppletFocusMessage(state)
    }
}