package rs.emulator.world

import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
import rs.emulator.entity.actor.player.Player

/**
 *
 * @author Chk
 */
object WorldRepository
{

    val players = Int2ObjectArrayMap<Player>()

}