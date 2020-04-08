package rs.emulator.network.shared.session

import io.netty.channel.ChannelHandlerContext
import rs.emulator.network.shared.message.NetworkMessage

/**
 *
 * @author Chk
 */
interface NetworkSession
{

    fun onMessage(ctx: ChannelHandlerContext, msg: NetworkMessage)

    fun onDestroy(ctx: ChannelHandlerContext)

}