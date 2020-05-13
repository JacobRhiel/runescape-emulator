package rs.emulator.world.network.channel.message

import io.netty.buffer.Unpooled
import io.netty.channel.ChannelHandlerContext
import rs.emulator.entity.actor.player.Player
import rs.emulator.network.shared.NetworkConstants
import rs.emulator.network.shared.message.NetworkMessage
import rs.emulator.packet.network.session.PacketSession
import rs.emulator.world.WorldRepository
import rs.emulator.world.network.session.WorldSession

/**
 *
 * @author Chk
 */
class WorldCreatePacketSessionMessage(private val session: WorldSession) : NetworkMessage
{

    override fun handle(ctx: ChannelHandlerContext)
    {

        ctx.channel().attr(NetworkConstants.SESSION_KEY).set(PacketSession(ctx.channel(), session.isaacKeys))

        val session = ctx.channel().attr(NetworkConstants.SESSION_KEY).get() as PacketSession

        session.channel.write(WorldResponseMessage())

        val player = Player(session.channel, this.session.credentials.username!!)//todo WorldRepo. reference instead of passing non-essential args.

        WorldRepository.players.add(player)

        session.test(player)//todo: not this.

        println("Creating packet session for login!")

    }

}