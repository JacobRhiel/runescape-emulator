package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.packet.GamePacketReader
import rs.emulator.packet.network.message.impl.ClientCheatMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class ClientCheatDecoder : MessageDecoder<ClientCheatMessage>() {

    override fun decode(opcode: Int, reader: GamePacketReader): ClientCheatMessage
    {
        return ClientCheatMessage(reader.string)
    }
}
