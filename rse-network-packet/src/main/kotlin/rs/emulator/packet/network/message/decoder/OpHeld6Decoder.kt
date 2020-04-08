package rs.emulator.packet.network.message.decoder

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.packet.network.message.impl.OpHeld6Message

/**
 * @author Tom <rspsmods@gmail.com>
 */
class OpHeld6Decoder : MessageDecoder<OpHeld6Message>() {

    override fun decode(opcode: Int, opcodeIndex: Int, values: HashMap<String, Number>, stringValues: HashMap<String, String>): OpHeld6Message
    {
        val item = values["item"]!!.toInt()
        return OpHeld6Message(item)
    }
}