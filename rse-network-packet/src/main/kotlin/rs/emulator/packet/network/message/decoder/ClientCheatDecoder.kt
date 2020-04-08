package rs.emulator.packet.network.message.decoder

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.packet.network.message.impl.ClientCheatMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class ClientCheatDecoder : MessageDecoder<ClientCheatMessage>() {

    override fun decode(opcode: Int, opcodeIndex: Int, values: HashMap<String, Number>, stringValues: HashMap<String, String>): ClientCheatMessage
    {
        return ClientCheatMessage(stringValues["command"]!!)
    }
}
