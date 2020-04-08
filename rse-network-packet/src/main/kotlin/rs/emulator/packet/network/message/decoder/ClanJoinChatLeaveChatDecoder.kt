package rs.emulator.packet.network.message.decoder

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.packet.network.message.impl.ClanJoinChatLeaveChatMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class ClanJoinChatLeaveChatDecoder : MessageDecoder<ClanJoinChatLeaveChatMessage>() {

    override fun decode(opcode: Int, opcodeIndex: Int, values: HashMap<String, Number>, stringValues: HashMap<String, String>): ClanJoinChatLeaveChatMessage
    {
        val name = stringValues["name"]!!
        return ClanJoinChatLeaveChatMessage(name)
    }
}