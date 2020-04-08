package rs.emulator.packet.network.message.decoder

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.packet.network.message.impl.ResumePCountDialogMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class ResumePCountDialogDecoder : MessageDecoder<ResumePCountDialogMessage>() {

    override fun decode(opcode: Int, opcodeIndex: Int, values: HashMap<String, Number>, stringValues: HashMap<String, String>): ResumePCountDialogMessage
    {
        val input = values["input"]!!.toInt()
        return ResumePCountDialogMessage(input)
    }
}