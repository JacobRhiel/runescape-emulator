package gg.rsmod.game.message

import rs.emulator.cache.definition.definition
import rs.emulator.cache.definition.entity.ObjDefinition
import rs.emulator.entity.actor.player.Player
import rs.emulator.entity.obj.createItem
import rs.emulator.model.widget.InterfaceEvent
import rs.emulator.packet.network.message.impl.ClientCheatMessage
import rs.emulator.packet.network.message.impl.LogoutFullMessage
import java.util.*

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

        if(command.startsWith("log")) {
            client.channel.write(LogoutFullMessage())
        }

        if (command.startsWith("item") && args != null) {
            val id = args[0].toInt()
            val amount = if (args.size > 1) args[1].toInt() else 1
            val item = definition().find<ObjDefinition>(id).createItem(amount)
            client.storageManager.inventory().addItem(item) { empty, added ->
                client.sendDebugMessage("Spawned $added")
            }
        } else if (command.startsWith("obank")) {
            client.sendDebugMessage("Opening bank")
            client.channel.write(
                client.interfaces.createDisplayRequest(
                    548,
                    22,
                    12
                )
            )
            client.channel.write(client.interfaces.createDisplayRequest(
                interfaceId = 15,
                child = 64,
                parent = 548
            ))
            client.setInterfaceEvents(interfaceId = 12, component = 9, range = 10..10, settings = EnumSet.of(InterfaceEvent.IF_BUTTON1, InterfaceEvent.IF_BUTTON2))
            client.setInterfaceEvents(interfaceId = 12, component = 9, range = 11..19, settings = EnumSet.of(InterfaceEvent.IF_BUTTON1, InterfaceEvent.IF_BUTTON2))
            client.setInterfaceEvents(interfaceId = 12, component = 11, range = 0..815, settings = EnumSet.of(
                InterfaceEvent.IF_BUTTON1,
                InterfaceEvent.IF_BUTTON2,
                InterfaceEvent.IF_BUTTON3,
                InterfaceEvent.IF_BUTTON4,
                InterfaceEvent.IF_BUTTON5,
                InterfaceEvent.IF_BUTTON6,
                InterfaceEvent.IF_BUTTON7,
                InterfaceEvent.IF_BUTTON8,
                InterfaceEvent.EXAMINE
            ))
            client.setInterfaceEvents(interfaceId = 12, component = 11, range = 825..833, settings = EnumSet.of(InterfaceEvent.IF_BUTTON1, InterfaceEvent.IF_BUTTON2))
            client.setInterfaceEvents(interfaceId = 12, component = 11, range = 834..843, settings = EnumSet.of(InterfaceEvent.IF_BUTTON1, InterfaceEvent.IF_BUTTON2))
            client.setInterfaceEvents(interfaceId = 12, component = 15, range = 0..815, settings = EnumSet.of(InterfaceEvent.IF_BUTTON1, InterfaceEvent.IF_BUTTON2))
            client.setInterfaceEvents(interfaceId = 12, component = 45, range = 1..816, settings = EnumSet.of(InterfaceEvent.IF_BUTTON1, InterfaceEvent.IF_BUTTON2))
            client.setInterfaceEvents(interfaceId = 12, component = 48, range = 0..3, settings = EnumSet.of(InterfaceEvent.IF_BUTTON1, InterfaceEvent.IF_BUTTON2))

            client.setInterfaceEvents(interfaceId = 15, component = 3, range = 0..27, settings = EnumSet.of(
                InterfaceEvent.IF_BUTTON1,
                InterfaceEvent.IF_BUTTON2,
                InterfaceEvent.IF_BUTTON3,
                InterfaceEvent.IF_BUTTON4,
                InterfaceEvent.IF_BUTTON5,
                InterfaceEvent.IF_BUTTON6,
                InterfaceEvent.IF_BUTTON7,
                InterfaceEvent.IF_BUTTON8,
                InterfaceEvent.EXAMINE
            ))
            client.setInterfaceEvents(interfaceId = 15, component = 11, range = 0..27, settings = EnumSet.of(
                InterfaceEvent.IF_BUTTON1,
                InterfaceEvent.IF_BUTTON2,
                InterfaceEvent.IF_BUTTON3,
                InterfaceEvent.IF_BUTTON4,
                InterfaceEvent.IF_BUTTON5,
                InterfaceEvent.IF_BUTTON6,
                InterfaceEvent.IF_BUTTON7,
                InterfaceEvent.IF_BUTTON8,
                InterfaceEvent.EXAMINE
            ))
            client.setInterfaceEvents(interfaceId = 15, component = 4, range = 0..27, settings = EnumSet.of(
                InterfaceEvent.IF_BUTTON1,
                InterfaceEvent.IF_BUTTON2,
                InterfaceEvent.IF_BUTTON3,
                InterfaceEvent.IF_BUTTON4,
                InterfaceEvent.IF_BUTTON5,
                InterfaceEvent.IF_BUTTON6,
                InterfaceEvent.IF_BUTTON7,
                InterfaceEvent.IF_BUTTON8,
                InterfaceEvent.EXAMINE
            ))
            /*client.setInterfaceEvents(interfaceId = 12, component = 13, range = 825..833, settings = 2)
            client.setInterfaceEvents(interfaceId = 12, component = 13, range = 834..843, settings = 1048576)
            client.setInterfaceEvents(interfaceId = 12, component = 11, range = 10..10, settings = 1048578)
            client.setInterfaceEvents(interfaceId = 12, component = 11, range = 11..19, settings = 1179714)
            client.setInterfaceEvents(interfaceId = 15, component = 3, range = 0..27, settings = 1181694)
            client.setInterfaceEvents(interfaceId = 15, component = 10, range = 0..27, settings = 1054)
            client.setInterfaceEvents(interfaceId = 12, component = 47, range = 1..816, settings = 2)
            client.setInterfaceEvents(interfaceId = 12, component = 50, range = 0..3, settings = 2)*/
        } else if(command.startsWith("sbank") && args != null) {
            val id = args[0].toInt()
            val amount = if (args.size > 1) args[1].toInt() else 1
            val tab = if(args.size > 2) args[2].toInt() else 0
            val item = definition().find<ObjDefinition>(id).createItem(amount)
            client.storageManager.bank().addItem(item, tab)
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