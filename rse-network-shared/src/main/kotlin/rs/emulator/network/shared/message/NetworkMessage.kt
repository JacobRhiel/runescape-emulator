package rs.emulator.network.shared.message

import io.netty.channel.ChannelHandlerContext

/**
 *
 * @author Chk
 */
interface NetworkMessage
{

    fun handle(ctx: ChannelHandlerContext) { }

}