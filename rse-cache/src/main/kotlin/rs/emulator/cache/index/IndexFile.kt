package rs.emulator.cache.index

import io.netty.buffer.Unpooled
import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.compression.Compressible
import rs.emulator.cache.compression.CompressionType
import rs.emulator.cache.compression.CompressionType.*
import rs.emulator.cache.index.archive.ArchiveConfig
import rs.emulator.cache.index.archive.ArchiveFile
import rs.emulator.cache.index.archive.entry.EntryData
import rs.emulator.utilities.logger
import java.io.*
import java.util.zip.CRC32

/**
 *
 * @author Chk
 */
open class IndexFile(
    val identifier: Int,
    val file: File
) : Compressible(), Closeable
{

    private val indexEntryLength = 6

    protected val idx = RandomAccessFile(file, "rw")

    val indexTable = IndexTable()

    fun readArchive(archive: ArchiveFile): EntryData
    {

        val identifier = archive.identifier

        return readEntry(identifier)

    }

    protected fun readEntry(identifier: Int): EntryData
    {

        val bufferedReader = BufferedReader(ByteArray(indexEntryLength))

        idx.seek(identifier.times(indexEntryLength).toLong())

        val i = idx.read(bufferedReader.byteArray())

        if (i != indexEntryLength)
            logger().error("short read for id {} on index {}: {}", identifier, identifier, i)

        val length = bufferedReader.getSigned(DataType.TRI_BYTE).toInt()

        val sector = bufferedReader.getSigned(DataType.TRI_BYTE).toInt()

        if (length <= 0 || sector <= 0)
            logger().error("invalid length or sector {}/{}", length, sector)

        return EntryData(identifier, sector, length)

    }

    fun fetchArchive(identifier: Int) = indexTable.fetchArchive(identifier)

    fun fetchArchive(archiveConfig: ArchiveConfig) = indexTable.fetchArchive(archiveConfig)

    override fun close() = idx.close()

}