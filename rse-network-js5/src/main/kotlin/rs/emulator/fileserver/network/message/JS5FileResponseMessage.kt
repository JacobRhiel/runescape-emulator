package rs.emulator.fileserver.network.message

import rs.emulator.buffer.BufferedReader
import rs.emulator.network.shared.message.NetworkMessage

/**
 *
 * @author Chk
 */
data class JS5FileResponseMessage(val index: Int, val archive: Int, val buffer: ByteArray) : NetworkMessage
{
    override fun equals(other: Any?): Boolean
    {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as JS5FileResponseMessage

        if (index != other.index) return false
        if (archive != other.archive) return false
        if (!buffer.contentEquals(other.buffer)) return false

        return true
    }

    override fun hashCode(): Int
    {
        var result = index
        result = 31 * result + archive
        result = 31 * result + buffer.contentHashCode()
        return result
    }
}