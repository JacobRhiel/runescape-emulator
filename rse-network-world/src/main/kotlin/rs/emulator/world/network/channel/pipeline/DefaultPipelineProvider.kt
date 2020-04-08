package rs.emulator.world.network.channel.pipeline

import com.google.inject.Inject
import com.google.inject.Singleton
import io.netty.channel.ChannelHandler
import rs.emulator.cache.FileStore

import rs.emulator.fileserver.network.channel.pipeline.JS5PipelineProvider
import rs.emulator.network.shared.channel.pipeline.PipelineProvider
import rs.emulator.world.configuration.WorldConfiguration
import rs.emulator.world.network.channel.encoder.UpdatePipelineEncoder

/**
 *
 * @author Chk
 */
@Singleton class DefaultPipelineProvider @Inject constructor(private val configuration: WorldConfiguration,
                                                             private val jS5Provider: JS5PipelineProvider,
                                                             private val worldProvider: WorldPipelineProvider,
                                                             private val fileStore: FileStore
) : PipelineProvider
{

    override fun handlers(): Array<ChannelHandler> = arrayOf(
        UpdatePipelineEncoder(
            configuration,
            jS5Provider,
            worldProvider,
            fileStore
        )
    )

}