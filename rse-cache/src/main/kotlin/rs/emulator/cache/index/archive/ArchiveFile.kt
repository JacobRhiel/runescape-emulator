package rs.emulator.cache.index.archive

import io.netty.buffer.Unpooled
import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.BufferedWriter
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.compression.*
import rs.emulator.cache.index.Saveable
import rs.emulator.cache.index.archive.entry.ArchiveEntry
import rs.emulator.cache.index.archive.entry.EntryData
import rs.emulator.cache.security.Crc32
import rs.emulator.fileStore
import rs.emulator.utilities.logger
import java.nio.ByteBuffer

/**
 *
 * @author Chk
 */
class ArchiveFile(
    val parentIdx: Int,
    val identifier: Int
) : Compressible(), Saveable
{

    var nameHash: Int = 0

    var crc: Int = 0

    var version: Int = 0

    var compression = CompressionType.NONE

    val table = ArchiveTable()

    private fun checkCompression() : Boolean
    {

        val crc = fetchCrcHash()

        if(this.crc != crc)
        {
            logger().error("crc mismatch {}, {}", this.crc, crc)
            return false
        }

        val version = fetchVersion()

        if(version != -1 && this.version != version)
        {
            logger().warn("version mismatch")
            this.version = version //todo: investigate
        }

        this.compression = fetchCompression()

        return true

    }

    fun loadEntries(reader: BufferedReader)
    {

        val entries = table.entries.keys.toIntArray()

        val buffer = decompress(reader, null)

        if(!checkCompression()) return

        if(entries.isEmpty())
            return
        else if(entries.size == 1)
        {
            table.entries.values.first()?.contents = buffer.byteArray()
            return
        }

        buffer.markReaderIndex(buffer.readableBytes - 1)

        val chunks = buffer.getUnsigned(DataType.BYTE).toInt()

        buffer.resetReaderIndex()

        buffer.markReaderIndex(buffer.readableBytes - 1 - chunks * entries.size * 4)

        val chunkSizes = Array(entries.size) { IntArray(chunks) }

        val filesSize = IntArray(entries.size)

        for (chunk in 0 until chunks)
        {
            var chunkSize = 0
            for (id in entries.indices)
            {
                val delta: Int = buffer.getSigned(DataType.INT).toInt()
                chunkSize += delta // size of this chunk
                chunkSizes[id][chunk] = chunkSize // store size of chunk
                filesSize[id] += chunkSize // add chunk size to file size
            }
        }
        val fileContents = arrayOfNulls<ByteArray>(entries.size)
        val fileOffsets = IntArray(entries.size)

        for (i in entries.indices)
            fileContents[i] = ByteArray(filesSize[i])

        buffer.resetReaderIndex()

        for (chunk in 0 until chunks)
        {
            for (id in entries.indices)
            {
                val chunkSize = chunkSizes[id][chunk]
                buffer.readBytes(fileContents[id]!!, fileOffsets[id], chunkSize)
                fileOffsets[id] += chunkSize
            }
        }

        for(i in entries.indices)
            table.entries[entries[i]]?.contents = fileContents[i]!!

    }

    fun fetchEntry(identifier: Int) = table.entries[identifier]

    fun getOrCreateEntry(identifier: Int) = table.entries.getOrElse(identifier)
    {
        logger().info("Entry {} did not exist, creating..", identifier)
        val entry = ArchiveEntry(identifier)
        table.entries[entry.identifier] = entry
        table.lastEntryId += entry.identifier
        table.entryCount++
        table.entries[identifier]!!
    }

    internal fun saveEntries() : BufferedReader
    {

        var size = 0

        table.entries.forEach { size += it.value.contents.size }

        val buffer = Unpooled.buffer(size + table.entries.size * 4)

        val entryCount = table.entryCount

        val emptyByteArray = byteArrayOf()

        when (entryCount)
        {
            0    -> return BufferedReader(emptyByteArray)
            1    -> buffer.writeBytes(table.entries.values.first().contents)
            else -> table.entries.forEach { buffer.writeBytes(it.value.contents) }
        }

        val keys = table.entries.keys

        table.entries.forEach { (index, entry) ->

            val chunkSize = entry.contents.size

            val previousChunkSize = if(keys.indexOf(index) == 0) 0 else table.entries[keys.toTypedArray()[keys.indexOf(index) - 1]]?.contents?.size ?: 0

            buffer.writeInt(chunkSize - previousChunkSize)

        }

        buffer.writeByte(1)

        return BufferedReader(buffer.copy(0, buffer.readableBytes()))

    }

    override fun save()
    {

        val reader = compress(version, fetchCompression(), saveEntries().byteArray())

        val entry = fileStore.datFile.write(parentIdx, identifier, reader.byteArray())

        fileStore.fetchIndex(parentIdx).writeEntry(entry)

        reader.markReaderIndex()

        val compression = CompressionType.compressionForOpcode(reader.getSigned(DataType.BYTE).toInt())

        val compressedSize = reader.getSigned(DataType.INT).toInt()

        reader.resetReaderIndex()

        val length = 1 + 4 + compressedSize + (if(compression != CompressionType.NONE) 4 else 0)

        val crc = Crc32()

        crc.update(reader.byteArray(), 0, length)

        this.crc = crc.hash

    }


}