package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageDecoder
import gg.rsmod.game.message.MessageStructure
import rs.emulator.packet.network.message.impl.EventKeyboardMessage
import it.unimi.dsi.fastutil.objects.ObjectArrayList
import rs.emulator.buffer.type.DataType
import rs.emulator.packet.GamePacketReader
import rs.emulator.buffer.type.signature.DataSignature

/**
 * @author Tom <rspsmods@gmail.com>
 */
class EventKeyboardDecoder : MessageDecoder<EventKeyboardMessage>() {

    override fun decode(opcode: Int, reader: GamePacketReader): EventKeyboardMessage
    {
        val events = ObjectArrayList<EventKeyboardMessage.KeyEvent>()
        while (reader.readableBytes > 0)
        {

            val pressedKey = reader.getSigned(DataType.TRI_BYTE).toInt()

            val lastPress = reader.getSigned(DataType.BYTE).toInt()

            println("key: $pressedKey, $lastPress")

            events.add(EventKeyboardMessage.KeyEvent(pressedKey, lastPress))
        }
        return EventKeyboardMessage(events)
    }

}