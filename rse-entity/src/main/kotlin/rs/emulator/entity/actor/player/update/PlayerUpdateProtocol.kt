package rs.emulator.entity.actor.player.update

import rs.emulator.entity.actor.player.Player
import rs.emulator.entity.actor.update.ActorUpdateProtocol

/**
 *
 * @author Chk
 */
class PlayerUpdateProtocol : ActorUpdateProtocol
{

    /**
     * The players in our viewport, including ourselves. This list should not
     * be used outside of our synchronization task.
     */
    val gpiLocalPlayers = arrayOfNulls<Player>(2048)

    /**
     * The indices of any possible local player in the world.
     */
    val gpiLocalIndexes = IntArray(2048)

    /**
     * The current local player count.
     */
    var gpiLocalCount = 0

    /**
     * The indices of players outside of our viewport in the world.
     */
    val gpiExternalIndexes = IntArray(2048)

    /**
     * The amount of players outside of our viewport.
     */
    var gpiExternalCount = 0

    /**
     * The inactivity flags for players.
     */
    val gpiInactivityFlags = IntArray(2048)

    /**
     * GPI tile hash multipliers.
     *
     * The player synchronization task will send [Tile.x] and [Tile.z] as 13-bit
     * values, which is 2^13 (8192). To send a player position higher than said
     * value in either direction, we must also send a multiplier.
     */
    val gpiTileHashMultipliers = IntArray(2048)

    internal lateinit var tiles: IntArray

    fun initializeGPI(player: Player)
    {

        val index = player.index

        gpiLocalPlayers[index] = player
        gpiLocalIndexes[gpiLocalCount++] = index

        for (i in 1 until 2048) {
            if (i == index) {
                continue
            }
            gpiExternalIndexes[gpiExternalCount++] = i
            gpiTileHashMultipliers[i] = if(i == index) player.tile.asTileHashMultiplier else 0
        }

        tiles = IntArray(gpiTileHashMultipliers.size)

        System.arraycopy(gpiTileHashMultipliers, 0, tiles, 0, tiles.size)

    }



}