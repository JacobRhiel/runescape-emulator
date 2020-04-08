package rs.emulator.world.network.channel.encoder

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.MessageToByteEncoder
import rs.emulator.world.network.channel.message.WorldHandshakeResponseMessage
import rs.emulator.world.network.channel.message.WorldResponseMessage

/**
 *
 * @author Chk
 */
class WorldLoginResponseEncoder
    : MessageToByteEncoder<WorldResponseMessage>()
{

    override fun encode(ctx: ChannelHandlerContext, msg: WorldResponseMessage, buffer: ByteBuf)
    {

        buffer.writeByte(2)
        buffer.writeByte(13)
        buffer.writeByte(0)
        buffer.writeInt(0)
        buffer.writeByte(0)
        buffer.writeBoolean(true) // members
        buffer.writeShort(1)
        buffer.writeBoolean(true) // members

        println("encoding world response...")

    }

}