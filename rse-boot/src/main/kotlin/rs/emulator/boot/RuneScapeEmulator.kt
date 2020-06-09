@file:Suppress("UnstableApiUsage")

package rs.emulator.boot

import com.google.common.util.concurrent.ServiceManager
import com.google.common.util.concurrent.ThreadFactoryBuilder
import com.google.inject.Guice
import com.google.inject.Inject
import com.google.inject.Injector
import com.google.inject.Singleton
import rs.emulator.database.service.JDBCPoolingService
import rs.emulator.encryption.rsa.service.RSAService
import rs.emulator.engine.service.CyclicEngineService
import rs.emulator.fileserver.FileStoreService
import rs.emulator.packet.PacketService
import rs.emulator.packet.task.QueueHandlerTask
import rs.emulator.packet.task.parallel.ParallelPlayerCycleTask
import rs.emulator.packet.task.parallel.ParallelPlayerPostCycleTask
import rs.emulator.packet.task.parallel.ParallelSynchronizationTask
import rs.emulator.utilities.injector.injector
import rs.emulator.world.map.WorldMap
import rs.emulator.world.service.WorldService
import java.util.concurrent.Executors

/**
 *
 * @author Chk
 */
@Singleton
class RuneScapeEmulator @Inject constructor()
{

    private lateinit var injector: Injector

    private lateinit var manager: ServiceManager

    @Inject private lateinit var databaseService: JDBCPoolingService

    @Inject private lateinit var rsaService: RSAService

    @Inject private lateinit var worldService: WorldService

    @Inject private lateinit var fileStoreService: FileStoreService

    @Inject private lateinit var packetService: PacketService

    @Inject private lateinit var engineService: CyclicEngineService

    @Inject private lateinit var worldMap: WorldMap

    fun start()
    {

        val executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors(), ThreadFactoryBuilder()
            .setNameFormat("game-task-thread")
            .build())

        val tasks = listOf(
            QueueHandlerTask(),
            ParallelPlayerCycleTask(executor),
            ParallelSynchronizationTask(executor),
            ParallelPlayerPostCycleTask(executor)
        )

        tasks.forEach { engineService.submitTask(it) }

        WorldMap.INSTANCE = worldMap

        manager = ServiceManager(
            listOf(/*databaseService, */rsaService, fileStoreService, packetService, worldService, engineService)
        )

        manager.startAsync().awaitHealthy()

    }

    companion object
    {

        @JvmStatic
        fun main(args: Array<String>)
        {

            val rse = RuneScapeEmulator()

            rse.injector = Guice.createInjector()

            injector = rse.injector

            rse.injector.getInstance(RuneScapeEmulator::class.java).start()

        }

    }

}