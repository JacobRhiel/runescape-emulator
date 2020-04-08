package rs.emulator.packet.network.message.encoder

import gg.rsmod.game.message.MessageEncoder
import rs.emulator.packet.network.message.impl.SetOpPlayerMessage

/**
 * @author Triston Plummer ("Dread")
 */
class SetOpPlayerEncoder : MessageEncoder<SetOpPlayerMessage>() {

    override fun extractBytes(message: SetOpPlayerMessage, key: String): ByteArray = when (key) {
        "option" -> {
            val option = message.option
            val data = ByteArray(option.length + 1)
            System.arraycopy(option.toByteArray(), 0, data, 0, data.size - 1)
            data[data.size - 1] = 0
            data
        }
        else -> throw Exception("Unhandled value key.")
    }

    override fun extract(message: SetOpPlayerMessage, key: String): Number = when (key) {
        "left_click" -> if (message.leftClick) 1 else 0
        "index" -> message.index + 1
        else -> throw Exception("Unhandled value key.")
    }
}