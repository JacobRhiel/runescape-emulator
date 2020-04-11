package rs.emulator.packet.network.message.impl

import gg.rsmod.game.message.Message
import rs.emulator.encryption.xtea.XteaKeyService
import rs.emulator.world.map.old.region.chunk.Tile

/**
 * @author Tom <rspsmods@gmail.com>
 */
class RebuildLoginMessage(val playerIndex: Int, val tile: Tile, val playerTiles: IntArray, val xteaKeyService: XteaKeyService?) :
    Message