@file:Suppress("UnstableApiUsage")

package rs.emulator.engine.service

import com.google.common.util.concurrent.AbstractScheduledService
import com.google.inject.Inject
import com.google.inject.Singleton
import kotlinx.coroutines.*
import rs.emulator.engine.task.EngineTask
import java.util.concurrent.TimeUnit

/**
 *
 * @author Chk
 */
@Singleton class CyclicEngineService @Inject constructor() : AbstractScheduledService()
{

    private val tasks = mutableListOf<EngineTask>()

    val executor = scheduler().let { executor().asCoroutineDispatcher() }

    override fun scheduler(): Scheduler = Scheduler.newFixedRateSchedule(0, 600, TimeUnit.MILLISECONDS)

    override fun runOneIteration()
    {

        tasks.forEach { task ->
            try {
                task.execute()
            } catch (e: Exception) {
                //.error("Error with task ${task.javaClass.simpleName}.", e)
                e.printStackTrace()
            }
           // taskTimes[task.javaClass] = System.currentTimeMillis() - taskStart
        }

    }

    fun submitTask(task: EngineTask)
    {
        tasks.add(task)
    }

    fun submitAsync(task: EngineTask)
    {

    }

}