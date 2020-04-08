package rs.emulator.fileserver.network.channel.decoder

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.ByteToMessageDecoder
import rs.emulator.configuration.environment.RSEEnvironment
import rs.emulator.fileserver.network.message.JS5EnableSessionMessage
import rs.emulator.fileserver.network.message.JS5HandshakeResponseMessage
import rs.emulator.fileserver.network.protocol.JS5ResponseProtocol
import rs.emulator.fileserver.network.session.JS5Session
import rs.emulator.network.shared.NetworkConstants
import rs.emulator.utilities.logger

/**
 *
 * @author Chk
 */
class JS5HandshakeDecoder(
    private val environment: RSEEnvironment
)
    : ByteToMessageDecoder()
{

    override fun decode(ctx: ChannelHandlerContext, buffer: ByteBuf, out: MutableList<Any>)
    {

        if (!buffer.isReadable || buffer.readableBytes() < 4) return

        //unfortunately there is not a way to add this directly to the core yet. todo:
        ctx.channel().attr(NetworkConstants.SESSION_KEY).set(JS5Session())

        val currentRevision = environment.fetchValue("revision")!!.asInt()

        println(currentRevision)

        val requestedRevision = buffer.readInt()

        if(requestedRevision != currentRevision)
        {

            logger().info("Address {}, attempted to connect with an older client. Client Revision: {}", ctx.channel().remoteAddress(), requestedRevision)

            ctx.writeAndFlush(JS5HandshakeResponseMessage(JS5ResponseProtocol.OUT_OF_DATE))

        }

        ctx.pipeline().remove(this)

        out.add(JS5EnableSessionMessage())

    }

}