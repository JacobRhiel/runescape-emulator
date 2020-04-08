package rs.emulator.fileserver.network.channel.pipeline

import com.google.inject.Inject
import com.google.inject.Singleton
import io.netty.channel.ChannelHandler
import rs.emulator.configuration.environment.RSEEnvironment
import rs.emulator.fileserver.network.channel.decoder.JS5HandshakeDecoder
import rs.emulator.fileserver.network.channel.encoder.*
import rs.emulator.network.shared.channel.pipeline.PipelineProvider

/**
 *
 * @author Chk
 */
@Singleton class JS5PipelineProvider @Inject constructor(private val environment: RSEEnvironment)
    : PipelineProvider
{

    override fun handlers(): Array<ChannelHandler> = arrayOf(JS5HandshakeResponseEncoder(), JS5HandshakeDecoder(environment))

}