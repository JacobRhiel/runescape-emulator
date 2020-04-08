package rs.emulator.network.shared.channel

import com.google.inject.Inject
import io.netty.channel.*
import io.netty.handler.timeout.IdleStateHandler
import io.netty.handler.traffic.ChannelTrafficShapingHandler
import io.netty.handler.traffic.GlobalTrafficShapingHandler
import rs.emulator.network.shared.NetworkConstants
import rs.emulator.network.shared.channel.pipeline.PipelineProvider
import rs.emulator.network.shared.handshake.session.HandshakeSession
import rs.emulator.network.shared.service.AbstractNetworkService
import rs.emulator.utilities.logger
import java.util.concurrent.Executors

/**
 *
 * @author Chk
 */
class DefaultChannelInitializer<T : Channel>
@Inject constructor(private val childHandler: ChannelHandler,
                    private vararg val providers: PipelineProvider
)
    : ChannelInitializer<T>()
{

    private val globalTrafficHandler = GlobalTrafficShapingHandler(Executors.newSingleThreadScheduledExecutor(), 0, 0, 1000)

    override fun initChannel(channel: T)
    {

        val pipeline = channel.pipeline()

        //Set the default network session to handshake to handle channel local I/O operations.
        channel.attr(NetworkConstants.SESSION_KEY).set(HandshakeSession())

        pipeline.addLast(GlobalTrafficShapingHandler::class.simpleName, globalTrafficHandler)

        pipeline.addLast(ChannelTrafficShapingHandler::class.simpleName, ChannelTrafficShapingHandler(0, 1024 * 5, 1000))

        pipeline.addLast(IdleStateHandler::class.simpleName, IdleStateHandler(30, 0, 0))

        //Unfortunately this is the neatest way as using *. results in the classes having #0 at the end of the name.
        providers.forEach { provider -> provider.handlers().forEach { pipeline.addLast(it::class.simpleName, it) } }

        pipeline.addLast(childHandler::class.simpleName, childHandler)

    }

}