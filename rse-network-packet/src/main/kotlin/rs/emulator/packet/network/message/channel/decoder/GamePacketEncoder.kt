package rs.emulator.packet.network.message.channel.decoder

import rs.emulator.packet.GamePacket
import rs.emulator.packet.PacketType
import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.MessageToByteEncoder
import mu.KLogging
import rs.emulator.encryption.isaac.IsaacRandom
import java.text.DecimalFormat

/**
 * @author Tom <rspsmods@gmail.com>
 */
class GamePacketEncoder(private val random: IsaacRandom?) : MessageToByteEncoder<GamePacket>() {

    override fun encode(ctx: ChannelHandlerContext, msg: GamePacket, out: ByteBuf)
    {
        if (msg.type == PacketType.VARIABLE_BYTE && msg.length >= 256) {
            logger.error("Message length {} too long for 'variable-byte' packet on channel {}.", DecimalFormat().format(msg.length), ctx.channel())
            return
        } else if (msg.type == PacketType.VARIABLE_SHORT && msg.length >= 65536) {
            logger.error("Message length {} too long for 'variable-short' packet on channel {}.", DecimalFormat().format(msg.length), ctx.channel())
            return
        }
        out.writeByte((msg.opcode + (random?.nextInt() ?: 0)) and 0xFF)
        when (msg.type) {
            PacketType.VARIABLE_BYTE  -> out.writeByte(msg.length)
            PacketType.VARIABLE_SHORT -> out.writeShort(msg.length)
            else                                                            -> {}
        }
        println("Encoding packet: ${msg.javaClass.simpleName}. ${msg.opcode}")
        out.writeBytes(msg.payload)
        msg.payload.release()
    }

    companion object : KLogging()

}