package rs.emulator.network.shared.handshake.session

import io.netty.channel.ChannelHandlerContext
import rs.emulator.network.shared.message.NetworkMessage
import rs.emulator.network.shared.session.NetworkSession

/**
 *
 * @author Chk
 */
class HandshakeSession
    : NetworkSession
{

    override fun onMessage(ctx: ChannelHandlerContext, msg: NetworkMessage)
    {

        println("msg: $msg")

        msg.handle(ctx)

    }

    override fun onDestroy(ctx: ChannelHandlerContext)
    {
        //todo
    }

}