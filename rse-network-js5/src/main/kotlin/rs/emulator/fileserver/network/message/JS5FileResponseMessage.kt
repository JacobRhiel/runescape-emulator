package rs.emulator.fileserver.network.message

import io.netty.buffer.ByteBuf
import rs.emulator.buffer.BufferedReader
import rs.emulator.network.shared.message.NetworkMessage

/**
 *
 * @author Chk
 */
data class JS5FileResponseMessage(val index: Int, val archive: Int, val buffer: BufferedReader) : NetworkMessage
{
}