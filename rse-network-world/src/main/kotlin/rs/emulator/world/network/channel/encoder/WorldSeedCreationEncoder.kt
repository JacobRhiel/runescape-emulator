package rs.emulator.world.network.channel.encoder

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.MessageToByteEncoder
import rs.emulator.network.shared.NetworkConstants
import rs.emulator.world.network.channel.message.WorldSeedCreationMessage
import rs.emulator.world.network.session.WorldSession

/**
 *
 * @author Chk
 */
class WorldSeedCreationEncoder
    : MessageToByteEncoder<WorldSeedCreationMessage>()
{

    override fun encode(ctx: ChannelHandlerContext, msg: WorldSeedCreationMessage, buffer: ByteBuf)
    {

        val session = ctx.channel().attr(NetworkConstants.SESSION_KEY).get()

        if(session !is WorldSession)
            throw Error("Not world session.")

        session.generateSeed()

        //header empty byte
        buffer.writeByte(0)

        buffer.writeLong(session.fetchSeed())

        ctx.pipeline().remove(this)

    }

}