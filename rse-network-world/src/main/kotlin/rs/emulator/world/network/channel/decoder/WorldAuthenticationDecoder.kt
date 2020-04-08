package rs.emulator.world.network.channel.decoder

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.ByteToMessageDecoder
import rs.emulator.buffer.utilities.BufferUtils.readString
import rs.emulator.network.shared.NetworkConstants
import rs.emulator.world.network.protocol.WorldConnectionRequestProtocol
import rs.emulator.world.network.session.WorldSession

/**
 *
 * @author Chk
 */
class WorldAuthenticationDecoder(private val protocol: WorldConnectionRequestProtocol) : ByteToMessageDecoder()
{

    override fun decode(ctx: ChannelHandlerContext, buffer: ByteBuf, out: MutableList<Any>)
    {

        val session = ctx.channel().attr(NetworkConstants.SESSION_KEY).get()

        if(session !is WorldSession)
            throw Error("Session is not WorldSession in WorldAuthenticationDecoder.")

        val secureBuffer = session.secureBuffer

        if(protocol == WorldConnectionRequestProtocol.CONNECTION)
        {

            val authType = secureBuffer.readByte().toInt()

            if (authType == 1)
            {

                secureBuffer.readInt()

            }
            else if (authType == 0 || authType == 2)
            {
                secureBuffer.readUnsignedMedium()
                secureBuffer.skipBytes(Byte.SIZE_BYTES)
            }
            else
            {
                secureBuffer.readInt()
            }

            secureBuffer.skipBytes(Byte.SIZE_BYTES)

            val password = secureBuffer.readString()

            session.credentials.password = password

        }

        ctx.pipeline().remove(this)

    }

}