package gg.rsmod.game.message

import rs.emulator.cache.definition.definition
import rs.emulator.cache.definition.entity.obj.ObjDefinition
import rs.emulator.packet.network.message.impl.OpHeld2Message
import rs.emulator.entity.actor.player.Player
import rs.emulator.entity.obj.createItem
import rs.emulator.storables.Item

/**
 * @author Tom <rspsmods@gmail.com>
 */
class OpHeld2Handler : MessageHandler<OpHeld2Message> {

    override fun handle(client: Player, message: OpHeld2Message) {
        @Suppress("unused")
        val interfaceId = message.componentHash shr 16
        @Suppress("unused")
        val component = message.componentHash and 0xFFFF

        client.sendDebugMessage("Item action 2: id=${message.item}, slot=${message.slot}, component=($interfaceId, $component), inventory=(x, x)")

        val item = definition().find<ObjDefinition>(message.item).createItem()

        item.attributes["equip_slot"] = 3

        val inv = client.storageManager.inventory()
        client.storageManager.equipment().addItem(item) {
            commit {
                if (!inv.isFull()) {
                    addItems()
                    removed.forEach { inv.removeItem(it.first) }
                    removeItems()
                    clearPlaceholders()
                    fireStateChange()
                }
            }
        }

        /*if (message.slot < 0 || message.slot >= client.inventory.capacity) {
            return
        }

        if (!client.lock.canItemInteract()) {
            return
        }

        val item = client.inventory[message.slot] ?: return

        if (item.id != message.item) {
            return
        }

        log(client, "Item action 2: id=%d, slot=%d, component=(%d, %d), inventory=(%d, %d)",
                message.item, message.slot, interfaceId, component, item.id, item.amount)

        client.attr[INTERACTING_ITEM] = WeakReference(item)
        client.attr[INTERACTING_ITEM_ID] = item.id
        client.attr[INTERACTING_ITEM_SLOT] = message.slot

        val result = EquipAction.equip(client, item, message.slot)
        if (result == EquipAction.Result.UNHANDLED && world.devContext.debugItemActions) {
            client.writeMessage("Unhandled item action: [item=${item.id}, slot=${message.slot}, option=2]")
        }*/
    }
}