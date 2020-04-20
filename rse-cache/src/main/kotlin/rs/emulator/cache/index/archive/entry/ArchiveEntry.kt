package rs.emulator.cache.index.archive.entry

import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.compression.Compressible
import rs.emulator.utilities.logger

/**
 *
 * @author Chk
 */
class ArchiveEntry(
    val identifier: Int
) : Compressible()
{

    var nameHash: Int = 0

    var contents: ByteArray = byteArrayOf()

}