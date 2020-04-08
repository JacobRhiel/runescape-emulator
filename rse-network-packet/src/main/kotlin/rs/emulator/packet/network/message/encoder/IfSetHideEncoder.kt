package rs.emulator.packet.network.message.encoder

import gg.rsmod.game.message.MessageEncoder
import rs.emulator.packet.network.message.impl.IfSetHideMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class IfSetHideEncoder : MessageEncoder<IfSetHideMessage>() {

    override fun extract(message: IfSetHideMessage, key: String): Number = when (key) {
        "hash" -> message.hash
        "hidden" -> if (message.hidden) 1 else 0
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: IfSetHideMessage, key: String): ByteArray = throw Exception("Unhandled value key.")
}