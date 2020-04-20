package rs.emulator.cache.definition

import io.netty.buffer.ByteBuf
import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.BufferedWriter
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.index.IndexConfig
import rs.emulator.cache.index.archive.ArchiveConfig
import rs.emulator.utilities.logger

/**
 *
 * @author Chk
 */
abstract class Definition(
    @Transient val identifier: Int
)
{

    abstract val indexConfig: IndexConfig

    abstract val archive: Int

    open val archiveName: String? = null

    @Transient open val shiftedId: Int = -1

    abstract fun decode(opcode: Int, reader: BufferedReader)

    open fun decodeHeader(reader: BufferedReader)
    {

        if(reader.readableBytes <= 0)
        {
            logger().info("No readable bytes to decode definition for {}.", identifier)
            return
        }

        while (true)
        {

            val opcode: Int = reader.getUnsigned(DataType.BYTE).toInt()

            println("opcode: $opcode")

            if (opcode == 0)
                break

            decode(opcode, reader)

        }

    }

    fun readParams(reader: BufferedReader) : HashMap<Int, Any>
    {

        val map = hashMapOf<Int, Any>()

        val length = reader.getUnsigned(DataType.BYTE).toInt()
        for (i in 0 until length) {
            val isString = reader.getUnsigned(DataType.BYTE).toInt() == 1
            val id = reader.getUnsigned(DataType.TRI_BYTE).toInt()
            if (isString) {
                map[id] = reader.string
            } else {
                map[id] = reader.getSigned(DataType.INT).toInt()
            }
        }
        return map
    }

}