package gg.rsmod.game.message.handler

import gg.rsmod.game.message.MessageHandler
import rs.emulator.packet.network.message.impl.AddFriendMessage
import gg.rsmod.game.model.World
import gg.rsmod.game.model.entity.Client

class AddFriendHandler : MessageHandler<AddFriendMessage>
{

	override fun handle(client: Client, world: World, message: AddFriendMessage)
	{

		val friendToAdd = world.getPlayerForName(message.display_name) ?: return

		/*val friendAdded = client.socialProfile.addFriend(message.display_name)

		println("friend: $friendAdded")

		client.updateSocialLists()*/

	}
}