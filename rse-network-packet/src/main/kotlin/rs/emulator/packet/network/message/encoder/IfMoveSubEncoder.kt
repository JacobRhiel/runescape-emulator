package rs.emulator.packet.network.message.encoder

import gg.rsmod.game.message.MessageEncoder
import rs.emulator.packet.network.message.impl.IfMoveSubMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class IfMoveSubEncoder : MessageEncoder<IfMoveSubMessage>() {

    override fun extract(message: IfMoveSubMessage, key: String): Number = when (key) {
        "from" -> message.from
        "to" -> message.to
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: IfMoveSubMessage, key: String): ByteArray = throw Exception("Unhandled value key.")
}