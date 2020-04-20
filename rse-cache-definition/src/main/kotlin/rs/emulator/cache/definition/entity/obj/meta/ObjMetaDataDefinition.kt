package rs.emulator.cache.definition.entity.obj.meta

import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.BufferedWriter
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.definition.Definition
import rs.emulator.cache.definition.MetaDataDefinition
import rs.emulator.cache.index.IndexConfig
import rs.emulator.cache.index.archive.ArchiveConfig

/**
 *
 * @author Chk
 */
class ObjMetaDataDefinition(identifier: Int) : MetaDataDefinition(identifier)
{

    override val indexConfig: IndexConfig
        get() = IndexConfig.META_DATA

    override val archive: Int
        get() = ArchiveConfig.OBJ.identifier

    lateinit var examine: String

    var tradeable = false

    var equipable_by_player = false

    var equipable_weapon = false

    var weight = 0.0

    var buy_limit = 0

    var quest_item = false

    var weapon: Weapon? = null

    var equipment: Equipment? = null

    override fun decodeHeader(reader: BufferedReader)
    {



    }

    override fun decode(opcode: Int, reader: BufferedReader)
    {

        when(opcode)
        {

          //  1 -> { slot = reader.getUnsigned(DataType.BYTE).toInt() }

        }

    }

}