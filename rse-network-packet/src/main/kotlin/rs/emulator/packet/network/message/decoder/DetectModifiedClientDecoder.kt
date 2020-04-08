package rs.emulator.packet.network.message.decoder

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.packet.network.message.impl.DetectModifiedClientMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class DetectModifiedClientDecoder : MessageDecoder<DetectModifiedClientMessage>() {

    override fun decode(opcode: Int, opcodeIndex: Int, values: HashMap<String, Number>, stringValues: HashMap<String, String>): DetectModifiedClientMessage
    {
        val dummy = values["dummy"]!!.toInt()
        return DetectModifiedClientMessage(dummy)
    }
}