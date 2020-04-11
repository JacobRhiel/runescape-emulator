package rs.emulator.cache.definition.widget

import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.definition.Definition
import rs.emulator.cache.index.IndexConfig
import rs.emulator.cache.index.archive.ArchiveConfig

/**
 *
 * @author Chk
 */
class InvDefinition(identifier: Int) : Definition(identifier)
{

    var size = 0

    override val indexConfig: IndexConfig
        get() = IndexConfig.CONFIGS

    override val archive: Int
        get() = ArchiveConfig.INV.identifier

    override fun decode(opcode: Int, reader: BufferedReader)
    {
        when (opcode)
        {
            2 -> size = reader.getUnsigned(DataType.SHORT).toInt()
        }
    }

}