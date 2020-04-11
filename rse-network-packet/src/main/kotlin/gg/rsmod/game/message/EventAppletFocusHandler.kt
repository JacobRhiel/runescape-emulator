package gg.rsmod.game.message

import rs.emulator.entity.actor.player.Player
import rs.emulator.packet.network.message.impl.EventAppletFocusMessage
import rs.emulator.utilities.logger
import rs.emulator.world.World

/**
 * @author Tom <rspsmods@gmail.com>
 */
class EventAppletFocusHandler : MessageHandler<EventAppletFocusMessage> {

    companion object {
        private const val UNFOCUSED_STATE = 0
        private const val FOCUSED_STATE = 1
    }

    override fun handle(player: Player, message: EventAppletFocusMessage)
    {
        logger().info("Handling applet focus")
        /*when (message.state) {
            FOCUSED_STATE -> //client.appletFocused = true
                UNFOCUSED_STATE -> //client.appletFocused = false
        }*/
    }
}