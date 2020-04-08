package rs.emulator.packet.network.message.encoder

import gg.rsmod.game.message.MessageEncoder
import rs.emulator.packet.network.message.impl.IfSetNpcHeadMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class IfSetNpcHeadEncoder : MessageEncoder<IfSetNpcHeadMessage>() {

    override fun extract(message: IfSetNpcHeadMessage, key: String): Number = when (key) {
        "hash" -> message.hash
        "npc" -> message.npc
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: IfSetNpcHeadMessage, key: String): ByteArray = throw Exception("Unhandled value key.")
}