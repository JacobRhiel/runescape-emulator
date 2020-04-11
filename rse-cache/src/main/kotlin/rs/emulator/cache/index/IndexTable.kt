package rs.emulator.cache.index

import io.netty.buffer.Unpooled
import rs.emulator.buffer.BufferedReader
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

    var protocol: Int = 0

    var version: Int = 0

    var named: Boolean = false

    var hash: Int = 0

    var archiveCount = 0

    fun load(reader: BufferedReader)
    {

        decodeHeader(reader)

        generateArchiveFile(reader)

        if (named)
            assignNameHash(reader)

        assignCrc(reader)

        assignVersion(reader)

        countArchiveFiles(reader)

        createArchiveTableEntry(reader)

        if (named)
            generateArchiveEntryNameHash(reader)

    }

    private fun decodeHeader(reader: BufferedReader)
    {

        protocol = reader.getUnsigned(DataType.BYTE).toInt()

        require(!(protocol < 5 || protocol > 7)) { "Unsupported protocol" }

        if(protocol >= 6)
            version = reader.getSigned(DataType.INT).toInt()

        hash = reader.getUnsigned(DataType.BYTE).toInt()

        named = 1 and hash != 0

        require(hash and 1.inv() == 0) { "Unknown flags" }

        assert(hash and 3.inv() == 0)

        archiveCount = reader.getUnsigned(DataType.SHORT).toInt()

        ids = IntArray(archiveCount)

    }

    private lateinit var ids: IntArray

    private fun generateArchiveFile(reader: BufferedReader)
    {

        val buffer = copyBufferToReader(reader, archiveCount * Short.SIZE_BYTES)

        for(identifier in ids.indices)
        {

            val archiveId = buffer.getUnsigned(DataType.SHORT).toInt() + if(identifier == 0) 0 else ids[identifier - 1]

            ids[identifier] = archiveId.also {

                val file = ArchiveFile(it)

                archives[it] = file

            }

        }

    }

    private fun assignNameHash(reader: BufferedReader)
    {

        val buffer = copyBufferToReader(reader, archiveCount * Int.SIZE_BYTES)

        archives.forEach { (identifier, _) ->

            val nameHash = buffer.getSigned(DataType.INT).toInt()

            archives[identifier]?.nameHash = nameHash

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

    private fun assignVersion(reader: BufferedReader)
    {

        val buffer = copyBufferToReader(reader, archiveCount * Int.SIZE_BYTES)

        archives.forEach { (identifier, _) ->

            val version = buffer.getSigned(DataType.INT).toInt()

            archives[identifier]?.version = version

        }

    }

    private fun countArchiveFiles(reader: BufferedReader)
    {

        val buffer = copyBufferToReader(reader, archiveCount * Short.SIZE_BYTES)

        archives.forEach { (identifier, _) ->

            val count = buffer.getUnsigned(DataType.SHORT).toInt()

            archives[identifier]?.table?.entryCount = count

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

                val entryIdentifier = buffer.getUnsigned(DataType.SHORT).toInt()

                table.lastEntryId += entryIdentifier

                table.entries[table.lastEntryId] = ArchiveEntry(table.lastEntryId)

            }

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

        return archives[identifier]!!

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