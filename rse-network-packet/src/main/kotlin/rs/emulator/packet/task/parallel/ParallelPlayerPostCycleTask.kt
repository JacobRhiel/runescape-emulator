package rs.emulator.packet.task.parallel

import gg.rsmod.util.concurrency.PhasedTask
import rs.emulator.engine.task.EngineTask
import rs.emulator.world.WorldRepository
import java.util.concurrent.ExecutorService
import java.util.concurrent.Phaser

/**
 * A [GameTask] responsible for executing [gg.rsmod.game.model.entity.Pawn]
 * "post" cycle logic, in parallel. Post cycle means that the this task
 * will be handled near the end of the cycle, after the synchronization
 * tasks.
 *
 * @author Tom <rspsmods@gmail.com>
 */
class ParallelPlayerPostCycleTask(private val executor: ExecutorService) : EngineTask
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
                    p.channel.flush()
                   // p.postCycle()
                }
            }
        }
        phaser.arriveAndAwaitAdvance()
    }
}