package rs.emulator.packet.network.message.impl

import gg.rsmod.game.message.Message
import rs.emulator.entity.obj.Item

/**
 * @author Tom <rspsmods@gmail.com>
 */
class UpdateInvFullMessage(val items: Array<Item?>, val componentHash: Int, val containerKey: Int) : Message
{

    constructor(interfaceId: Int, component: Int, containerKey: Int, items: Array<Item?>) : this(items, (interfaceId shl 16) or component, containerKey)

    constructor(interfaceId: Int, component: Int, items: Array<Item?>) : this(items, (interfaceId shl 16) or component, 0)

    constructor(containerKey: Int, items: Array<Item?>) : this(items, -1, containerKey)

}