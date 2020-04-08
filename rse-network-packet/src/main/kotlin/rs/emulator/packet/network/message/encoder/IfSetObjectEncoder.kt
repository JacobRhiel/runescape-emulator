package rs.emulator.packet.network.message.encoder

import gg.rsmod.game.message.MessageEncoder
import rs.emulator.packet.network.message.impl.IfSetObjectMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class IfSetObjectEncoder : MessageEncoder<IfSetObjectMessage>() {

    override fun extract(message: IfSetObjectMessage, key: String): Number = when (key) {
        "hash" -> message.hash
        "item" -> message.item
        "amount" -> message.amount
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: IfSetObjectMessage, key: String): ByteArray = throw Exception("Unhandled value key.")
}