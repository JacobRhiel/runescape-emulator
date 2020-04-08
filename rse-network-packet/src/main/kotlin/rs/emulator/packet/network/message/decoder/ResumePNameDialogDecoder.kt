package rs.emulator.packet.network.message.decoder

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.packet.network.message.impl.ResumePNameDialogMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class ResumePNameDialogDecoder : MessageDecoder<ResumePNameDialogMessage>() {

    override fun decode(opcode: Int, opcodeIndex: Int, values: HashMap<String, Number>, stringValues: HashMap<String, String>): ResumePNameDialogMessage
    {
        val name = stringValues["name"]!!
        return ResumePNameDialogMessage(name)
    }
}