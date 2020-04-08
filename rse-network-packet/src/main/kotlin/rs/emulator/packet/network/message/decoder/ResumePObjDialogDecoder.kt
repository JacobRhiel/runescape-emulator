package rs.emulator.packet.network.message.decoder

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.packet.network.message.impl.ResumePObjDialogMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class ResumePObjDialogDecoder : MessageDecoder<ResumePObjDialogMessage>() {

    override fun decode(opcode: Int, opcodeIndex: Int, values: HashMap<String, Number>, stringValues: HashMap<String, String>): ResumePObjDialogMessage
    {
        val item = values["item"]!!.toInt()
        return ResumePObjDialogMessage(item)
    }
}