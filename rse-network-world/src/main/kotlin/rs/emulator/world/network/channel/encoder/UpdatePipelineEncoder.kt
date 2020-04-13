package rs.emulator.world.network.channel.encoder

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.MessageToByteEncoder
import rs.emulator.cache.FileStore
import rs.emulator.fileserver.network.channel.pipeline.JS5PipelineProvider
import rs.emulator.network.shared.NetworkConstants
import rs.emulator.network.shared.handshake.channel.message.RequestUpdatePipelineMessage
import rs.emulator.network.shared.handshake.protocol.HandshakeRequestProtocol.FILE_SERVER_CONNECTION
import rs.emulator.network.shared.handshake.protocol.HandshakeRequestProtocol.WORLD_SERVER_CONNECTION
import rs.emulator.world.configuration.WorldConfiguration
import rs.emulator.world.network.channel.message.WorldSeedCreationMessage
import rs.emulator.world.network.channel.pipeline.WorldPipelineProvider
import rs.emulator.world.network.session.WorldSession

/**
 *
 * @author Chk
 */
class UpdatePipelineEncoder(private val configuration: WorldConfiguration,
                            private val js5Provider: JS5PipelineProvider,
                            private val worldProvider: WorldPipelineProvider,
                            private val fileStore: FileStore
)
    : MessageToByteEncoder<RequestUpdatePipelineMessage>()
{

    override fun encode(ctx: ChannelHandlerContext, msg: RequestUpdatePipelineMessage, buffer: ByteBuf)
    {

        val request = msg.request

        when(request)
        {

            WORLD_SERVER_CONNECTION ->
            {

                js5Provider.handlers().forEach { ctx.pipeline().remove(it::class.simpleName) }

                ctx.channel().attr(NetworkConstants.SESSION_KEY).set(WorldSession(configuration))

                ctx.channel().writeAndFlush(WorldSeedCreationMessage())

            }

            FILE_SERVER_CONNECTION  ->
            {

                worldProvider.handlers().forEach { ctx.pipeline().remove(it::class.simpleName) }

            }

        }

        ctx.pipeline().remove(this)

    }

}