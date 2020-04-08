package rs.emulator.world.network.channel.pipeline

import com.google.inject.Inject
import com.google.inject.Singleton
import io.netty.channel.ChannelHandler
import rs.emulator.network.shared.channel.pipeline.PipelineProvider
import rs.emulator.world.network.channel.decoder.WorldHandshakeDecoder
import rs.emulator.world.network.channel.encoder.WorldSeedCreationEncoder

/**
 *
 * @author Chk
 */
@Singleton class WorldPipelineProvider @Inject constructor()
    : PipelineProvider
{

    override fun handlers(): Array<ChannelHandler> = arrayOf(WorldSeedCreationEncoder(), WorldHandshakeDecoder())

}