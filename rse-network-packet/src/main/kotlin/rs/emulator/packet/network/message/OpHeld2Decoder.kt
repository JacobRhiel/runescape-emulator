package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.buffer.type.DataType
import rs.emulator.buffer.type.order.DataOrder
import rs.emulator.buffer.type.transform.DataTransformation
import rs.emulator.packet.GamePacketReader
import rs.emulator.packet.network.message.impl.OpHeld2Message

/**
 * @author Tom <rspsmods@gmail.com>
 */
class OpHeld2Decoder : MessageDecoder<OpHeld2Message>() {

    override fun decode(opcode: Int, reader: GamePacketReader): OpHeld2Message
    {
        val hash = reader.getSigned(DataType.INT).toInt()
        val item = reader.getSigned(DataType.SHORT, DataTransformation.ADD).toInt()
        val slot = reader.getSigned(DataType.SHORT, DataOrder.LITTLE, DataTransformation.ADD).toInt()

        return OpHeld2Message(
            if (item == 0xFFFF) -1 else item,
            if (slot == 0xFFFF) -1 else slot,
            hash
        )
    }
}