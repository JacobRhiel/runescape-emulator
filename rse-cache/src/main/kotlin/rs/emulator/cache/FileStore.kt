package rs.emulator.cache

import com.google.common.primitives.Ints
import com.google.inject.Inject
import com.google.inject.Singleton
import io.netty.buffer.Unpooled
import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.BufferedWriter
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.compression.CompressionType
import rs.emulator.cache.data.DataFile
import rs.emulator.cache.index.IndexConfig
import rs.emulator.cache.index.IndexFile
import rs.emulator.cache.index.archive.ArchiveConfig
import rs.emulator.cache.index.archive.ArchiveFile
import rs.emulator.cache.index.archive.entry.ArchiveEntry
import rs.emulator.cache.reference.ReferenceTable
import rs.emulator.utilities.logger
import java.io.File
import java.util.*

/**
 *
 * @author Chk
 */
@Singleton class FileStore @Inject constructor()
{

    @Inject internal lateinit var referenceTable: ReferenceTable

    @Inject internal lateinit var datFile: DataFile

    private val indexes = mutableListOf<IndexFile>()

    fun close()
    {

        datFile.close()

        referenceTable.close()

        indexes.forEach { it.close() }

    }

    fun init()
    {

        val count = referenceTable.getIndexCount()

        for (index in 0 until count)
        {

            indexes.add(IndexFile(index, File("./data/cache/main_file_cache.idx$index")))

            load(index)

        }

        logger().info("Loaded {} indexes.", indexes.size)

    }

    internal fun load(identifier: Int)
    {

        println("loading index: $identifier")

        val idxEntry = referenceTable.readIndex(indexes[identifier])

        val idxBuffer = datFile.read(referenceTable.identifier, idxEntry.identifier, idxEntry.sector, idxEntry.length)

        val decompressedBuffer = indexes[identifier].decompress(idxBuffer)

        indexes[identifier].indexTable.load(identifier, decompressedBuffer)

    }

    fun getOrCreateIndex(idx: IndexConfig) = getOrCreateIndex(idx.identifier)

    fun getOrCreateIndex(identifier: Int)  = indexes.getOrElse(identifier) {
        logger().info("No IndexFile exists for identifier: {}, creating..", identifier)
        indexes.add(IndexFile(identifier, File("./data/cache/main_file_cache.idx$identifier")))
        indexes[identifier]
    }

    private fun createIndex(idx: IndexConfig): IndexFile = createIndex(idx.identifier)

    private fun createIndex(identifier: Int): IndexFile
    {

        if(indexes.any { it.identifier == identifier })
            return getOrCreateIndex(identifier)

        indexes.add(IndexFile(identifier, File("./data/cache/main_file_cache.idx$identifier")))

        return indexes[identifier]

    }

    fun fetchIndexCrcHashes() = indexes.filter { it.identifier <= 20 }.map { it.fetchCrcHash() }.toIntArray()

    fun fetchIndexHeaderBuffer(): BufferedWriter
    {

        val writer = BufferedWriter()

        writer.put(DataType.BYTE, CompressionType.NONE.opcode)

        writer.put(DataType.INT, indexes.size * 8)

        indexes.forEach {
            writer.put(DataType.INT, it.fetchCrcHash())
            writer.put(DataType.INT, it.indexTable.version)
        }

        val test = BufferedWriter(Unpooled.wrappedBuffer(writer.byteBuf.array().copyOf(writer.byteBuf.readableBytes())))

        return test

    }

    fun fetchIndexTableData(identifier: Int): BufferedReader
    {

        val idxEntry = referenceTable.readIndex(indexes[identifier])

        return datFile.read(referenceTable.identifier, idxEntry.identifier, idxEntry.sector, idxEntry.length)

    }

    fun fetchIndexes() = indexes.toList()

    fun fetchIndex(identifier: Int): IndexFile
    {

        if (!indexes.filter { it.identifier == identifier }.any())
            logger().error("No IndexFile exists for identifier: {}", identifier)

        return indexes[identifier]

    }

    fun fetchArchiveBuffer(index: Int, archive: Int): BufferedReader
    {

        val index = fetchIndex(index)

        val archive = index.fetchArchive(archive)

        val entryData = index.readArchive(archive)

        return datFile.read(index.identifier, archive.identifier, entryData.sector, entryData.length)

    }

    fun fetchArchiveBuffer(indexConfig: IndexConfig, archiveConfig: ArchiveConfig): BufferedReader = fetchArchiveBuffer(indexConfig.identifier, archiveConfig.identifier)

    fun fetchArchives(indexConfig: IndexConfig) = fetchArchives(indexConfig.identifier)

    fun fetchArchives(indexIdentifier: Int) : SortedMap<Int, ArchiveFile>
    {

        val index = fetchIndex(indexIdentifier)

        return index.indexTable.fetchAllArchives()

    }

    fun fetchArchiveCompressed(index: Int, archive: Int) : BufferedReader
    {

        var data = fetchArchiveBuffer(index, archive).byteArray()

        val compressionType = CompressionType.compressionForOpcode(data[0].toInt())

        val length = Ints.fromBytes(data[1], data[2], data[3], data[4])

        val expectedLength = length + (if(compressionType != CompressionType.NONE) 9 else 5)

        if (expectedLength != length && data.size - expectedLength == 2)
            data = data.copyOf(data.size - 2)

        return BufferedReader(Unpooled.wrappedBuffer(data))

    }

    fun fetchArchiveCompressed(indexConfig: IndexConfig, archiveConfig: ArchiveConfig): BufferedReader = fetchArchiveCompressed(indexConfig.identifier, archiveConfig.identifier)

    fun fetchArchiveFile(indexConfig: IndexConfig, archiveConfig: ArchiveConfig, identifier: Int): ArchiveEntry
    {

        val index = fetchIndex(indexConfig.identifier)

        val archive = index.fetchArchive(archiveConfig)

        val table = archive.table

        //todo memory efficiency.
        archive.loadEntries(fetchArchiveBuffer(indexConfig, archiveConfig))

        //todo check if null
        return table.entries.values.first { it.identifier == identifier }

    }

    fun fetchArchiveFile(indexIdentifier: Int, archiveIdentifier: Int, identifier: Int): ArchiveEntry
    {

        val index = fetchIndex(indexIdentifier)

        val archive = index.fetchArchive(archiveIdentifier)

        val table = archive.table

        //todo memory efficiency.
        archive.loadEntries(fetchArchiveBuffer(indexIdentifier, archiveIdentifier))

       //println("archive entry keys: " + table.entries.keys.toTypedArray().contentDeepToString())

        //todo check if null
        return table.entries.values.first { it.identifier == identifier }

    }

    fun fetchArchiveFileByName(indexIdentifier: Int, name: String): ArchiveEntry
    {

        val index = fetchIndex(indexIdentifier)

        val archive = index.fetchArchiveByName(name)

        val table = archive.table

        //todo memory efficiency.
        archive.loadEntries(fetchArchiveBuffer(indexIdentifier, archive.identifier))

        //todo check if null
        return table.entries[archive.identifier]!!

    }

    fun fetchArchiveFileByName(indexIdentifier: Int, name: String, identifier: Int): ArchiveEntry
    {

        val index = fetchIndex(indexIdentifier)

        val archive = index.fetchArchiveByName(name)

        val table = archive.table

        //todo memory efficiency.
        archive.loadEntries(fetchArchiveBuffer(indexIdentifier, archive.identifier))

        //todo check if null
        return table.entries[identifier]!!

    }

    fun fetchArchiveFiles(indexConfig: IndexConfig, archiveConfig: ArchiveConfig): List<ArchiveEntry> = fetchArchiveFiles(indexConfig, archiveConfig.identifier)

    fun fetchArchiveFiles(indexConfig: IndexConfig, archiveIdentifier: Int): List<ArchiveEntry>
    {

        val index = fetchIndex(indexConfig.identifier)

        val archive = index.fetchArchive(archiveIdentifier)

        val table = archive.table

        archive.loadEntries(fetchArchiveBuffer(indexConfig.identifier, archiveIdentifier))

        return table.entries.values.toTypedArray().toList()

    }

}