package rs.emulator.packet.network.message

import gg.rsmod.game.message.MessageEncoder
import rs.emulator.packet.network.message.impl.UpdateInvFullMessage
import rs.emulator.buffer.type.DataType
import rs.emulator.buffer.type.order.DataOrder
import rs.emulator.buffer.type.transform.DataTransformation
import rs.emulator.packet.GamePacketBuilder
import rs.emulator.utilities.logger

/**
 * @author Tom <rspsmods@gmail.com>
 */
class UpdateInvFullEncoder : MessageEncoder<UpdateInvFullMessage>() {

    override fun extract(message: UpdateInvFullMessage, key: String): Number = when (key)
    {
        "component_hash" -> message.componentHash
        "container_key" -> message.containerKey
        "item_count" -> message.items.size
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: UpdateInvFullMessage, key: String): ByteArray = when (key)
    {
        "items" -> {

            /**
             * NOTE(Tom): this can change per revision, so figure out a way
             * to externalize the structure.
             */
            val buf = GamePacketBuilder()
            message.items.forEach { item ->
                //if (item != null) {
                    buf.put(DataType.SHORT, DataOrder.LITTLE, DataTransformation.ADD, item.key + 1)
                    buf.put(DataType.BYTE, DataTransformation.NEGATE, Math.min(255, item.value))
                    if (item.value >= 255) {
                        buf.put(DataType.INT, DataOrder.INVERSED_MIDDLE, item.value)
                    }
               /* } else {
                    buf.put(DataType.SHORT, DataTransformation.ADD, 0)
                    buf.put(DataType.BYTE, DataTransformation.NEGATE, 0)
                }*/
            }
            val data = ByteArray(buf.byteBuf.readableBytes())
            buf.byteBuf.readBytes(data)
            data
        }
        else -> throw Exception("Unhandled value key.")
    }
}