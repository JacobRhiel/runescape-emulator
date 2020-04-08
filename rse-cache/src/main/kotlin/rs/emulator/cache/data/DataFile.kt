package rs.emulator.cache.data

import com.google.inject.Inject
import com.google.inject.Singleton
import io.netty.buffer.Unpooled
import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.BufferedWriter
import rs.emulator.buffer.type.DataType
import rs.emulator.configuration.CacheConfiguration
import rs.emulator.utilities.logger
import java.io.*
import java.util.*

/**
 *
 * @author Chk
 */
@Singleton class DataFile @Inject constructor(private val cacheConfiguration: CacheConfiguration)
    : Closeable
{

    private val dat = RandomAccessFile(cacheConfiguration.defaultDirectory().resolve("main_file_cache.dat2").toFile(), "rw")

    private val sectorSize = 520

    fun read(index: Int, archive: Int, sectorId: Int, size: Int): BufferedReader
    {

        if (sectorId <= 0L || dat.length() / sectorSize < sectorId.toLong())
            logger().error("bad read, dat length {}, requested sector {}", dat.length(), sectorId)

        val bufferedReader = BufferedReader(Unpooled.wrappedBuffer(ByteArray(sectorSize)))

        val bufferedWriter = BufferedWriter()

        var part = 0

        var readBytesCount = 0

        var nextSector: Int

        var sector = sectorId

        val headerSize: Byte = 8

        var currentIndex: Int

        var currentPart: Int

        var currentArchive: Int

        while (size > readBytesCount)
        {

            if (sector == 0)
                logger().error("Unexpected EOF")

            dat.seek(sectorSize.times(sector).toLong())

            var dataBlockSize = size - readBytesCount

            if (dataBlockSize > sectorSize - headerSize)
                dataBlockSize = sectorSize - headerSize

            checkReadSize(index, archive, bufferedReader.byteArray(), 0, headerSize + dataBlockSize)

            bufferedReader.markReaderIndex()

            currentArchive = bufferedReader.getUnsigned(DataType.SHORT).toInt()

            currentPart = bufferedReader.getUnsigned(DataType.SHORT).toInt()

            nextSector = bufferedReader.getUnsigned(DataType.TRI_BYTE).toInt()

            currentIndex = bufferedReader.getUnsigned(DataType.BYTE).toInt()

            bufferedReader.resetReaderIndex()

            if (archive != currentArchive || currentPart != part || index != currentIndex)
                logger().error("Invalid sector read: index {} != current index {}, archive {} != current archive {}, part {} != current part {}",
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

    private fun checkReadSize(index: Int, archive: Int, bytes: ByteArray, offset: Int, length: Int)
    {

        val bytesRead = dat.read(bytes, offset, length)

        if (bytesRead != length)
            logger().error("Short read when reading file data for {}/{}", index, archive)

    }

    override fun close() = dat.close()

}