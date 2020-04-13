package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageEncoder
import rs.emulator.packet.network.message.impl.RunClientScriptMessage
import mu.KLogging
import rs.emulator.utilities.logger

/**
 * @author Tom <rspsmods@gmail.com>
 */
class RunClientScriptEncoder : MessageEncoder<RunClientScriptMessage>() {

    override fun extract(message: RunClientScriptMessage, key: String): Number = when (key) {
        "id" -> message.id
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: RunClientScriptMessage, key: String): ByteArray = when (key) {
        "types" -> {
            val types = CharArray(message.args.size + 1)
            for (i in message.args.indices) {
                types[i] = if (message.args[i] is String) 's' else 'i'
            }
            types[message.args.size] = 0.toChar()
            String(types).toByteArray()
        }
        "args" -> {
            val args = mutableListOf<Byte>()
            for (i in message.args.size - 1 downTo 0) {
                val value = message.args[i]
                when (value) {
                    is String -> {
                        value.toByteArray().forEach { args.add(it) }
                        args.add(0) // Terminator
                    }
                    is Number -> {
                        args.add((value.toInt() shr 24).toByte())
                        args.add((value.toInt() shr 16).toByte())
                        args.add((value.toInt() shr 8).toByte())
                        args.add(value.toByte())
                    }
                    else -> logger().error("Invalid argument type {} for script {}.", value::class.java, message.id)
                }
            }
            args.toByteArray()
        }
        else -> throw Exception("Unhandled value key.")
    }

}
