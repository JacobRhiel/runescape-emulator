package gg.rsmod.game.message

import rs.emulator.packet.network.message.impl.IfButtonMessage
import rs.emulator.entity.actor.player.Player
import rs.emulator.packet.network.message.ChatMessageType

/**
 * @author Tom <rspsmods@gmail.com>
 */
class IfButton1Handler : MessageHandler<IfButtonMessage> {

    override fun handle(client: Player, message: IfButtonMessage) {
        val interfaceId = message.hash shr 16
        val component = message.hash and 0xFFFF
        val option = message.option + 1

        /*if (!client.interfaces.isVisible(interfaceId)) {
            return
        }

        log(client, "Click button: component=[%d:%d], option=%d, slot=%d, item=%d", interfaceId, component, option, message.slot, message.item)

        client.attr[INTERACTING_OPT_ATTR] = option
        client.attr[INTERACTING_ITEM_ID] = message.item
        client.attr[INTERACTING_SLOT_ATTR] = message.slot*/

        /*if (world.plugins.executeButton(client, interfaceId, component)) {
            return
        }*/

       // if (world.devContext.debugButtons) {
            client.sendDebugMessage("Unhandled button action: [component=[$interfaceId:$component], option=$option, slot=${message.slot}, item=${message.item}]")
       // }
    }
}