package rs.emulator.network.shared.handshake.channel.pipeline

import com.google.inject.Inject
import io.netty.channel.ChannelHandler
import rs.emulator.network.shared.channel.pipeline.PipelineProvider
import rs.emulator.network.shared.handshake.channel.decoder.HandshakeDecoder

/**
 *
 * @author Chk
 */
class HandshakePipelineProvider @Inject constructor()
    : PipelineProvider
{

    override fun handlers(): Array<ChannelHandler> = arrayOf(HandshakeDecoder())

}