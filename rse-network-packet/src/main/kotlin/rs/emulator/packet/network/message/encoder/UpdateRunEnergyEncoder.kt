package rs.emulator.packet.network.message.encoder

import gg.rsmod.game.message.MessageEncoder
import rs.emulator.packet.network.message.impl.UpdateRunEnergyMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class UpdateRunEnergyEncoder : MessageEncoder<UpdateRunEnergyMessage>() {

    override fun extract(message: UpdateRunEnergyMessage, key: String): Number = when (key) {
        "energy" -> message.energy
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: UpdateRunEnergyMessage, key: String): ByteArray = throw Exception("Unhandled value key.")
}