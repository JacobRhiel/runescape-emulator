package rs.emulator.entity.actor.player.update.block

import rs.emulator.packet.network.message.MessageValue

/**
 * @author Tom <rspsmods@gmail.com>
 */
data class UpdateBlockStructure(val bit: Int, val values: List<MessageValue>)