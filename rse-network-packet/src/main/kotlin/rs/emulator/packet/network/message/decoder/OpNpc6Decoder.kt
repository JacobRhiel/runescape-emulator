package rs.emulator.packet.network.message.decoder

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.packet.network.message.impl.OpNpc6Message

/**
 * @author Tom <rspsmods@gmail.com>
 */
class OpNpc6Decoder : MessageDecoder<OpNpc6Message>() {

    override fun decode(opcode: Int, opcodeIndex: Int, values: HashMap<String, Number>, stringValues: HashMap<String, String>): OpNpc6Message
    {
        val npcId = values["npc_id"]!!.toInt()
        return OpNpc6Message(npcId)
    }
}