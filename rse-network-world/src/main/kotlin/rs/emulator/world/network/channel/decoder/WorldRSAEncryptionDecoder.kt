package rs.emulator.world.network.channel.decoder

import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.ByteToMessageDecoder
import rs.emulator.network.shared.NetworkConstants
import rs.emulator.utilities.logger
import rs.emulator.world.network.channel.message.WorldHandshakeResponseMessage
import rs.emulator.world.network.protocol.WorldConnectionRequestProtocol
import rs.emulator.world.network.protocol.WorldConnectionResponseProtocol
import rs.emulator.world.network.session.WorldSession
import java.math.BigInteger
import kotlin.math.exp

/**
 *
 * @author Chk
 */
class WorldRSAEncryptionDecoder(
    private val protocol: WorldConnectionRequestProtocol
)
    : ByteToMessageDecoder()
{

    override fun decode(ctx: ChannelHandlerContext, buffer: ByteBuf, out: MutableList<Any>)
    {

        val session = ctx.channel().attr(NetworkConstants.SESSION_KEY).get()

        if(session !is WorldSession)
            throw Error("Not world session in RSADecoder.")

        val environment = session.configuration

        val modulus = environment.fetchModulus()

        val exponent = environment.fetchExponent()

        val secureBufLength = buffer.readUnsignedShort()

        val buf = buffer.readBytes(secureBufLength)

        val rsaValue = BigInteger(buf.toByteArraySafe()).modPow(exponent, modulus)

        val secureBuffer = Unpooled.wrappedBuffer(rsaValue.toByteArray())

        val successfulEncryption = secureBuffer.readUnsignedByte().toInt() == 1

        if (!successfulEncryption)
        {

            secureBuffer.skipBytes(secureBuffer.readableBytes())//todo check..

            logger().info("Channel '{}' login request rejected.", ctx.channel())

            ctx.writeAndFlush(WorldHandshakeResponseMessage(WorldConnectionResponseProtocol.BAD_SESSION_ID))

            return
        }

        var isaacKeys = IntArray(4) { secureBuffer.readInt() }

        val clientSeed = secureBuffer.readLong()

        if(protocol == WorldConnectionRequestProtocol.RECONNECTION)
            isaacKeys = IntArray(4) { secureBuffer.readInt() }

        session.clientSeed = clientSeed

        session.isaacKeys = isaacKeys

        session.secureBuffer = secureBuffer

        ctx.pipeline().remove(this)

    }

    private fun ByteBuf.toByteArraySafe(): ByteArray
    {

        if (this.hasArray())
            return this.array()

        val bytes = ByteArray(this.readableBytes())

        this.getBytes(this.readerIndex(), bytes)

        return bytes

    }

}