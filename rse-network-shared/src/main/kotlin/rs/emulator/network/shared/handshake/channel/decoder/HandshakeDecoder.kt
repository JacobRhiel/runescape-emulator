package rs.emulator.network.shared.handshake.channel.decoder

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.ByteToMessageDecoder
import rs.emulator.network.shared.handshake.channel.message.HandshakeResponseMessage
import rs.emulator.network.shared.handshake.protocol.HandshakeRequestProtocol
import rs.emulator.network.shared.handshake.protocol.HandshakeResponseProtocol
import rs.emulator.utilities.logger

/**
 *
 * @author Chk
 */
class HandshakeDecoder
    : ByteToMessageDecoder()
{

    override fun decode(ctx: ChannelHandlerContext, buffer: ByteBuf, out: MutableList<Any>)
    {

        if(!buffer.isReadable) return

        val opcode = buffer.readByte().toInt()

        val protocol = HandshakeRequestProtocol.fetchProtocol(opcode)

        var response = HandshakeResponseProtocol.ALLOW_HANDSHAKE

        if(protocol == null)
        {
            logger().error("No HandshakeProtocol exists for opcode: {}.", opcode)
            response = HandshakeResponseProtocol.REJECT_HANDSHAKE
            return
        }

        logger().debug("Handling decoder for protocol: {}.", protocol)

        ctx.pipeline().remove(this)

        out.add(HandshakeResponseMessage(protocol, response))

    }

}