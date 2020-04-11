package rs.emulator.cache.compression

import com.google.common.primitives.Bytes
import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.BufferedWriter
import rs.emulator.buffer.type.DataType
import rs.emulator.encryption.isaac.XTEA

/**
 *
 * @author Chk
 */
abstract class Compressible
{

    private var hash: Int = 0

    private var version: Int = 0

    private var compressionType = CompressionType.NONE

    fun compress(version: Int, compression: CompressionType, writer: BufferedWriter): BufferedReader = compress(version, compression, writer, null)

    fun compress(version: Int, compression: CompressionType, writer: BufferedWriter, keys: IntArray?): BufferedReader
    {

        val reader = writer.toBufferedReader()

        var compressedData: ByteArray

        val length: Int

        when (compression)
        {
            CompressionType.NONE ->
            {
                compressedData = reader.byteArray()
                length = compressedData.size
            }
            CompressionType.BZIP  ->
            {
                compressedData = Bytes.concat(ByteArray(writer.readableBytes), BZip2.compress(reader.byteArray()))

                length = compressedData.size - 4

            }
            CompressionType.GZIP   ->
            {
                compressedData = Bytes.concat(ByteArray(writer.readableBytes), GZip.compress(reader.byteArray()))

                length = compressedData.size - 4
            }
        }

        compressedData = encrypt(keys, compressedData, compressedData.size)

        writer.put(DataType.BYTE, compression.opcode)

        writer.put(DataType.INT, length)

        writer.putBytes(compressedData)

        if (version != -1)
            writer.put(DataType.SHORT, version)

        return writer.toBufferedReader()

    }

    fun decompress(reader: BufferedReader): BufferedReader = decompress(reader, null)

    fun decompress(reader: BufferedReader, keys: IntArray?): BufferedReader
    {

        val opcode = reader.getUnsigned(DataType.BYTE).toInt()

        val compressionType = CompressionType.compressionForOpcode(opcode) //todo return null

        val compressedLength = reader.getSigned(DataType.INT).toInt()

        if (compressedLength < 0 || compressedLength > 1000000)
            throw RuntimeException("Invalid data")

        val crc32 = Crc32()

        crc32.update(reader.byteArray(), 0, 5) // compression + length

        var data = byteArrayOf()

        var encryptedData: ByteArray

        var decryptedData: ByteArray

        when(compressionType)
        {

            CompressionType.NONE ->
            {
                encryptedData = fetchEncryptedData(crc32, reader, compressedLength)
                decryptedData = decrypt(encryptedData, encryptedData.size, keys)
                data = decryptedData
            }

            CompressionType.BZIP ->
            {

                encryptedData = fetchEncryptedData(crc32, reader, compressedLength + 4)

                decryptedData = decrypt(encryptedData, encryptedData.size, keys)

                val stream = BufferedReader(decryptedData)

                val decompressedLength: Int = stream.getUnsigned(DataType.INT).toInt()

                data = BZip2.decompress(stream.byteArray(), compressedLength)

                assert(data.size == decompressedLength)

            }

            CompressionType.GZIP ->
            {

                encryptedData = fetchEncryptedData(crc32, reader, compressedLength + 4)

                decryptedData = decrypt(encryptedData, encryptedData.size, keys)

                val stream = BufferedReader(decryptedData)

                val decompressedLength: Int = stream.getUnsigned(DataType.INT).toInt()

                data = GZip.decompress(stream.byteArray(), compressedLength)

                assert(data.size == decompressedLength)

            }

        }

        this.compressionType = compressionType!! //todo null check.

        hash = crc32.hash

        return BufferedReader(data)

    }

    private fun fetchEncryptedData(crc32: Crc32, reader: BufferedReader, length: Int): ByteArray
    {

        val encryptedData = ByteArray(length)

        reader.readBytes(encryptedData)

        crc32.update(encryptedData, 0, length)

        if(reader.readableBytes >= 2)
        {

            version = reader.getUnsigned(DataType.SHORT).toInt()

            assert(version != -1)

        }

        return encryptedData

    }

    fun fetchCompression() = compressionType

    fun fetchCrcHash() = hash

    fun fetchVersion() = version

    private val bZipHeader = byteArrayOf(
        'B'.toByte(),
        'Z'.toByte(),
        'h'.toByte(),
        '1'.toByte()
    )

    private fun encrypt(keys: IntArray?, data: ByteArray, length: Int): ByteArray = if (keys == null) data else XTEA.encipher(keys, data, length)

    private fun decrypt(data: ByteArray, length: Int, keys: IntArray?): ByteArray = if (keys == null) data else XTEA.decipher(keys, data, 0, length)

}