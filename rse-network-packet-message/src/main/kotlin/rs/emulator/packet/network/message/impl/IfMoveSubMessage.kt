package rs.emulator.packet.network.message.impl

import gg.rsmod.game.message.Message

/**
 * @author Tom <rspsmods@gmail.com>
 */
data class IfMoveSubMessage(val from: Int, val to: Int) : Message