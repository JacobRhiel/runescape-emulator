package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageEncoder
import rs.emulator.packet.network.message.impl.IfOpenTopMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class IfOpenTopEncoder : MessageEncoder<IfOpenTopMessage>() {

    override fun extract(message: IfOpenTopMessage, key: String): Number = when (key) {
        "top" -> message.top
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: IfOpenTopMessage, key: String): ByteArray = throw Exception("Unhandled value key.")
}