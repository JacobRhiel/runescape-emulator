package rs.emulator.network.shared.handshake.channel.message

import io.netty.channel.ChannelHandlerContext
import rs.emulator.network.shared.handshake.protocol.HandshakeRequestProtocol
import rs.emulator.network.shared.handshake.protocol.HandshakeResponseProtocol
import rs.emulator.network.shared.message.NetworkMessage
import rs.emulator.utilities.logger

/**
 *
 * @author Chk
 */
data class HandshakeResponseMessage(val request: HandshakeRequestProtocol, val response: HandshakeResponseProtocol) : NetworkMessage
{

    override fun handle(ctx: ChannelHandlerContext)
    {

        if(response == HandshakeResponseProtocol.REJECT_HANDSHAKE)
        {
            logger().warn("Handshake rejected for address {}.", ctx.channel().remoteAddress())
            ctx.channel().closeFuture()
            return
        }
        else ctx.writeAndFlush(RequestUpdatePipelineMessage(request))

    }

}