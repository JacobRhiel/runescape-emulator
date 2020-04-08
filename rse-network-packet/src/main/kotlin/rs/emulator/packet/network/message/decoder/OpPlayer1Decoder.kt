package rs.emulator.packet.network.message.decoder

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.packet.network.message.impl.OpPlayer1Message

/**
 * @author Triston Plummer ("Dread")
 */
class OpPlayer1Decoder : MessageDecoder<OpPlayer1Message>() {

    override fun decode(opcode: Int, opcodeIndex: Int, values: HashMap<String, Number>, stringValues: HashMap<String, String>): OpPlayer1Message
    {
        val index = values["index"]!!.toInt()
        return OpPlayer1Message(index)
    }
}