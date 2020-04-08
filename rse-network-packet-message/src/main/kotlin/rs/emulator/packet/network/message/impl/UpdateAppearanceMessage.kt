package rs.emulator.packet.network.message.impl

import gg.rsmod.game.message.Message

/**
 * @author Tom <rspsmods@gmail.com>
 */
class UpdateAppearanceMessage(val gender: Int, val appearance: IntArray, val colors: IntArray) :
    Message