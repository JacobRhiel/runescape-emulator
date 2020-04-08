package rs.emulator.world.network.channel.decoder

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.ByteToMessageDecoder
import rs.emulator.world.network.channel.message.WorldConnectionRequestMessage

/**
 *
 * @author Chk
 */
class WorldRevisionDecoder
    : ByteToMessageDecoder()
{

    override fun decode(ctx: ChannelHandlerContext, buffer: ByteBuf, out: MutableList<Any>)
    {

        if(buffer.readableBytes() < 3) return //todo throw error

        val length = buffer.readShort().toInt()

        if(buffer.readableBytes() < length) return //todo throw error

        val revision = buffer.readInt()

        val unknown = buffer.readInt()

        val clientType = buffer.readByte().toInt()

        ctx.pipeline().remove(this)

        out.add(WorldConnectionRequestMessage(revision, unknown, clientType))

    }

}