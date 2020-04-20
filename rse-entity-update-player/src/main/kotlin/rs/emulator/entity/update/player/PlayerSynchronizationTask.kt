package rs.emulator.entity.update.player

import rs.emulator.engine.task.EngineTask
import rs.emulator.entity.actor.player.Player
import rs.emulator.entity.actor.player.viewport.Viewport
import rs.emulator.entity.update.sync.SynchronizationSegmentFactory
import rs.emulator.world.WorldRepository

/**
 *
 * @author Chk
 */
class PlayerSynchronizationTask : PlayerSynchronizationSegmentFactory()
{

   /* override fun execute()
    {

        WorldRepository.players.forEach {player ->

            val viewport = player.viewport

            val localPlayers = viewport.localPlayers

        }

    }*/

    private fun processLocals(player: Player, viewport: Viewport, nsn0: Boolean)
    {

        var skipCount = -1

        val localPlayers = viewport.localPlayers.values

        localPlayers.forEachIndexed { index, local ->

            if(local == null || nsn0 == viewport.isSlotBlocked(index))
                return@forEachIndexed



        }

    }

}