@file:Suppress("UnstableApiUsage")

package rs.emulator.boot

import com.google.common.base.Stopwatch
import com.google.common.util.concurrent.ServiceManager
import com.google.common.util.concurrent.ThreadFactoryBuilder
import com.google.inject.Guice
import com.google.inject.Inject
import com.google.inject.Injector
import com.google.inject.Singleton
import gg.rsmod.game.DevContext
import gg.rsmod.game.GameContext
import gg.rsmod.game.Server
import gg.rsmod.game.model.Tile
import gg.rsmod.game.model.World
import gg.rsmod.game.model.entity.GroundItem
import gg.rsmod.game.model.entity.Npc
import gg.rsmod.game.model.skill.SkillSet
import gg.rsmod.game.plugin.PluginRepository
import gg.rsmod.game.service.GameService
import gg.rsmod.game.service.xtea.XteaKeyService
import gg.rsmod.game.task.parallel.ParallelNpcCycleTask
import gg.rsmod.util.ServerProperties
import kotlinx.coroutines.asExecutor
import net.runelite.cache.fs.Store
import rs.emulator.cache.FileStore
import rs.emulator.cache.definition.DefinitionRepository
import rs.emulator.configuration.CacheConfiguration
import rs.emulator.configuration.environment.RSEEnvironment
import rs.emulator.database.service.JDBCPoolingService
import rs.emulator.encryption.rsa.service.RSAService
import rs.emulator.engine.service.CyclicEngineService
import rs.emulator.engine.task.EngineTask
import rs.emulator.fileserver.FileStoreService
import rs.emulator.packet.PacketService
import rs.emulator.packet.configuration.PacketConfiguration
import rs.emulator.world.service.WorldService
import rs.emulator.world.task.parallel.*
import java.nio.file.Files
import java.nio.file.Paths
import java.text.DecimalFormat
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

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

    fun start()
    {

        val executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors(), ThreadFactoryBuilder()
            .setNameFormat("game-task-thread")
            .setUncaughtExceptionHandler { t, e -> GameService.logger.error("Error with thread $t", e) }
            .build())

        val tasks = listOf(
            ParallelPlayerCycleTask(executor),
            ParallelSynchronizationTask(executor),
            ParallelPlayerPostCycleTask(executor))

        tasks.forEach { engineService.submitTask(it) }

        manager = ServiceManager(
            listOf(databaseService, rsaService, fileStoreService, packetService, worldService, engineService)
        )

        manager.startAsync().awaitHealthy()

        /*val server = Server()
        server.startServer(apiProps = Paths.get("./data/api.yml"))
        server.startGame(
            filestore = Paths.get("./data", "cache"),
            gameProps = Paths.get("./game.yml"),
            packets = Paths.get("./data", "packets.yml"),
            blocks = Paths.get("./data", "blocks.yml"),
            devProps = Paths.get("./dev-settings.yml"), args = emptyArray()
        )*/

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