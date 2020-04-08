package rs.emulator.packet.network.message.decoder

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.packet.network.message.impl.CloseModalMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class CloseModalDecoder : MessageDecoder<CloseModalMessage>() {

    override fun decode(opcode: Int, opcodeIndex: Int, values: HashMap<String, Number>, stringValues: HashMap<String, String>): CloseModalMessage
    {
        return CloseModalMessage()
    }
}