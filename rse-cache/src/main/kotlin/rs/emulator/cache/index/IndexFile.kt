package rs.emulator.cache.index

import io.netty.buffer.Unpooled
import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.BufferedWriter
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.compression.Compressible
import rs.emulator.cache.compression.CompressionType
import rs.emulator.cache.security.Crc32
import rs.emulator.cache.index.archive.ArchiveConfig
import rs.emulator.cache.index.archive.ArchiveFile
import rs.emulator.cache.index.archive.entry.EntryData
import rs.emulator.fileStore
import rs.emulator.utilities.hash.Djb2
import rs.emulator.utilities.logger
import java.io.*

/**
 *
 * @author Chk
 */
open class IndexFile(
    val identifier: Int,
    val file: File
) : Compressible(), Saveable, Closeable
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

        println("idx: $identifier length: $length")

        if (length <= 0 || sector <= 0)
            logger().error("invalid length or sector {}/{}", length, sector)

        return EntryData(identifier, sector, length)

    }

    fun writeEntry(entry: EntryData)
    {

        val bufferedWriter = BufferedWriter(Unpooled.buffer(indexEntryLength))

        idx.seek(entry.identifier.times(indexEntryLength).toLong())

        val length = entry.length

        val sector = entry.sector

        bufferedWriter.put(DataType.TRI_BYTE, length)

        bufferedWriter.put(DataType.TRI_BYTE, sector)

        val array = bufferedWriter.toBufferedReader().byteArray()

        idx.write(array)

    }

    fun getOrCreateArchive(archive: ArchiveConfig, compressionType: CompressionType = CompressionType.NONE) = getOrCreateArchive(archive.identifier, compressionType)

    fun getOrCreateArchive(name: String, compressionType: CompressionType = CompressionType.NONE) = indexTable.fetchAllArchives().getOrElse(identifier) {
        logger().info("No ArchiveFile exists for identifier: {}, creating..", identifier)
        createArchive(identifier, name, true, compressionType)
    }

    fun getOrCreateArchive(identifier: Int, compressionType: CompressionType = CompressionType.NONE) = indexTable.fetchAllArchives().getOrElse(identifier) {
        logger().info("No ArchiveFile exists for identifier: {}, creating..", identifier)
        createArchive(identifier, compressionType = compressionType)
    }

    private fun createArchive(identifier: Int, name: String = "", named: Boolean = false, compressionType: CompressionType = CompressionType.NONE): ArchiveFile
    {
        val archive = ArchiveFile(this.identifier, identifier)
        archive.compression = compressionType
        if (named && name.isNotEmpty()) archive.nameHash = Djb2.hash(name)
        indexTable.addArchive(archive).save()
        /*this.save()
        indexTable.unload()
        fileStore.load(this.identifier)
        archive.loadEntries(fileStore.fetchArchiveBuffer(this.identifier, identifier))
        return indexTable.fetchArchive(identifier)*/
        return archive
    }

    fun fetchArchive(identifier: Int) = indexTable.fetchArchive(identifier)

    fun fetchArchive(archiveConfig: ArchiveConfig) = indexTable.fetchArchive(archiveConfig)

    fun fetchArchiveByName(name: String) = indexTable.fetchAllArchives().values.first { it.nameHash == Djb2.hash(name) }

    override fun save()
    {

        val data = indexTable.createWriter()

        val compressedReader = compress(fetchVersion(), fetchCompression(), data.toBufferedReader().byteArray())

        val entry = fileStore.datFile.write(fileStore.referenceTable.identifier, this.identifier, compressedReader.byteArray())

        fileStore.referenceTable.writeEntry(entry)

        val crc = Crc32()

        crc.update(compressedReader.byteArray(), 0, compressedReader.readableBytes)

        this.hash = crc.hash

    }

    override fun close() = idx.close()

}