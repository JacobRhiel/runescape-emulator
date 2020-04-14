package rs.emulator.cache.definition.entity

import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.definition.Definition
import rs.emulator.cache.index.IndexConfig
import rs.emulator.cache.index.archive.ArchiveConfig

/**
 *
 * @author Chk
 */
class IdentityKitDefinition(identifier: Int) : Definition(identifier)
{

    var recolorToReplace: ShortArray = shortArrayOf()

    var recolorToFind: ShortArray = shortArrayOf()

    var retextureToFind: ShortArray = shortArrayOf()

    var retextureToReplace: ShortArray = shortArrayOf()

    var bodyPartId = -1

    var models: IntArray = intArrayOf()

    var chatheadModels = intArrayOf(-1, -1, -1, -1, -1)

    var nonSelectable = false

    override val indexConfig: IndexConfig
        get() = IndexConfig.CONFIGS

    override val archive: Int
        get() = ArchiveConfig.IDENTITY_KIT.identifier

    override fun decode(opcode: Int, reader: BufferedReader)
    {
        when(opcode)
        {
            1 ->
            {
                bodyPartId = reader.getUnsigned(DataType.BYTE).toInt()
            } 
            2 ->
            {
                val length: Int = reader.getUnsigned(DataType.BYTE).toInt()
                models = IntArray(length)
                for (index in 0 until length)
                {
                    models[index] = reader.getUnsigned(DataType.SHORT).toInt()
                }
            } 
            3 ->
            {
                nonSelectable = true
            } 
            40 ->
            {
                val length: Int = reader.getUnsigned(DataType.BYTE).toInt()
                recolorToFind = ShortArray(length)
                recolorToReplace = ShortArray(length)
                for (index in 0 until length)
                {
                    recolorToFind[index] = reader.getSigned(DataType.SHORT).toShort()
                    recolorToReplace[index] = reader.getSigned(DataType.SHORT).toShort()
                }
            }
            41 ->
            {
                val length: Int = reader.getUnsigned(DataType.BYTE).toInt()
                retextureToFind = ShortArray(length)
                retextureToReplace = ShortArray(length)
                for (index in 0 until length)
                {
                    retextureToFind[index] = reader.getSigned(DataType.SHORT).toShort()
                    retextureToReplace[index] = reader.getSigned(DataType.SHORT).toShort()
                }
            }
            in 60 until 70 ->
            {
                chatheadModels[opcode - 60] = reader.getUnsigned(DataType.SHORT).toInt()
            }
        }
    }

}