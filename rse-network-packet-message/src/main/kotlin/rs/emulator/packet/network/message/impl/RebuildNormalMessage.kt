package rs.emulator.packet.network.message.impl

import gg.rsmod.game.message.Message
import rs.emulator.encryption.xtea.XteaKeyService

/**
 * @author Tom <rspsmods@gmail.com>
 */
class RebuildNormalMessage(val x: Int, val z: Int, val xteaKeyService: XteaKeyService?) : Message