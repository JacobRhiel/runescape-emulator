package rs.emulator.world.network.channel.decoder

import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import io.netty.channel.ChannelFutureListener
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.ByteToMessageDecoder
import rs.emulator.buffer.utilities.BufferUtils.readJagexString
import rs.emulator.buffer.utilities.BufferUtils.readString
import rs.emulator.network.shared.NetworkConstants
import rs.emulator.encryption.isaac.XTEA
import rs.emulator.fileStore
import rs.emulator.utilities.logger
import rs.emulator.world.network.channel.encoder.WorldLoginResponseEncoder
import rs.emulator.world.network.channel.message.WorldHandshakeResponseMessage
import rs.emulator.world.network.channel.message.WorldCreatePacketSessionMessage
import rs.emulator.world.network.protocol.WorldConnectionResponseProtocol
import rs.emulator.world.network.session.WorldSession

/**
 *
 * @author Chk
 */
class WorldIsaacEncryptionDecoder
    : ByteToMessageDecoder()
{

    override fun decode(ctx: ChannelHandlerContext, buffer: ByteBuf, out: MutableList<Any>)
    {

        val session = ctx.channel().attr(NetworkConstants.SESSION_KEY).get()

        if(session !is WorldSession)
            throw Error("Session is not WorldSession in WorldIsaaacEncryptionDecoder.")

        val keys = session.isaacKeys

        val isaacBuffer = buffer.decipher(keys)

        val username = isaacBuffer.readString()

        session.credentials.username = username

        val clientSeed = session.clientSeed

        val serverSeed = session.fetchSeed()

        if (clientSeed != serverSeed)
        {

            isaacBuffer.resetReaderIndex()

            isaacBuffer.skipBytes(isaacBuffer.readableBytes())

            logger().info("User '{}' login request seed mismatch [receivedSeed=$clientSeed, expectedSeed=$serverSeed].", username, clientSeed, serverSeed)

            ctx.writeAndFlush(WorldHandshakeResponseMessage(WorldConnectionResponseProtocol.BAD_SESSION_ID)).addListener(ChannelFutureListener.CLOSE)

            return

        }

        val clientSettings = isaacBuffer.readByte().toInt()

        val clientResizable = (clientSettings shr 1) == 1

        val clientWidth = isaacBuffer.readUnsignedShort()

        val clientHeight = isaacBuffer.readUnsignedShort()

        isaacBuffer.skipBytes(24) // random.dat data
        isaacBuffer.readString()
        isaacBuffer.skipBytes(Int.SIZE_BYTES)

        isaacBuffer.skipBytes(Byte.SIZE_BYTES * 10)
        isaacBuffer.skipBytes(Short.SIZE_BYTES)
        isaacBuffer.skipBytes(Byte.SIZE_BYTES)
        isaacBuffer.skipBytes(Byte.SIZE_BYTES * 3)
        isaacBuffer.skipBytes(Short.SIZE_BYTES)
        isaacBuffer.readJagexString()
        isaacBuffer.readJagexString()
        isaacBuffer.readJagexString()
        isaacBuffer.readJagexString()
        isaacBuffer.skipBytes(Byte.SIZE_BYTES)
        isaacBuffer.skipBytes(Short.SIZE_BYTES)
        isaacBuffer.readJagexString()
        isaacBuffer.readJagexString()
        isaacBuffer.skipBytes(Byte.SIZE_BYTES * 2)
        isaacBuffer.skipBytes(Int.SIZE_BYTES * 3)
        isaacBuffer.skipBytes(Int.SIZE_BYTES)
        isaacBuffer.readJagexString()

        isaacBuffer.skipBytes(Int.SIZE_BYTES * 3)

        val crcHashes = fileStore.fetchIndexCrcHashes()

        val requestedCrcHashes = IntArray(crcHashes.size) { isaacBuffer.readInt() }

        for (i in requestedCrcHashes.indices)
        {

            /**
             * CRC for index 16 is always sent as 0 (at least on the
             * Desktop client, need to look into mobile).
             */
            if (i == 16) {
                continue
            }
            if (crcHashes[i] != requestedCrcHashes[i])
            {
                buffer.resetReaderIndex()
                buffer.skipBytes(buffer.readableBytes())
                logger().info { "User '$username' login request crc mismatch [requestCrc=${requestedCrcHashes.contentToString()}, cacheCrc=${crcHashes.contentToString()}]." }
                ctx.writeAndFlush(WorldHandshakeResponseMessage(WorldConnectionResponseProtocol.REVISION_MISMATCH))

                return
            }
        }

/*        val request = LoginRequest(channel = ctx.channel(), username = username,
                                   password = password ?: "", revision = serverRevision, xteaKeys = xteaKeys,
                                   resizableClient = clientResizable, auth = authCode, uuid = "".toUpperCase(), clientWidth = clientWidth, clientHeight = clientHeight,
                                   reconnecting = reconnecting)*/

        println("$username : ${session.credentials.password}")

        ctx.pipeline().addBefore(javaClass.simpleName, WorldLoginResponseEncoder::class.simpleName, WorldLoginResponseEncoder())

        out.add(WorldCreatePacketSessionMessage(session))

        ctx.pipeline().remove(this)

    }

    private fun ByteBuf.decipher(isaacKeys: IntArray): ByteBuf
    {

        val data = ByteArray(readableBytes())

        readBytes(data)

        return Unpooled.wrappedBuffer(XTEA.decipher(isaacKeys, data, 0, data.size))

    }

}