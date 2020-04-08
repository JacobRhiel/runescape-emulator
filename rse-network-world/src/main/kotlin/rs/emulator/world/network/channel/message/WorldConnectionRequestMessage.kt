package rs.emulator.world.network.channel.message

import io.netty.channel.ChannelHandlerContext
import rs.emulator.network.shared.NetworkConstants
import rs.emulator.network.shared.message.NetworkMessage
import rs.emulator.utilities.logger
import rs.emulator.world.network.protocol.WorldConnectionResponseProtocol
import rs.emulator.world.network.session.WorldSession

/**
 *
 * @author Chk
 */
data class WorldConnectionRequestMessage(
    private val revision: Int,
    private val unknown: Int,
    private val clientType: Int
) : NetworkMessage
{

    override fun handle(ctx: ChannelHandlerContext)
    {

        val session = ctx.channel().attr(NetworkConstants.SESSION_KEY).get()

        if(session !is WorldSession)
            throw Error("Not world session in: ${this::class.simpleName}.")

        val environment = session.configuration

        val worldRevision = environment.fetchValue("revision")!!.asInt()

        if(revision != worldRevision)
        {

            logger().warn("Client attempted to login to world with a different revision client. Revision {}.", revision)

            ctx.writeAndFlush(WorldHandshakeResponseMessage(WorldConnectionResponseProtocol.REVISION_MISMATCH))

            ctx.channel().closeFuture()

            return

        }

    }

}