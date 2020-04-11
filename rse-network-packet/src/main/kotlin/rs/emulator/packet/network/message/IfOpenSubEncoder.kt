package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageEncoder
import rs.emulator.packet.network.message.impl.IfOpenSubMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class IfOpenSubEncoder : MessageEncoder<IfOpenSubMessage>() {

    override fun extract(message: IfOpenSubMessage, key: String): Number = when (key) {
        "component" -> {
            val a = message.component
            println(a)
            a
        }
        "overlay" -> {
            val a = (message.parent shl 16) or message.child
            println(a)
            a
        }
        "type" -> {
            val a = message.type
            println(a)
            a
        }
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: IfOpenSubMessage, key: String): ByteArray = throw Exception("Unhandled value key.")
}