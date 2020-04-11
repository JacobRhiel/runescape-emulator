package rs.emulator.packet.task.parallel

import gg.rsmod.util.concurrency.PhasedTask
import rs.emulator.engine.task.EngineTask
import rs.emulator.world.WorldRepository
import java.util.concurrent.ExecutorService
import java.util.concurrent.Phaser

/**
 * A [GameTask] responsible for executing [gg.rsmod.game.model.entity.Pawn]
 * cycle logic, in parallel.
 *
 * @author Tom <rspsmods@gmail.com>
 */
class ParallelPlayerCycleTask(private val executor: ExecutorService) : EngineTask
{

    private val phaser = Phaser(1)

    override fun execute()
    {

        val worldPlayers = WorldRepository.players
        val playerCount = worldPlayers.count()

        phaser.bulkRegister(playerCount)
        worldPlayers.values.forEach { p ->
            executor.execute {
                    PhasedTask.run(phaser) {
                    //p.cycle()
                }
            }
        }
        phaser.arriveAndAwaitAdvance()
    }
}