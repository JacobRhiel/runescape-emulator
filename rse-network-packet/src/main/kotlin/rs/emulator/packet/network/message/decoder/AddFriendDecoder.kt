package rs.emulator.packet.network.message.decoder

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.packet.network.message.impl.AddFriendMessage

class AddFriendDecoder : MessageDecoder<AddFriendMessage>() {

	override fun decode(opcode: Int, opcodeIndex: Int, values: HashMap<String, Number>, stringValues: HashMap<String, String>): AddFriendMessage
	{
		val name = stringValues["display_name"]!!
		return AddFriendMessage(name)
	}
}