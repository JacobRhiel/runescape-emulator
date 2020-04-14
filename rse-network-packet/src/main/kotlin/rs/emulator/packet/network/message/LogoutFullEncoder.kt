package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageEncoder
import rs.emulator.packet.network.message.impl.LogoutFullMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class LogoutFullEncoder : MessageEncoder<LogoutFullMessage>() {

    override fun extract(message: LogoutFullMessage, key: String): Number = throw Exception("Unhandled value key.")

    override fun extractBytes(message: LogoutFullMessage, key: String): ByteArray = throw Exception("Unhandled value key.")
}