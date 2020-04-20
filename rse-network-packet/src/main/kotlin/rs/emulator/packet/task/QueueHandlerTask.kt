package rs.emulator.packet.task

import rs.emulator.engine.task.EngineTask
import rs.emulator.world.WorldRepository

class QueueHandlerTask : EngineTask {

    override fun execute()
    {
        var playerQueues = 0
        var npcQueues = 0

        WorldRepository.players.forEach { player ->
            player.queues.cycle()
            playerQueues += player.queues.size
        }

        /*world.npcs.forEach { npc ->
            npc.queues.cycle()
            npcQueues += npc.queues.size
        }*/
    }
}