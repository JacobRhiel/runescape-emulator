package rs.emulator.cache.index.archive

import io.netty.buffer.Unpooled
import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.compression.Compressible
import rs.emulator.cache.compression.CompressionType
import rs.emulator.utilities.logger




/**
 *
 * @author Chk
 */
class ArchiveFile(
    val identifier: Int
) : Compressible()
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

    fun loadEntries(reader: BufferedReader): BufferedReader
    {

        val entries = table.entries.keys.toIntArray()


        val buffer = decompress(reader, null)

        if(!checkCompression()) return BufferedReader(Unpooled.EMPTY_BUFFER)

        if(entries.size == 1)
            table.entries.values.first()?.contents = buffer.byteArray()

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
        {
            table.entries[entries[i]]?.contents = fileContents[i]!!
            //println("file: " + i + ", " + table.entries[entries[i]]?.contents?.toTypedArray()?.contentDeepToString())
        }

        return buffer

    }

}