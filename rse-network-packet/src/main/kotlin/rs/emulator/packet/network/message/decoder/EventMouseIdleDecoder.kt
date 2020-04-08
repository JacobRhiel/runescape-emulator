package rs.emulator.packet.network.message.decoder

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.packet.network.message.impl.EventMouseIdleMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class EventMouseIdleDecoder : MessageDecoder<EventMouseIdleMessage>() {

    override fun decode(opcode: Int, opcodeIndex: Int, values: HashMap<String, Number>, stringValues: HashMap<String, String>): EventMouseIdleMessage
    {
        return EventMouseIdleMessage()
    }
}