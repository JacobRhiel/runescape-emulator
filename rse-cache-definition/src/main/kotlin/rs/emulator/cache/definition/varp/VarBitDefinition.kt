package rs.emulator.cache.definition.varp

import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.definition.Definition
import rs.emulator.cache.index.IndexConfig
import rs.emulator.cache.index.archive.ArchiveConfig

/**
 *
 * @author Chk
 */
class VarBitDefinition(identifier: Int) : Definition(identifier)
{

    var index = 0

    var leastSignificantBit = 0

    var mostSignificantBit = 0

    override val indexConfig: IndexConfig
        get() = IndexConfig.CONFIGS

    override val archive: Int
        get() = ArchiveConfig.VAR_BIT.identifier

    override fun decode(opcode: Int, reader: BufferedReader)
    {

        when (opcode)
        {
            1 ->
            {
                index = reader.getUnsigned(DataType.SHORT).toInt()
                leastSignificantBit = reader.getUnsigned(DataType.BYTE).toInt()
                mostSignificantBit = reader.getUnsigned(DataType.BYTE).toInt()
            }
        }
    }

}