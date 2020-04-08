package rs.emulator.cache.index.archive.entry

import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.type.DataType
import rs.emulator.utilities.logger

/**
 *
 * @author Chk
 */
class ArchiveEntry(
    val identifier: Int
)
{

    var nameHash: Int = 0

    lateinit var contents: ByteArray

}