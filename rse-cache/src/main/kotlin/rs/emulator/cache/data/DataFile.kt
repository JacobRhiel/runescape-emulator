package rs.emulator.cache.data

import com.google.inject.Inject
import com.google.inject.Singleton
import io.netty.buffer.Unpooled
import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.BufferedWriter
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.index.archive.entry.EntryData
import rs.emulator.configuration.CacheConfiguration
import rs.emulator.utilities.logger
import java.io.*
import java.nio.ByteBuffer
import java.util.*

/**
 *
 * @author Chk
 */
@Singleton
class DataFile @Inject constructor(private val cacheConfiguration: CacheConfiguration) : Closeable
{

    private val dat =
        RandomAccessFile(cacheConfiguration.defaultDirectory().resolve("main_file_cache.dat2").toFile(), "rw")

    private val sectorSize = 520

    fun read(index: Int, archive: Int, sectorId: Int, size: Int): BufferedReader
    {

        if (sectorId <= 0L || dat.length() / sectorSize < sectorId.toLong())
            logger().error("bad read, index{}, dat length {}, requested sector {}", index, dat.length(), sectorId)

        val bufferedReader = BufferedReader(Unpooled.wrappedBuffer(ByteArray(sectorSize)))

        val bufferedWriter = BufferedWriter()

        var part = 0

        var readBytesCount = 0

        var nextSector: Int

        var sector = sectorId

        var headerSize: Byte

        var currentIndex: Int

        var currentPart: Int

        var currentArchive: Int

        while (size > readBytesCount)
        {

            if (sector == 0)
                logger().error("Unexpected EOF")

            dat.seek(sectorSize.times(sector).toLong())

            val archiveExceedsShort = archive > 0xFFFF

            headerSize = if(archiveExceedsShort) 10 else 8

            var dataBlockSize = size - readBytesCount

            if (dataBlockSize > sectorSize - headerSize)
                dataBlockSize = sectorSize - headerSize

            checkReadSize(index, archive, bufferedReader.byteArray(), 0, headerSize + dataBlockSize)

            bufferedReader.markReaderIndex()

            currentArchive = bufferedReader.getUnsigned(if(archiveExceedsShort) DataType.INT else DataType.SHORT).toInt()

            currentPart = bufferedReader.getUnsigned(DataType.SHORT).toInt()

            nextSector = bufferedReader.getUnsigned(DataType.TRI_BYTE).toInt()

            currentIndex = bufferedReader.getUnsigned(DataType.BYTE).toInt()

            println(bufferedReader.byteArray().toTypedArray().contentDeepToString())

            bufferedReader.resetReaderIndex()

            println("idx: $index current idx: $currentIndex - archive: $archive current archive: $currentArchive - sector: $sectorId next sector: $nextSector part: $part current part: $currentPart - size: $size")

            if (archive != currentArchive || currentPart != part || index != currentIndex)
                logger().error(
                    "Invalid sector read: index {} != current index {}, archive {} != current archive {}, part {} != current part {}",
                    index, currentIndex, archive, currentArchive, part, currentPart
                )

            if (nextSector < 0 || dat.length() / sectorSize < nextSector.toLong())
                logger().error("Invalid next sector")

            sector = nextSector

            bufferedWriter.putBytes(bufferedReader.byteArray(), headerSize.toInt(), dataBlockSize)

            readBytesCount += dataBlockSize

            ++part

        }

        val buffer = Arrays.copyOfRange(bufferedWriter.toBufferedReader().byteArray(), 0, bufferedWriter.length)

        return BufferedReader(Unpooled.wrappedBuffer(buffer))

    }

    fun write(idx: Int, archive: Int, compressedData: ByteArray): EntryData
    {

        var sector: Int

        var startSector: Int

        val writer = BufferedWriter(Unpooled.buffer(sectorSize))

        val data = ByteBuffer.wrap(compressedData)

        val length = compressedData.size

        sector = ((dat.length() + (sectorSize - 1)) / sectorSize).toInt()

        if (sector == 0)
            sector = 1

        startSector = sector

        var part = 0

        var offset = 0

        while (offset < length)
        {

            var nextSector = sector + 1

            var dataLength: Int

            val excessArchiveId = archive > 0xFFFF

            if (length - offset <= if(excessArchiveId) 510 else 512)
                nextSector = 0

            writeHeader(archive, part, sector, nextSector, idx, excessArchiveId)

            dataLength = length - offset
            if (dataLength > if(excessArchiveId) 510 else 512)
                dataLength = if(excessArchiveId) 510 else 512

            data.get(writer.toRawBufferedReader().byteArray(), 0, dataLength)

            dat.write(writer.toRawBufferedReader().byteArray(), 0, dataLength)

            offset += dataLength

            sector = nextSector

            part++

        }

        return EntryData(archive, startSector, compressedData.size)

    }

    private fun writeHeader(archive: Int, part: Int, sector: Int, nextSector: Int, idx: Int, excessArchiveId: Boolean)
    {

        val writer = BufferedWriter()

        writer.put(if(excessArchiveId) DataType.INT else DataType.SHORT, archive)
        writer.put(DataType.SHORT, part)
        writer.put(DataType.TRI_BYTE, nextSector)
        writer.put(DataType.BYTE, idx)

        dat.seek((sectorSize * sector).toLong())

        dat.write(writer.toBufferedReader().byteArray(), 0, if(excessArchiveId) 10 else 8)

    }

    private fun checkReadSize(index: Int, archive: Int, bytes: ByteArray, offset: Int, length: Int)
    {

        val bytesRead = dat.read(bytes, offset, length)

        if (bytesRead != length)
            logger().error("Short read when reading file data for {}/{}", index, archive)

    }

    override fun close() = dat.close()

}