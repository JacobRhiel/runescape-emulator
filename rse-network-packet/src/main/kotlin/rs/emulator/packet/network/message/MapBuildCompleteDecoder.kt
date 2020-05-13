package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.packet.GamePacketReader
import rs.emulator.packet.network.message.impl.MapBuildCompleteMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class MapBuildCompleteDecoder : MessageDecoder<MapBuildCompleteMessage>() {

    override fun decode(opcode: Int, reader: GamePacketReader): MapBuildCompleteMessage =
        MapBuildCompleteMessage()
}