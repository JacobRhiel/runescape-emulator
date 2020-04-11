package rs.emulator.packet.network.message.impl

import gg.rsmod.game.message.Message

/**
 * @author Tom <rspsmods@gmail.com>
 */
class RunClientScriptMessage(val id: Int, vararg val args: Any) : Message