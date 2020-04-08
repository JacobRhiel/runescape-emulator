package rs.emulator.world.network.channel.decoder

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.ByteToMessageDecoder
import rs.emulator.network.shared.channel.DefaultChannelHandler
import rs.emulator.utilities.logger
import rs.emulator.world.network.channel.message.WorldHandshakeResponseMessage
import rs.emulator.world.network.protocol.WorldConnectionRequestProtocol
import rs.emulator.world.network.protocol.WorldConnectionResponseProtocol

/**
 *
 * @author Chk
 */
class WorldHandshakeDecoder
    : ByteToMessageDecoder()
{

    override fun decode(ctx: ChannelHandlerContext, buffer: ByteBuf, out: MutableList<Any>)
    {

        if(!buffer.isReadable) return //todo error message

        val opcode = buffer.readByte().toInt()

        val protocol = WorldConnectionRequestProtocol.fetchProtocol(opcode)

        if(protocol == null)
        {

            logger().error("Non-existent protocol for opcode: {}.", opcode)

            ctx.writeAndFlush(WorldHandshakeResponseMessage(WorldConnectionResponseProtocol.BAD_SESSION_ID))

            return

        }

        ctx.pipeline().addBefore(DefaultChannelHandler::class.simpleName, WorldRevisionDecoder::class.simpleName, WorldRevisionDecoder())

        ctx.pipeline().addAfter(WorldRevisionDecoder::class.simpleName, WorldRSAEncryptionDecoder::class.simpleName, WorldRSAEncryptionDecoder(protocol))

        ctx.pipeline().addAfter(WorldRSAEncryptionDecoder::class.simpleName, WorldAuthenticationDecoder::class.simpleName, WorldAuthenticationDecoder(protocol))

        ctx.pipeline().addAfter(WorldAuthenticationDecoder::class.simpleName, WorldIsaacEncryptionDecoder::class.simpleName, WorldIsaacEncryptionDecoder())

        ctx.pipeline().remove(this)

    }

}