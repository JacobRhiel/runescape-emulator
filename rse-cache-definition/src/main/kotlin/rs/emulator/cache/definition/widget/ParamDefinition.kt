package rs.emulator.cache.definition.widget

import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.definition.Definition
import rs.emulator.cache.definition.widget.script.ScriptVarType
import rs.emulator.cache.index.IndexConfig
import rs.emulator.cache.index.archive.ArchiveConfig

/**
 *
 * @author Chk
 */
class ParamDefinition(identifier: Int) : Definition(identifier)
{

    private lateinit var type: ScriptVarType

    private var isMembers = true

    private var defaultInt = 0

    private var defaultString: String? = null

    override val indexConfig: IndexConfig
        get() = IndexConfig.CONFIGS

    override val archive: Int
        get() = ArchiveConfig.PARAMS.identifier

    override fun decode(opcode: Int, reader: BufferedReader)
    {
        when(opcode)
        {
            1 -> type = ScriptVarType.forCharKey(reader.getSigned(DataType.BYTE).toChar())
            2 -> defaultInt = reader.getSigned(DataType.INT).toInt()
			4 -> isMembers = false
            5 -> defaultString = reader.string
        }
    }

}