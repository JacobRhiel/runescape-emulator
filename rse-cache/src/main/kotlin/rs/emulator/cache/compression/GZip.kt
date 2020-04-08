package rs.emulator.cache.compression

import org.apache.commons.compress.utils.IOUtils

import java.io.*
import java.util.zip.GZIPInputStream
import java.util.zip.GZIPOutputStream

object GZip
{

    fun compress(bytes: ByteArray?): ByteArray
    {
        val `is`: InputStream = ByteArrayInputStream(bytes)
        val bout = ByteArrayOutputStream()
        GZIPOutputStream(bout).use { os -> IOUtils.copy(`is`, os) }
        return bout.toByteArray()
    }

    fun decompress(bytes: ByteArray?, len: Int): ByteArray
    {
        val os = ByteArrayOutputStream()
        GZIPInputStream(ByteArrayInputStream(bytes, 4, len))
            .use { `is` -> IOUtils.copy(`is`, os) }
        return os.toByteArray()
    }
}