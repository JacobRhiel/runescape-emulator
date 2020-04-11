package gg.rsmod.game.message

import gg.rsmod.game.message.MessageHandler
import rs.emulator.entity.actor.player.Player
import rs.emulator.packet.network.message.impl.ClientCheatMessage
import rs.emulator.world.World
import java.util.Arrays

/**
 * @author Tom <rspsmods@gmail.com>
 */
class ClientCheatHandler : MessageHandler<ClientCheatMessage> {

    override fun handle(client: Player, message: ClientCheatMessage)
    {

        val values = message.command.split(" ")
        val command = values[0].toLowerCase()
        val args = if (values.size > 1) values.slice(1 until values.size).filter { it.isNotEmpty() }.toTypedArray() else null

        println("command sent? : $command : ${args?.contentDeepToString()}")

        //log(client, "Command: cmd=%s, args=%s", command, Arrays.toString(args ?: emptyArray<String>()))

        /*val handled = world.plugins.executeCommand(client, command, args)
        if (handled) {
            world.getService(LoggerService::class.java, searchSubclasses = true)?.logCommand(client, command, *args ?: emptyArray())
        } else {
            client.writeMessage("No valid command found: $command")
        }*/
    }
}