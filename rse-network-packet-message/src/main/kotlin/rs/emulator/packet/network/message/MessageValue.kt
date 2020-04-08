package rs.emulator.packet.network.message

import rs.emulator.buffer.type.DataType
import rs.emulator.buffer.type.order.DataOrder
import rs.emulator.buffer.type.signature.DataSignature
import rs.emulator.buffer.type.transform.DataTransformation


/**
 * A [MessageValue] represents a single value which can be operated on throughout
 * a [Message]. A [Message] can hold multiple [MessageValue]s.
 *
 * @param id
 * A unique name that will be used to decode and encode the value.
 *
 * @author Tom <rspsmods@gmail.com>
 */
data class MessageValue(val id: String, val order: DataOrder, val transformation: DataTransformation, val type: DataType,
                        val signature: DataSignature
)