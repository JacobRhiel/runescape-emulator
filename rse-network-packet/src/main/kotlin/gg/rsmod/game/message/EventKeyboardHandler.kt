package gg.rsmod.game.message

import rs.emulator.packet.network.message.impl.EventKeyboardMessage
import rs.emulator.entity.actor.player.Player
import rs.emulator.world.World

/**
 * @author Tom <rspsmods@gmail.com>
 */
class EventKeyboardHandler : MessageHandler<EventKeyboardMessage>
{

    override fun handle(player: Player, message: EventKeyboardMessage)
    {

        println("keyboard event: " + message.events.toTypedArray().contentDeepToString())

    }

}