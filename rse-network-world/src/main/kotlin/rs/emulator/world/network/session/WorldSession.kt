package rs.emulator.world.network.session

import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import io.netty.channel.ChannelHandlerContext
import rs.emulator.cache.FileStore
import rs.emulator.network.shared.message.NetworkMessage
import rs.emulator.network.shared.session.NetworkSession
import rs.emulator.world.configuration.WorldConfiguration
import kotlin.random.Random

/**
 *
 * @author Chk
 */
class WorldSession(val configuration: WorldConfiguration) : NetworkSession
{

    val credentials = WorldSessionCredentials()

    private var worldSeed = 0L

    var clientSeed = 0L

    var isaacKeys = IntArray(4) { -1 }

    var secureBuffer: ByteBuf = Unpooled.EMPTY_BUFFER

    fun fetchSeed() = worldSeed

    fun generateSeed() : Long
    {
        worldSeed = Random.nextLong()
        return worldSeed
    }

    override fun onMessage(ctx: ChannelHandlerContext, msg: NetworkMessage)
    {

        msg.handle(ctx)

    }

    override fun onDestroy(ctx: ChannelHandlerContext)
    {

    }

}