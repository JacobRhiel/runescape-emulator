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
class VarPlayerDefinition(identifier: Int) : Definition(identifier)
{

    var configType = 0

    override val indexConfig: IndexConfig
        get() = IndexConfig.CONFIGS

    override val archive: Int
        get() = ArchiveConfig.VAR_PLAYER.identifier

    override fun decode(opcode: Int, reader: BufferedReader)
    {
        when(opcode)
        {
            5 -> configType = reader.getUnsigned(DataType.SHORT).toInt()
        }
    }

}