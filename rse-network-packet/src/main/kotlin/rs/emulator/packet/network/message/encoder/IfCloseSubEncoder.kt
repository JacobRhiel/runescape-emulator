package rs.emulator.packet.network.message.encoder

import gg.rsmod.game.message.MessageEncoder
import rs.emulator.packet.network.message.impl.IfCloseSubMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class IfCloseSubEncoder : MessageEncoder<IfCloseSubMessage>() {

    override fun extract(message: IfCloseSubMessage, key: String): Number = when (key) {
        "hash" -> message.hash
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: IfCloseSubMessage, key: String): ByteArray = throw Exception("Unhandled value key.")
}