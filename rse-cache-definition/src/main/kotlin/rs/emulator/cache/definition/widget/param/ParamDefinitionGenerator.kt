package rs.emulator.cache.definition.widget.param

import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.definition.generator.DefinitionGenerator
import rs.emulator.cache.definition.widget.script.ScriptVarType
import rs.emulator.cache.index.IndexConfig
import rs.emulator.cache.index.archive.ArchiveConfig

/**
 *
 * @author Chk
 */
class ParamDefinitionGenerator : DefinitionGenerator<ParamDefinition>()
{

    override val definitionClass: Class<ParamDefinition> = ParamDefinition::class.java

    override val indexConfig: IndexConfig = IndexConfig.CONFIGS

    override val archive: Int = ArchiveConfig.PARAMS.identifier

    override fun generate(id: Int, reader: BufferedReader): ParamDefinition = ParamDefinition(id)

    override fun decode(definition: ParamDefinition, opcode: Int, reader: BufferedReader)
    {
        when(opcode)
        {
            1 -> definition.type = ScriptVarType.forCharKey(reader.getSigned(DataType.BYTE).toChar())
            2 -> definition.defaultInt = reader.getSigned(DataType.INT).toInt()
            4 -> definition.isMembers = false
            5 -> definition.defaultString = reader.string
        }
    }

}