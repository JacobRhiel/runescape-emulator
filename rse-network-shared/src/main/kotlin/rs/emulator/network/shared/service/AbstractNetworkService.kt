@file:Suppress("UnstableApiUsage")

package rs.emulator.network.shared.service

import com.google.common.util.concurrent.AbstractIdleService
import io.netty.bootstrap.AbstractBootstrap
import io.netty.channel.*
import rs.emulator.network.shared.channel.DefaultChannelHandler
import rs.emulator.network.shared.channel.DefaultChannelInitializer
import rs.emulator.network.shared.channel.pipeline.PipelineProvider
import rs.emulator.utilities.logger

/**
 *
 * @author Chk
 */
abstract class AbstractNetworkService<T : AbstractBootstrap<*,*>, S : Channel>(
    private val childHandler: ChannelHandler,
    private vararg val providers: PipelineProvider
)
    : AbstractIdleService()
{

    private val initializer = DefaultChannelInitializer<S>(childHandler, *providers)

    private val bootstrap = this.configure(initializer)

    private lateinit var future: ChannelFuture

    abstract fun configure(initializer: ChannelInitializer<S>) : T

    abstract fun destroy()

    override fun startUp()
    {

        if(bootstrap.config().localAddress() == null)
        {
            logger().error("Local Address has not been set for {}, please set the address then restart.", this::class.simpleName)
            return
        }

        future = bootstrap.bind().sync()//.awaitUninterruptibly()

        logger().info("{} successfully bound to {}.", this::class.simpleName, bootstrap.config().localAddress())

        future.channel().closeFuture().sync()

    }

    override fun shutDown()
    {

        destroy()

        future.channel().closeFuture()

    }

}