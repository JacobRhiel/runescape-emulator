package rs.emulator.network.shared.channel.pipeline

import io.netty.channel.*

/**
 *
 * @author Chk
 */
interface PipelineProvider
{

    fun handlers() : Array<ChannelHandler>

}