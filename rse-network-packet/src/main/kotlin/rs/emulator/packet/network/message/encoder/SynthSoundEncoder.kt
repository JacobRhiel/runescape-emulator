package rs.emulator.packet.network.message.encoder

import gg.rsmod.game.message.MessageEncoder
import rs.emulator.packet.network.message.impl.SynthSoundMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class SynthSoundEncoder : MessageEncoder<SynthSoundMessage>() {

    override fun extract(message: SynthSoundMessage, key: String): Number = when (key) {
        "sound" -> message.sound
        "volume" -> message.volume
        "delay" -> message.delay
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: SynthSoundMessage, key: String): ByteArray = throw Exception("Unhandled value key.")
}