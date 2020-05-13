package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageDecoder
import gg.rsmod.game.message.MessageStructure
import rs.emulator.buffer.type.DataType
import rs.emulator.packet.network.message.impl.MessagePublicMessage
import rs.emulator.buffer.type.signature.DataSignature
import rs.emulator.packet.GamePacketReader

/**
 * @author Tom <rspsmods@gmail.com>
 */
class MessagePublicDecoder : MessageDecoder<MessagePublicMessage>()
{

    override fun decode(opcode: Int, reader: GamePacketReader): MessagePublicMessage
    {

        val values = hashMapOf<String, Number>()

        val type = reader.getSigned(DataType.BYTE).toInt()
        val color = reader.getSigned(DataType.BYTE).toInt()
        val effect = reader.getSigned(DataType.BYTE).toInt()
        val length = reader.unsignedSmart
        val data = ByteArray(reader.readableBytes)
        reader.getBytes(data)

        return MessagePublicMessage(
            type,
            color,
            effect,
            length,
            data
        )
    }
}