@file:Suppress("UnstableApiUsage")

package rs.emulator.boot

import com.google.common.util.concurrent.ServiceManager
import com.google.common.util.concurrent.ThreadFactoryBuilder
import com.google.inject.Guice
import com.google.inject.Inject
import com.google.inject.Injector
import com.google.inject.Singleton
import rs.emulator.cache.FileStore
import rs.emulator.cache.definition.DefinitionRepository
import rs.emulator.cache.index.IndexConfig
import rs.emulator.configuration.CacheConfiguration
import rs.emulator.configuration.environment.RSEEnvironment
import rs.emulator.database.service.JDBCPoolingService
import rs.emulator.encryption.rsa.service.RSAService
import rs.emulator.engine.service.CyclicEngineService
import rs.emulator.fileserver.FileStoreService
import rs.emulator.packet.PacketService
import rs.emulator.packet.configuration.PacketConfiguration
import rs.emulator.world.service.WorldService
import rs.emulator.packet.task.QueueHandlerTask
import rs.emulator.packet.task.parallel.*
import rs.emulator.world.map.WorldMap
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

    @Inject
    private lateinit var fileStoreService: FileStoreService

    @Inject
    private lateinit var environment: RSEEnvironment

    @Inject
    private lateinit var cacheConfiguration: CacheConfiguration

    @Inject private lateinit var packetConfiguration: PacketConfiguration

    @Inject private lateinit var packetService: PacketService

    @Inject private lateinit var fileStore: FileStore

    @Inject private lateinit var definitions: DefinitionRepository

    @Inject private lateinit var engineService: CyclicEngineService

    @Inject private lateinit var worldMap: WorldMap

    fun start()
    {

/*        fileStore.init()

        val index = fileStore.fetchIndex(IndexConfig.MAPS.identifier)

        val mapScape = index.fetchArchiveByName("m49_49")

        val landScape = index.fetchArchiveByName("l49_49")

        val buffer = mapScape.decompress(fileStore.fetchArchiveBuffer(index.identifier, mapScape.identifier))

        println(mapScape)*/

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

        DefinitionRepository.INSTANCE = definitions

        WorldMap.INSTANCE = worldMap

        manager = ServiceManager(
            listOf(databaseService, rsaService, fileStoreService, packetService, worldService, engineService)
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

            rse.injector.getInstance(RuneScapeEmulator::class.java).start()

        }

    }

}