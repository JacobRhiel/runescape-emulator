package rs.emulator.packet.network.message.encoder

import gg.rsmod.game.message.MessageEncoder
import rs.emulator.packet.network.message.impl.UpdateZonePartialEnclosedMessage
import gg.rsmod.net.packet.GamePacketBuilder
import rs.emulator.buffer.type.DataType

/**
 * @author Tom <rspsmods@gmail.com>
 */
class UpdateZonePartialEnclosedEncoder : MessageEncoder<UpdateZonePartialEnclosedMessage>() {

    override fun extract(message: UpdateZonePartialEnclosedMessage, key: String): Number = when (key) {
        "x" -> message.x
        "z" -> message.z
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: UpdateZonePartialEnclosedMessage, key: String): ByteArray = when (key) {
        "payload" -> {
            val builder = GamePacketBuilder()
            message.messages.forEach { groupMessage ->
                val encoder = message.encoders.get(groupMessage.message::class.java)!!
                val structure = message.structures.get(groupMessage.message::class.java)!!
                builder.put(DataType.BYTE, groupMessage.id) // Client always read as unsigned byte
                encoder.encode(groupMessage.message, builder, structure)
            }
            val payload = ByteArray(builder.byteBuf.readableBytes())
            builder.byteBuf.readBytes(payload)
            payload
        }
        else -> throw Exception("Unhandled value key.")
    }
}