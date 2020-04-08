package rs.emulator.network.shared.channel

import com.google.inject.Inject
import com.google.inject.Singleton
import io.netty.channel.*
import rs.emulator.network.shared.NetworkConstants
import rs.emulator.network.shared.message.NetworkMessage

/**
 *
 * @author Chk
 */
@Singleton
@ChannelHandler.Sharable class DefaultChannelHandler @Inject constructor()
    : ChannelInboundHandlerAdapter()
{

    override fun channelRead(ctx: ChannelHandlerContext, msg: Any)
    {

        val sessionAttached = ctx.channel().hasAttr(NetworkConstants.SESSION_KEY)

        if(!sessionAttached)
            println("No session attached to: $msg.")
        else if(msg is NetworkMessage)
        {

            val session = ctx.channel().attr(NetworkConstants.SESSION_KEY).get()

            session.onMessage(ctx, msg)

        }

    }

    override fun channelActive(ctx: ChannelHandlerContext?)
    {
        println("Channel active")
    }

    override fun channelInactive(ctx: ChannelHandlerContext?)
    {
        println("Channel inactive")
    }

    override fun channelRegistered(ctx: ChannelHandlerContext?)
    {
        println("channel registered")
    }

    override fun channelUnregistered(ctx: ChannelHandlerContext?)
    {
        println("channel unregistered")
    }

    override fun exceptionCaught(ctx: ChannelHandlerContext, cause: Throwable)
    {

        if(cause.localizedMessage == "An existing connection was forcibly closed by the remote host")
            println("Network forcibly closed by user")
        else ctx.fireExceptionCaught(cause)

    }

}