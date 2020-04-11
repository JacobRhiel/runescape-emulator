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
class NpcDefinition(
    identifier: Int
) : Definition(identifier)
{

    var name = ""
    var size = 1
    var standAnim = -1
    var walkAnim = -1
    var render3 = -1
    var render4 = -1
    var render5 = -1
    var render6 = -1
    var render7 = -1
    var visibleMapDot = true
    var combatLevel = -1
    var width = -1
    var length = -1
    var render = false
    var headIcon = -1
    var varp = -1
    var varbit = -1
    var interactable = true
    var pet = false
    var options: Array<String?> = Array(5) { "" }
    var transforms: Array<Int>? = null

    var examine: String? = null

    fun isAttackable(): Boolean = combatLevel > 0 && options.any { it == "Attack" }

    override val indexConfig: IndexConfig
        get() = IndexConfig.CONFIGS

    override val archive: Int
        get() = ArchiveConfig.NPC.identifier

    override fun decode(opcode: Int, reader: BufferedReader)
    {

        when (opcode) {
            1 -> {
                val count = reader.getUnsigned(DataType.BYTE).toInt()
                for (i in 0 until count) {
                    reader.getUnsigned(DataType.SHORT).toInt()
                }
            }
            2 -> name = reader.string
            12 -> size = reader.getUnsigned(DataType.BYTE).toInt()
            13 -> standAnim = reader.getUnsigned(DataType.SHORT).toInt()
            14 -> walkAnim = reader.getUnsigned(DataType.SHORT).toInt()
            15 -> render3 = reader.getUnsigned(DataType.SHORT).toInt()
            16 -> render4 = reader.getUnsigned(DataType.SHORT).toInt()
            17 -> {
                walkAnim = reader.getUnsigned(DataType.SHORT).toInt()
                render5 = reader.getUnsigned(DataType.SHORT).toInt()
                render6 = reader.getUnsigned(DataType.SHORT).toInt()
                render7 = reader.getUnsigned(DataType.SHORT).toInt()
            }
            in 30 until 35 -> {
                options[opcode - 30] = reader.string
                if (options[opcode - 30]?.toLowerCase() == "null") {
                    options[opcode - 30] = null
                }
            }
            40 -> {
                val count = reader.getUnsigned(DataType.BYTE).toInt()
                for (i in 0 until count) {
                    reader.getUnsigned(DataType.SHORT).toInt()
                    reader.getUnsigned(DataType.SHORT).toInt()
                }
            }
            41 -> {
                val count = reader.getUnsigned(DataType.BYTE).toInt()
                for (i in 0 until count) {
                    reader.getUnsigned(DataType.SHORT).toInt()
                    reader.getUnsigned(DataType.SHORT).toInt()
                }
            }
            60 -> {
                val count = reader.getUnsigned(DataType.BYTE).toInt()
                for (i in 0 until count) {
                    reader.getUnsigned(DataType.SHORT).toInt()
                }
            }
            93 -> visibleMapDot = false
            95 -> combatLevel = reader.getUnsigned(DataType.SHORT).toInt()
            97 -> width = reader.getUnsigned(DataType.SHORT).toInt()
            98 -> headIcon = reader.getUnsigned(DataType.SHORT).toInt()
            99 -> render = true
            100 -> reader.getSigned(DataType.BYTE).toInt()
            101 -> reader.getSigned(DataType.BYTE).toInt()
            102 -> headIcon = reader.getUnsigned(DataType.SHORT).toInt()
            103 -> reader.getUnsigned(DataType.SHORT).toInt()
            106, 118 -> {
                varbit = reader.getUnsigned(DataType.SHORT).toInt()
                varp = reader.getUnsigned(DataType.SHORT).toInt()

                if (varbit == 65535) {
                    varbit = -1
                }
                if (varp == 65535) {
                    varp = -1
                }

                if (opcode == 118) {
                    reader.getUnsigned(DataType.SHORT).toInt()
                }

                val count = reader.getUnsigned(DataType.BYTE).toInt()

                transforms = Array(count.toInt() + 1) { 0 }
                for (i in 0..count) {
                    val transform = reader.getUnsigned(DataType.SHORT).toInt()
                    transforms!![i] = transform
                }
            }
            107 -> interactable = false
            111 -> pet = true
            112 -> reader.getUnsigned(DataType.BYTE).toInt()
            249 -> readParams(reader)
        }

    }

}