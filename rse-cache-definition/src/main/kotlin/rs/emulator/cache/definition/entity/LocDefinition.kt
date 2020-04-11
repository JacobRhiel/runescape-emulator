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
class LocDefinition(
    identifier: Int
) : Definition(identifier)
{

    var name = ""
    var width = 1
    var length = 1
    var solid = true
    var impenetrable = true
    var interactive = false
    var obstructive = false
    var clipMask = 0
    var varbit = -1
    var varp = -1
    var animation = -1
    var rotated = false
    val options: Array<String?> = Array(5) { "" }
    var transforms: Array<Int>? = null

    var examine: String? = null

    override val indexConfig: IndexConfig
        get() = IndexConfig.CONFIGS

    override val archive: Int
        get() = ArchiveConfig.LOC.identifier

    override fun decode(opcode: Int, reader: BufferedReader)
    {
        when (opcode) {
            1 -> {
                val count = reader.getUnsigned(DataType.BYTE).toInt()
                for (i in 0 until count) {
                    reader.getUnsigned(DataType.SHORT).toInt() // Model
                    reader.getUnsigned(DataType.BYTE).toInt() // Model type
                }
            }
            2 -> name = reader.string
            5 -> {
                val count = reader.getUnsigned(DataType.BYTE).toInt()
                for (i in 0 until count) {
                    reader.getUnsigned(DataType.SHORT).toInt() // Model
                }
            }
            14 -> width = reader.getUnsigned(DataType.BYTE).toInt().toInt()
            15 -> length = reader.getUnsigned(DataType.BYTE).toInt().toInt()
            17 -> solid = false
            18 -> impenetrable = false
            19 -> interactive = reader.getUnsigned(DataType.BYTE).toInt().toInt() == 1
            24 -> {
                animation = reader.getUnsigned(DataType.SHORT).toInt()
                if (animation == 65535) {
                    animation = -1
                }
            }
            27 -> {}
            28 -> reader.getUnsigned(DataType.BYTE).toInt()
            29 -> reader.getSigned(DataType.BYTE).toInt()
            in 30 until 35 -> {
                options[opcode - 30] = reader.string
                if (options[opcode - 30]?.toLowerCase() == "null") {
                    options[opcode - 30] = null
                }
            }
            39 -> reader.getSigned(DataType.BYTE).toInt()
            40 -> {
                val count = reader.getUnsigned(DataType.BYTE).toInt()
                for (i in 0 until count) {
                    reader.getUnsigned(DataType.SHORT).toInt() // Recolor src
                    reader.getUnsigned(DataType.SHORT).toInt() // Recolor dst
                }
            }
            41 -> {
                val count = reader.getUnsigned(DataType.BYTE).toInt()
                for (i in 0 until count) {
                    reader.getUnsigned(DataType.SHORT).toInt() // Retexture src
                    reader.getUnsigned(DataType.SHORT).toInt() // Retexture dst
                }
            }
            60 -> reader.getUnsigned(DataType.SHORT).toInt()
            62 -> rotated = true
            65 -> reader.getUnsigned(DataType.SHORT).toInt()
            66 -> reader.getUnsigned(DataType.SHORT).toInt()
            67 -> reader.getUnsigned(DataType.SHORT).toInt()
            68 -> reader.getUnsigned(DataType.SHORT).toInt()
            69 -> clipMask = reader.getUnsigned(DataType.BYTE).toInt()
            70 -> reader.getSigned(DataType.SHORT).toInt()
            71 -> reader.getSigned(DataType.SHORT).toInt()
            72 -> reader.getSigned(DataType.SHORT).toInt()
            73 -> obstructive = true
            75 -> reader.getUnsigned(DataType.BYTE).toInt()
            77, 92 -> {
                varbit = reader.getUnsigned(DataType.SHORT).toInt()
                varp = reader.getUnsigned(DataType.SHORT).toInt()

                if (varbit == 65535) {
                    varbit = -1
                }
                if (varp == 65535) {
                    varp = -1
                }

                if (opcode == 92) {
                    reader.getUnsigned(DataType.SHORT).toInt()
                }

                val count = reader.getUnsigned(DataType.BYTE).toInt().toInt()

                transforms = Array(count + 1) { 0 }
                for (i in 0..count) {
                    val transform = reader.getUnsigned(DataType.SHORT).toInt()
                    transforms!![i] = transform
                }
            }
            78 -> {
                reader.getUnsigned(DataType.SHORT).toInt()
                reader.getUnsigned(DataType.BYTE).toInt()
            }
            79 -> {
                reader.getUnsigned(DataType.SHORT).toInt()
                reader.getUnsigned(DataType.SHORT).toInt()
                reader.getUnsigned(DataType.BYTE).toInt()
                val count = reader.getUnsigned(DataType.BYTE).toInt().toInt()
                for (i in 0 until count) {
                    reader.getUnsigned(DataType.SHORT).toInt()
                }
            }
            81 -> reader.getUnsigned(DataType.BYTE).toInt()
            82 -> reader.getUnsigned(DataType.SHORT).toInt()
            249 -> readParams(reader)
        }
    }

}