package rs.emulator.packet.network.message.impl

import gg.rsmod.game.message.Message

data class AddFriendMessage(
		val display_name: String
) : Message