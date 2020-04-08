package rs.emulator.packet.network.message.encoder

import gg.rsmod.game.message.MessageEncoder
import gg.rsmod.net.packet.DataType
import gg.rsmod.net.packet.GamePacketBuilder

class SocialUpdateEncoder : MessageEncoder<SocialUpdateMessage>() {

    override fun extract(message: SocialUpdateMessage, key: String): Number
    {
        throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: SocialUpdateMessage, key: String): ByteArray = when (key)
    {
        "payload" -> {

            val builder = GamePacketBuilder()

            message.profile.fetchFriends().forEach {

                builder.put(DataType.BYTE, 0)
                builder.putString(it)//display name not username
                builder.putString(it)//previous display name
                builder.put(DataType.SHORT, 0)
                builder.put(DataType.BYTE, 1)
                builder.put(DataType.BYTE, 0)

                builder.putString("")

            }

            val payload = ByteArray(builder.byteBuf.readableBytes())
            builder.byteBuf.readBytes(payload)
            payload
        }
        else -> throw Exception("Unhandled value key.")
    }
}