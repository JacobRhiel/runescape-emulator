package rs.emulator.entity.actor.player.viewport

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
import rs.emulator.entity.actor.player.Player

/**
 *
 * @author Chk
 */
class Viewport
{

    val localPlayers = Int2ObjectOpenHashMap<Player>()

    companion object
    {

        //8 being chunk size, 13 being chunks per region
        //refer to rse-world-map -> RegionChunk and Region for const val's.
        const val MAX_VIEWPORT = 8 * 13

    }

}