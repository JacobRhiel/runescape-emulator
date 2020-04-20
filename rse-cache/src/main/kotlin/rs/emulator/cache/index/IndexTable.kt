package rs.emulator.cache.index

import io.netty.buffer.Unpooled
import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.BufferedWriter
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.index.archive.ArchiveConfig
import rs.emulator.cache.index.archive.ArchiveFile
import rs.emulator.cache.index.archive.entry.ArchiveEntry
import rs.emulator.utilities.logger
import java.util.*

/**
 *
 * @author Chk
 */
class IndexTable
{

    private var archives : SortedMap<Int, ArchiveFile> = TreeMap()

    var protocol: Int = 6

    var version: Int = 0

    var named: Boolean = true

    var hash: Int = 0

    var archiveCount = 0

    private var ids = intArrayOf()

    fun addArchive(archive: ArchiveFile): ArchiveFile
    {
        archives[archive.identifier] = archive
        archiveCount++
        return archives[archive.identifier]!!
    }

    fun unload()
    {
        archives.clear()
        protocol = 6
        version = 0
        named = true
        hash = 0
        archiveCount = 0
        ids = intArrayOf()
    }

    fun load(idx: Int, reader: BufferedReader)
    {

        decodeHeader(reader)

        generateArchiveFile(idx, reader)

        if (named)
            assignNameHash(reader)

        assignCrc(reader)

        assignVersion(reader)

        countArchiveFiles(reader)

        createArchiveTableEntry(reader)

        if (named)
            generateArchiveEntryNameHash(reader)

    }

    fun createWriter(): BufferedWriter
    {

        val writer = BufferedWriter()

        encodeHeader(writer)

        encodeArchiveIdentifier(writer)

        if (named)
            encodeNameHash(writer)

        encodeCrc(writer)

        encodeVersion(writer)

        encodeArchiveFiles(writer)

        encodeArchiveTableEntry(writer)

        if (named)
            encodeArchiveEntryNameHash(writer)

        return writer

    }

    private fun decodeHeader(reader: BufferedReader)
    {

        protocol = reader.getUnsigned(DataType.BYTE).toInt()

        require(!(protocol < 5 || protocol > 7)) { "Unsupported protocol: $protocol" }

        if(protocol >= 6)
            version = reader.getSigned(DataType.INT).toInt()

        hash = reader.getUnsigned(DataType.BYTE).toInt()

        named = 1 and hash != 0

        archiveCount = if(protocol >= 7) reader.bigSmart else reader.getUnsigned(DataType.SHORT).toInt()

        ids = IntArray(archiveCount) { it.inc() - 1 }

    }

    private fun encodeHeader(writer: BufferedWriter)
    {

        writer.put(DataType.BYTE, protocol)

        if(protocol >= 6)
            writer.put(DataType.INT, version)

        writer.put(DataType.BYTE, if(named) 1 else 0)

        writer.put(DataType.SHORT, archiveCount)

    }

    private fun generateArchiveFile(idx: Int, reader: BufferedReader)
    {

        val buffer = copyBufferToReader(reader, archiveCount * Short.SIZE_BYTES)

        println("sizes: " + ids.toTypedArray().contentDeepToString())

        for(identifier in ids.indices)
        {

            val archiveId = (if(protocol >= 7) buffer.bigSmart else buffer.getUnsigned(DataType.SHORT).toInt()) + if(identifier == 0) 0 else ids[identifier - 1]

            ids[identifier] = archiveId.also {

                val file = ArchiveFile(idx, it)

                archives[it] = file

            }

        }

    }

    private fun encodeArchiveIdentifier(writer: BufferedWriter)
    {

        for(identifier in archives.keys)
            writer.put(DataType.SHORT, archives.keys.first { it == identifier })

    }

    private fun assignNameHash(reader: BufferedReader)
    {

        val buffer = copyBufferToReader(reader, archiveCount * Int.SIZE_BYTES)

        archives.forEach { (identifier, _) ->

            val nameHash = buffer.getSigned(DataType.INT).toInt()

            archives[identifier]?.nameHash = nameHash

        }

    }

    private fun encodeNameHash(writer: BufferedWriter)
    {

        archives.forEach { (identifier, _) ->

            writer.put(DataType.INT, archives[identifier]!!.nameHash)

        }

    }

    private fun assignCrc(reader: BufferedReader)
    {

        val buffer = copyBufferToReader(reader, archiveCount * Int.SIZE_BYTES)

        archives.forEach { (identifier, _) ->

            val crc = buffer.getSigned(DataType.INT).toInt()

            archives[identifier]?.crc = crc

        }

    }

    private fun encodeCrc(writer: BufferedWriter)
    {

        archives.forEach { (identifier, _) ->

            writer.put(DataType.INT, archives[identifier]!!.crc)

        }

    }

    private fun assignVersion(reader: BufferedReader)
    {

        val buffer = copyBufferToReader(reader, archiveCount * Int.SIZE_BYTES)

        archives.forEach { (identifier, _) ->

            val version = buffer.getSigned(DataType.INT).toInt()

            archives[identifier]?.version = version

        }

    }

    private fun encodeVersion(writer: BufferedWriter)
    {
        archives.forEach { (identifier, _) ->

            writer.put(DataType.INT, archives[identifier]!!.version)

        }

    }

    private fun countArchiveFiles(reader: BufferedReader)
    {

        val buffer = copyBufferToReader(reader, archiveCount * Short.SIZE_BYTES)

        archives.forEach { (identifier, _) ->

            val count = if(protocol >= 7) buffer.bigSmart else buffer.getUnsigned(DataType.SHORT).toInt()

            archives[identifier]?.table?.entryCount = count

        }

    }

    private fun encodeArchiveFiles(writer: BufferedWriter)
    {

        archives.forEach { (identifier, _) ->

            writer.put(DataType.SHORT, archives[identifier]!!.table.entryCount)

        }

    }

    private fun createArchiveTableEntry(reader: BufferedReader)
    {

        archives.forEach { (identifier, _) ->

            val table = archives[identifier]?.table!!

            val count = table.entryCount

            val buffer = copyBufferToReader(reader, count * Short.SIZE_BYTES)

            for (index in 0 until count)
            {

                val entryIdentifier = if(protocol >= 7) buffer.bigSmart else buffer.getUnsigned(DataType.SHORT).toInt()

                table.lastEntryId += entryIdentifier

                val independent = entryIdentifier != 1

                table.entries[if(independent) entryIdentifier else table.lastEntryId] = ArchiveEntry(if(independent) entryIdentifier else table.lastEntryId)

            }

        }

    }

    private fun encodeArchiveTableEntry(writer: BufferedWriter)
    {

        archives.forEach { (identifier, _) ->

            val table = archives[identifier]?.table!!

            for (index in table.entries.keys)
                writer.put(DataType.SHORT, table.entries[index]!!.identifier)

        }

    }

    private fun generateArchiveEntryNameHash(reader: BufferedReader)
    {

        archives.forEach { (identifier, _) ->

            val table = archives[identifier]?.table!!

            val count = table.entryCount

            val buffer = copyBufferToReader(reader, count * Int.SIZE_BYTES)

            for (index in 0 until count)
            {

                val nameHash = buffer.getSigned(DataType.INT).toInt()

                table.entries[index]?.nameHash = nameHash

            }

        }

    }

    private fun encodeArchiveEntryNameHash(writer: BufferedWriter)
    {

        archives.forEach { (identifier, _) ->

            val table = archives[identifier]?.table!!

            for (index in table.entries.keys)
                writer.put(DataType.INT, table.entries[index]!!.nameHash)

        }

    }

    private fun copyBufferToReader(reader: BufferedReader, length: Int) : BufferedReader
    {

        val buffer = ByteArray(length)

        reader.readBytes(buffer, 0, length)

        return BufferedReader(Unpooled.wrappedBuffer(buffer))

    }

    fun fetchArchive(identifier: Int): ArchiveFile
    {

        if(!archives.filter { it.key == identifier }.any())
            logger().error("No ArchiveFile exists for config type: {}", identifier)

        println(archives.values.map { it.identifier }.toTypedArray().contentDeepToString())

        return archives.values.first { it.identifier == identifier }

    }

    fun fetchArchive(archiveConfig: ArchiveConfig): ArchiveFile = fetchArchive(archiveConfig.identifier)

    fun fetchArchiveFile(archiveConfig: ArchiveConfig, identifier: Int): ArchiveEntry
    {

        if(!archives.filter { it.key == identifier }.any())
            logger().error("No ArchiveFile exists for config type: {}", identifier)

        val table = archives[archiveConfig.identifier]!!.table

        return table.entries[identifier]!!

    }

    fun fetchAllArchives() = archives

    fun fetchNumberOfArchives() = archives.size

}