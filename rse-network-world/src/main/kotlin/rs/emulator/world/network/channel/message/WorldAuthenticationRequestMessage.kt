package rs.emulator.world.network.channel.message

import io.netty.channel.ChannelHandlerContext
import rs.emulator.network.shared.message.NetworkMessage
import rs.emulator.world.network.protocol.WorldConnectionResponseProtocol

/**
 *
 * @author Chk
 */
data class WorldAuthenticationRequestMessage(private val protocol: WorldConnectionResponseProtocol) : NetworkMessage
{

    override fun handle(ctx: ChannelHandlerContext)
    {



    }

}