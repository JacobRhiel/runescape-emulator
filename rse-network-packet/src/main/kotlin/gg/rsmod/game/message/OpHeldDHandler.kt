package gg.rsmod.game.message

import rs.emulator.packet.network.message.impl.OpHeldDMessage
import rs.emulator.entity.actor.player.Player
import rs.emulator.utilities.logger

/**
 * @author Tom <rspsmods@gmail.com>
 */
class OpHeldDHandler : MessageHandler<OpHeldDMessage> {

    override fun handle(client: Player, message: OpHeldDMessage) {
        val interfaceId = message.componentHash shr 16
        val component = message.componentHash and 0xFFFF
        val fromSlot = message.srcSlot
        val toSlot = message.dstSlot

        logger().info("Swap component item: interface={} component={}, src_slot={}, dst_slot={}", interfaceId, component, fromSlot, toSlot)

       /* client.attr[INTERACTING_ITEM_SLOT] = fromSlot
        client.attr[OTHER_ITEM_SLOT_ATTR] = toSlot

        val swapped = world.plugins.executeComponentItemSwap(client, interfaceId, component)
        if (!swapped && world.devContext.debugButtons) {
            client.writeMessage("Unhandled component swap: [component=[$interfaceId:$component], from_slot=$fromSlot, to_slot=$toSlot]")
        }*/
    }
}