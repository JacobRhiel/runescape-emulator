package gg.rsmod.game.message

import rs.emulator.packet.network.message.impl.WindowStatusMessage
import rs.emulator.entity.actor.player.Player
import rs.emulator.packet.network.message.impl.IfOpenTopMessage
import rs.emulator.world.World

/**
 * @author Tom <rspsmods@gmail.com>
 */
class WindowStatusHandler : MessageHandler<WindowStatusMessage> {

    override fun handle(player: Player, world: World, message: WindowStatusMessage)
    {
       // client.clientWidth = message.width
       // client.clientHeight = message.height
       // client.attr[DISPLAY_MODE_CHANGE_ATTR] = message.mode
        //world.plugins.executeWindowStatus(client)
        player.channel.write(IfOpenTopMessage(548))
    }
}