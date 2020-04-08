package rs.emulator.packet.network.message.encoder

import gg.rsmod.game.message.MessageEncoder
import rs.emulator.packet.network.message.impl.ObjDelMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class ObjDelEncoder : MessageEncoder<ObjDelMessage>() {

    override fun extract(message: ObjDelMessage, key: String): Number = when (key) {
        "item" -> message.item
        "tile" -> message.tile
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: ObjDelMessage, key: String): ByteArray = throw Exception("Unhandled value key.")
}