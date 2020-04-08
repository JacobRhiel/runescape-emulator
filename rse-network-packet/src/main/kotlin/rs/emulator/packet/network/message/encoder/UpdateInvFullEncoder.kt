package rs.emulator.packet.network.message.encoder

import gg.rsmod.game.message.MessageEncoder
import rs.emulator.packet.network.message.impl.UpdateInvFullMessage
import gg.rsmod.net.packet.GamePacketBuilder
import rs.emulator.buffer.type.DataType
import rs.emulator.buffer.type.order.DataOrder

/**
 * @author Tom <rspsmods@gmail.com>
 */
class UpdateInvFullEncoder : MessageEncoder<UpdateInvFullMessage>() {

    override fun extract(message: UpdateInvFullMessage, key: String): Number = when (key) {
        "component_hash" -> message.componentHash
        "container_key" -> message.containerKey
        "item_count" -> message.items.size
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: UpdateInvFullMessage, key: String): ByteArray = when (key) {
        "items" -> {

            /**
             * NOTE(Tom): this can change per revision, so figure out a way
             * to externalize the structure.
             */
            val buf = GamePacketBuilder()
            message.items.forEach { item ->
                if (item != null) {
                    buf.put(DataType.SHORT, item.id + 1)
                    buf.put(DataType.BYTE, Math.min(255, item.amount))
                    if (item.amount >= 255) {
                        buf.put(DataType.INT, DataOrder.INVERSED_MIDDLE, item.amount)
                    }
                } else {
                    buf.put(DataType.SHORT, 0)
                    buf.put(DataType.BYTE, 0)
                }
            }
            val data = ByteArray(buf.byteBuf.readableBytes())
            buf.byteBuf.readBytes(data)
            data
        }
        else -> throw Exception("Unhandled value key.")
    }
}