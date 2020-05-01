package rs.emulator.cache.definition.widget.inv

import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.definition.generator.DefinitionGenerator
import rs.emulator.cache.index.IndexConfig
import rs.emulator.cache.index.archive.ArchiveConfig

/**
 *
 * @author Chk
 */
class InvDefinitionGenerator : DefinitionGenerator<InvDefinition>()
{

    override val definitionClass: Class<InvDefinition> = InvDefinition::class.java

    override val indexConfig: IndexConfig = IndexConfig.CONFIGS

    override val archive: Int = ArchiveConfig.INV.identifier

    override fun generate(id: Int, reader: BufferedReader): InvDefinition = InvDefinition(id)

    override fun decode(definition: InvDefinition, opcode: Int, reader: BufferedReader)
    {
        when (opcode)
        {
            2 -> definition.size = reader.getUnsigned(DataType.SHORT).toInt()
        }
    }

}