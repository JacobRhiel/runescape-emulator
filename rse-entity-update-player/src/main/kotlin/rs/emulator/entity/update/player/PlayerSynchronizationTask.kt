package rs.emulator.entity.update.player

import rs.emulator.engine.task.EngineTask
import rs.emulator.world.WorldRepository

/**
 *
 * @author Chk
 */
class PlayerSynchronizationTask : EngineTask
{

    override fun execute()
    {

        WorldRepository.players.forEach {

            val player = it.value

            val viewport = player.viewport

            val localPlayers = viewport.localPlayers



        }

    }

}