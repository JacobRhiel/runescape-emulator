package rs.emulator.entity.actor.player.viewport

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
import rs.emulator.entity.actor.player.Player

/**
 *
 * @author Chk
 */
class Viewport
{

    private val idlePlayerFlags = IntArray(2048)

    val localPlayers = Int2ObjectOpenHashMap<Player>()

    fun coordinateOf(index: Int) = localPlayers.keys.indexOf(index)

    fun isSlotFree(index: Int): Boolean = idlePlayerFlags[index] and 0x1 == 0

    fun isSlotBlocked(index: Int) : Boolean = idlePlayerFlags[index] and 0x1 != 0

    fun setIdle(index: Int) = idlePlayerFlags[index].apply { or(2) }

    fun shiftSlots() = idlePlayerFlags.forEachIndexed { index, _ -> idlePlayerFlags[index] = idlePlayerFlags[index] shr 1 }

    companion object
    {

        //8 being chunk size, 13 being chunks per region
        //refer to rse-world-map -> RegionChunk and Region for const val's.
        const val MAX_VIEWPORT = 8 * 13

    }

}