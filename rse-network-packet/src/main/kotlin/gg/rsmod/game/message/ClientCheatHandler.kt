package gg.rsmod.game.message

import rs.emulator.cache.definition.definition
import rs.emulator.cache.definition.entity.ObjDefinition
import rs.emulator.entity.actor.player.Player
import rs.emulator.entity.obj.toItem
import rs.emulator.packet.network.message.impl.ClientCheatMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class ClientCheatHandler : MessageHandler<ClientCheatMessage> {

    override fun handle(client: Player, message: ClientCheatMessage) {

        val values = message.command.split(" ")
        val command = values[0].toLowerCase()
        val args =
            if (values.size > 1) values.slice(1 until values.size).filter { it.isNotEmpty() }.toTypedArray() else null

        println("command sent? : $command : ${args?.contentDeepToString()}")


        if (command.startsWith("item") && args != null) {
            val id = args[0].toInt()
            val amount = if(args.size > 1) args[1].toInt() else 1
            val item = definition().find<ObjDefinition>(id).toItem(amount)
            client.storageManager.inventory().addItem(item) { empty, added ->
                client.sendDebugMessage("Spawned $added")
            }
        }

        //log(client, "Command: cmd=%s, args=%s", command, Arrays.toString(args ?: emptyArray<String>()))

        /*val handled = world.plugins.executeCommand(client, command, args)
        if (handled) {
            world.getService(LoggerService::class.java, searchSubclasses = true)?.logCommand(client, command, *args ?: emptyArray())
        } else {
            client.writeMessage("No valid command found: $command")
        }*/
    }
}