package rs.emulator.packet.network.message.decoder

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.packet.network.message.impl.ResumePStringDialogMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class ResumePStringDialogDecoder : MessageDecoder<ResumePStringDialogMessage>() {

    override fun decode(opcode: Int, opcodeIndex: Int, values: HashMap<String, Number>, stringValues: HashMap<String, String>): ResumePStringDialogMessage
    {
        val input = stringValues["input"]!!
        return ResumePStringDialogMessage(input)
    }
}