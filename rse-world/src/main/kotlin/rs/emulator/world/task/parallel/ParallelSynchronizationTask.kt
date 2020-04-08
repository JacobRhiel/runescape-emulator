package rs.emulator.world.task.parallel

import mu.KLogging
import rs.emulator.engine.task.EngineTask
import rs.emulator.entity.actor.Actor
import rs.emulator.world.WorldRepository
import rs.emulator.world.task.*
import java.util.concurrent.ExecutorService
import java.util.concurrent.Phaser

/**
 * A [GameTask] that is responsible for sending [gg.rsmod.game.model.entity.Pawn]
 * data to [gg.rsmod.game.model.entity.Pawn]s.
 *
 * @author Tom <rspsmods@gmail.com>
 */
class ParallelSynchronizationTask(private val executor: ExecutorService) : EngineTask
{

    /**
     * The [Phaser] responsible for waiting on every [gg.rsmod.game.model.entity.Player]
     * to finish a stage in the synchronization process before beginning the next stage.
     */
    private val phaser = Phaser(1)

    override fun execute()
    {
        val worldPlayers = WorldRepository.players
        val playerCount = worldPlayers.count()

        phaser.bulkRegister(playerCount)
        worldPlayers.forEach { p ->
            val player = p.value
            submit(phaser, executor, player, PlayerPreSynchronizationTask)
        }
        phaser.arriveAndAwaitAdvance()

        phaser.bulkRegister(playerCount)
        worldPlayers.forEach { p ->
            val player = p.value
            submit(phaser, executor, player, PlayerSynchronizationTask)
        }
        phaser.arriveAndAwaitAdvance()

        phaser.bulkRegister(playerCount)
        worldPlayers.forEach { p ->
            val player = p.value
            submit(phaser, executor, player, PlayerPostSynchronizationTask)
        }
        phaser.arriveAndAwaitAdvance()

    }

    private fun <T : Actor> submit(phaser: Phaser, executor: ExecutorService, pawn: T, task: SynchronizationTask<T>) {
        executor.execute {
            try {
                task.run(pawn)
            } catch (e: Exception) {
                logger.error(e) { "Error with task ${this::class.java.simpleName} for $pawn." }
            } finally {
                phaser.arriveAndDeregister()
            }
        }
    }

    companion object : KLogging()
}