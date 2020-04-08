package rs.emulator.cache.compression

/**
 *
 * @author Chk
 */
enum class CompressionType(
    val opcode: Int
)
{

    NONE(0),

    BZIP(1),

    GZIP(2)

    ;

    companion object
    {

        fun compressionForOpcode(opcode: Int) = values().firstOrNull { it.opcode == opcode }

    }

}