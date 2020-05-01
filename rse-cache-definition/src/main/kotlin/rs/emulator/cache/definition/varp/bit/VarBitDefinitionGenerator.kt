package rs.emulator.cache.definition.varp.bit

import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.definition.generator.DefinitionGenerator
import rs.emulator.cache.index.IndexConfig
import rs.emulator.cache.index.archive.ArchiveConfig

/**
 *
 * @author Chk
 */
class VarBitDefinitionGenerator : DefinitionGenerator<VarBitDefinition>()
{

    override val definitionClass: Class<VarBitDefinition> = VarBitDefinition::class.java

    override val indexConfig: IndexConfig = IndexConfig.CONFIGS

    override val archive: Int = ArchiveConfig.VAR_BIT.identifier

    override fun generate(id: Int, reader: BufferedReader): VarBitDefinition = VarBitDefinition(id)

    override fun decode(definition: VarBitDefinition, opcode: Int, reader: BufferedReader)
    {
        when (opcode)
        {
            1 ->
            {
                definition.index = reader.getUnsigned(DataType.SHORT).toInt()
                definition.leastSignificantBit = reader.getUnsigned(DataType.BYTE).toInt()
                definition.mostSignificantBit = reader.getUnsigned(DataType.BYTE).toInt()
            }
        }
    }

}