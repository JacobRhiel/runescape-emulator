package rs.emulator.packet.network.message.decoder

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.packet.network.message.impl.OpPlayer7Message

/**
 * @author Triston Plummer ("Dread")
 */
class OpPlayer7Decoder : MessageDecoder<OpPlayer7Message>() {

    override fun decode(opcode: Int, opcodeIndex: Int, values: HashMap<String, Number>, stringValues: HashMap<String, String>): OpPlayer7Message
    {
        val index = values["index"]!!.toInt()
        return OpPlayer7Message(index)
    }
}