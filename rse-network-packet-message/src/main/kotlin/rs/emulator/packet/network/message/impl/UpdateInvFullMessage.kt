package rs.emulator.packet.network.message.impl

import gg.rsmod.game.message.Message

/**
 * @author Tom <rspsmods@gmail.com>
 */
class UpdateInvFullMessage(val items: HashMap<Int, Int>, val componentHash: Int, val containerKey: Int) : Message
{

    constructor(interfaceId: Int, component: Int, containerKey: Int, items: HashMap<Int, Int>) : this(items, (interfaceId shl 16) or component, containerKey)

    constructor(interfaceId: Int, component: Int, items: HashMap<Int, Int>) : this(items, (interfaceId shl 16) or component, 0)

    constructor(containerKey: Int, items: HashMap<Int, Int>) : this(items, -1, containerKey)

}