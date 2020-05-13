package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.buffer.type.DataType
import rs.emulator.buffer.type.order.DataOrder
import rs.emulator.packet.GamePacketReader
import rs.emulator.packet.network.message.impl.OpHeld1Message

/**
 * @author Tom <rspsmods@gmail.com>
 */
class OpHeld1Decoder : MessageDecoder<OpHeld1Message>() {

    override fun decode(opcode: Int, reader: GamePacketReader): OpHeld1Message
    {
        val item = reader.getUnsigned(DataType.SHORT, DataOrder.LITTLE).toInt()
        val hash = reader.getSigned(DataType.INT, DataOrder.LITTLE).toInt()
        val slot = reader.getSigned(DataType.SHORT).toInt()
        return OpHeld1Message(
            if (item == 0xFFFF) -1 else item,
            if (slot == 0xFFFF) -1 else slot,
            hash
        )
    }
}