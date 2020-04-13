package gg.rsmod.game.message

import rs.emulator.packet.network.message.impl.OpHeld1Message
import rs.emulator.entity.actor.player.Player

/**
 * @author Tom <rspsmods@gmail.com>
 */
class OpHeld1Handler : MessageHandler<OpHeld1Message> {

    override fun handle(client: Player, message: OpHeld1Message) {
        @Suppress("unused")
        val componentParent = message.componentHash shr 16
        @Suppress("unused")
        val componentChild = message.componentHash and 0xFFFF

        if (message.slot < 0 /*|| message.slot >= client.inventory.capacity*/) {
            return
        }

        /*if (!client.lock.canItemInteract()) {
            return
        }

        val item = client.inventory[message.slot] ?: return

        if (item.id != message.item) {
            return
        }*/


       /* client.attr[INTERACTING_ITEM] = WeakReference(item)
        client.attr[INTERACTING_ITEM_ID] = item.id
        client.attr[INTERACTING_ITEM_SLOT] = message.slot

        if (!world.plugins.executeItem(client, item.id, 1) && world.devContext.debugItemActions) {*/
            client.sendDebugMessage("Unhandled item action: [item=${message.item}, slot=${message.slot}, option=1]")
       // }
    }
}