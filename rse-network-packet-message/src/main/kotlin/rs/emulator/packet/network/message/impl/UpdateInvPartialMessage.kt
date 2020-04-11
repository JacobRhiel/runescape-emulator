package rs.emulator.packet.network.message.impl

import gg.rsmod.game.message.Message

/**
 * @author Tom <rspsmods@gmail.com>
 */
class UpdateInvPartialMessage(val oldItems: HashMap<Int, Int>, val newItems: HashMap<Int, Int>, val componentHash: Int, val containerKey: Int) :
    Message
{

    constructor(interfaceId: Int, component: Int, containerKey: Int, oldItems: HashMap<Int, Int>, newItems: HashMap<Int, Int>) : this(oldItems, newItems, (interfaceId shl 16) or component, containerKey)

    constructor(interfaceId: Int, component: Int, oldItems: HashMap<Int, Int>, newItems: HashMap<Int, Int>) : this(oldItems, newItems, (interfaceId shl 16) or component, 0)

    constructor(containerKey: Int, oldItems: HashMap<Int, Int>, newItems: HashMap<Int, Int>) : this(oldItems, newItems, -1, containerKey)

}