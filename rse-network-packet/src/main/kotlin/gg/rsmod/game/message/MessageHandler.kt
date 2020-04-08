package gg.rsmod.game.message

import rs.emulator.entity.actor.player.Player
import rs.emulator.world.World

/**
 * A [MessageHandler] is responsible for executing [Message] logic on the
 * game-thread.
 *
 * @author Tom <rspsmods@gmail.com>
 */
interface MessageHandler<T : Message>
{

    /**
     * Handles the [message] on the game-thread with the ability to read and write
     * to the [Client].
     */
    fun handle(player: Player, world: World, message: T)

    /**
     * A default method to log the handlers.
     */
    fun log(player: Player, format: String, vararg args: Any)
    {

    }

}