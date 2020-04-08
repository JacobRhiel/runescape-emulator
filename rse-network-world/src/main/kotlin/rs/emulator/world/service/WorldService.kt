package rs.emulator.world.service

import com.google.inject.Inject

import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.ChannelInitializer
import io.netty.channel.ChannelOption
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.nio.NioServerSocketChannel
import rs.emulator.fileserver.network.channel.pipeline.JS5PipelineProvider
import rs.emulator.network.shared.channel.DefaultChannelHandler
import rs.emulator.network.shared.handshake.channel.pipeline.HandshakePipelineProvider
import rs.emulator.network.shared.service.AbstractNetworkService
import rs.emulator.world.network.channel.pipeline.DefaultPipelineProvider
import rs.emulator.world.network.channel.pipeline.WorldPipelineProvider

/**
 *
 * @author Chk
 */
class WorldService @Inject constructor(handshakeProvider: HandshakePipelineProvider,
                                       defaultProvider: DefaultPipelineProvider,
                                       js5Provider: JS5PipelineProvider,
                                       worldProvider: WorldPipelineProvider
)
    : AbstractNetworkService<ServerBootstrap, NioServerSocketChannel>(childHandler = DefaultChannelHandler(),
                                                                      providers = *arrayOf(handshakeProvider,
                                                                                           defaultProvider,
                                                                                           js5Provider,
                                                                                           worldProvider
                                                                      ))
{

    private lateinit var acceptGroup: NioEventLoopGroup

    private lateinit var ioGroup: NioEventLoopGroup

    override fun configure(initializer: ChannelInitializer<NioServerSocketChannel>): ServerBootstrap
    {

        val bootstrap = ServerBootstrap()

        acceptGroup = NioEventLoopGroup(2)

        ioGroup = NioEventLoopGroup(1)

        bootstrap
                .group(acceptGroup, ioGroup)
                .channel(NioServerSocketChannel::class.java)
                .childHandler(initializer)
                .option(ChannelOption.TCP_NODELAY, true)
                .option(ChannelOption.SO_KEEPALIVE, true)
                .localAddress(43594)

        return bootstrap

    }

    override fun destroy()
    {

        acceptGroup.shutdownGracefully()

        ioGroup.shutdownGracefully()

    }

}