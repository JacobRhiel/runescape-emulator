package rs.emulator.cache.compression

import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream
import org.apache.commons.compress.utils.IOUtils
import java.io.*

object BZip2
{

    private val BZIP_HEADER = byteArrayOf(
        'B'.toByte(),
        'Z'.toByte(),
        'h'.toByte(),
        '1'.toByte()
    )

    fun compress(bytes: ByteArray): ByteArray
    {
        val `is`: InputStream = ByteArrayInputStream(bytes)
        val bout = ByteArrayOutputStream()
        BZip2CompressorOutputStream(bout, 1).use { os -> IOUtils.copy(`is`, os) }
        val out: ByteArray = bout.toByteArray()
        assert(BZIP_HEADER[0] == out[0])
        assert(BZIP_HEADER[1] == out[1])
        assert(BZIP_HEADER[2] == out[2])
        assert(BZIP_HEADER[3] == out[3])
        return out.copyOfRange(BZIP_HEADER.size, out.size) // remove header..
    }

    fun decompress(bytes: ByteArray, len: Int): ByteArray
    {
        val data = ByteArray(len + BZIP_HEADER.size)
        System.arraycopy(BZIP_HEADER, 0, data, 0, BZIP_HEADER.size)
        System.arraycopy(bytes, 4, data, BZIP_HEADER.size, len)
        val os = ByteArrayOutputStream()
        BZip2CompressorInputStream(ByteArrayInputStream(data)).use { `is` -> IOUtils.copy(`is`, os) }
        return os.toByteArray()
    }
}