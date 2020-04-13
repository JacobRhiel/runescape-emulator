package gg.rsmod.util.concurrency

import mu.KLogging
import rs.emulator.utilities.logger
import java.util.concurrent.Phaser

object PhasedTask
{

    fun run(phaser: Phaser, task: () -> Unit) {
        try {
            task()
        } catch (e: Exception) {
            logger().error("Error with phased task.", e)
        } finally {
            phaser.arriveAndDeregister()
        }
    }
}