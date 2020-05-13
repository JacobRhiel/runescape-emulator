package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageDecoder
import rs.emulator.buffer.type.DataType
import rs.emulator.buffer.type.order.DataOrder
import rs.emulator.buffer.type.transform.DataTransformation
import rs.emulator.packet.GamePacketReader
import rs.emulator.packet.network.message.impl.OpHeldDMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class OpHeldDDecoder : MessageDecoder<OpHeldDMessage>() {

    override fun decode(opcode: Int, reader: GamePacketReader): OpHeldDMessage
    {
        val dstSlot = reader.getSigned(DataType.SHORT, DataOrder.LITTLE, DataTransformation.ADD).toInt()
        val srcSlot = reader.getSigned(DataType.SHORT, DataTransformation.ADD).toInt()
        val insertMode = reader.getSigned(DataType.BYTE).toInt() == 1
        val componentHash = reader.getSigned(DataType.INT, DataOrder.MIDDLE).toInt()
        return OpHeldDMessage(
            srcSlot,
            dstSlot,
            componentHash,
            insertMode
        )
    }
}