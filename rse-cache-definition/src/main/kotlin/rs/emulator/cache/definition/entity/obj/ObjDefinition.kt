package rs.emulator.cache.definition.entity.obj

import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.definition.Definition
import rs.emulator.cache.index.IndexConfig
import rs.emulator.cache.index.archive.ArchiveConfig

/**
 *
 * @author Chk
 */
class ObjDefinition(
    identifier: Int
) : Definition(identifier)
{

    var name = ""
    var stacks = false
    var cost = 0
    var members = false
    val groundMenu = Array<String?>(5) { null }
    val inventoryMenu = Array<String?>(5) { null }
    val equipmentMenu = Array<String?>(8) { null }
    /**
     * The item can be traded through the grand exchange.
     */
    var grandExchange = false
    var teamCape = 0
    /**
     * When an item is noted or unnoted (and has a noted variant), this will
     * represent the other item id. For example, item definition [4151] will
     * have a [noteLinkId] of [4152], while item definition [4152] will have
     * a [noteLinkId] of 4151.
     */
    var noteLinkId = 0
    /**
     * When an item is noted, it will set this value.
     */
    var noteTemplateId = 0
    var placeholderLink = 0
    var placeholderTemplate = 0

    val params = hashMapOf<Int, Any>()

    /**
     * Custom metadata.
     */
    var examine: String? = null
    var tradeable = false
    var weight = 0.0
    var attackSpeed = -1
    var equipSlot = -1
    var equipType = 0
    var weaponType = -1
    var renderAnimations: IntArray? = null
    //var skillReqs: Byte2ByteOpenHashMap? = null
    lateinit var bonuses: IntArray

    val stackable: Boolean
        get() = stacks || noteTemplateId > 0

    val noted: Boolean
        get() = noteTemplateId > 0

    /**
     * Whether or not the object is a placeholder.
     */
    val isPlaceholder
        get() = placeholderTemplate > 0 && placeholderLink > 0

    override val indexConfig: IndexConfig
        get() = IndexConfig.CONFIGS

    override val archive: Int
        get() = ArchiveConfig.OBJ.identifier

    override fun decode(opcode: Int, reader: BufferedReader)
    {

        when (opcode) {
            1 -> reader.getUnsigned(DataType.SHORT).toInt()
            2 -> name = reader.string
            4 -> reader.getUnsigned(DataType.SHORT).toInt()
            5 -> reader.getUnsigned(DataType.SHORT).toInt()
            6 -> reader.getUnsigned(DataType.SHORT).toInt()
            7 -> reader.getUnsigned(DataType.SHORT).toInt()
            8 -> reader.getUnsigned(DataType.SHORT).toInt()
            11 -> stacks = true
            12 -> cost = reader.getSigned(DataType.INT).toInt()
            16 -> members = true
            23 -> {
                reader.getUnsigned(DataType.SHORT).toInt()
                reader.getUnsigned(DataType.BYTE).toInt()
            }
            24 -> reader.getUnsigned(DataType.SHORT).toInt()
            25 -> {
                reader.getUnsigned(DataType.SHORT).toInt()
                reader.getUnsigned(DataType.BYTE).toInt()
            }
            26 -> reader.getUnsigned(DataType.SHORT).toInt()
            in 30 until 35 -> {
                groundMenu[opcode - 30] = reader.string
                if (groundMenu[opcode - 30]!!.toLowerCase() == "null") {
                    groundMenu[opcode - 30] = null
                }
            }
            in 35 until 40 -> inventoryMenu[opcode - 35] = reader.string
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
            42 -> reader.getSigned(DataType.BYTE).toInt()
            65 -> grandExchange = true
            78 -> reader.getUnsigned(DataType.SHORT).toInt()
            79 -> reader.getUnsigned(DataType.SHORT).toInt()
            90 -> reader.getUnsigned(DataType.SHORT).toInt()
            91 -> reader.getUnsigned(DataType.SHORT).toInt()
            92 -> reader.getUnsigned(DataType.SHORT).toInt()
            93 -> reader.getUnsigned(DataType.SHORT).toInt()
            95 -> reader.getUnsigned(DataType.SHORT).toInt()
            97 -> noteLinkId = reader.getUnsigned(DataType.SHORT).toInt()
            98 -> noteTemplateId = reader.getUnsigned(DataType.SHORT).toInt()
            in 100 until 110 -> {
                reader.getUnsigned(DataType.SHORT).toInt()
                reader.getUnsigned(DataType.SHORT).toInt()
            }
            110 -> reader.getUnsigned(DataType.SHORT).toInt()
            111 -> reader.getUnsigned(DataType.SHORT).toInt()
            112 -> reader.getUnsigned(DataType.SHORT).toInt()
            113 -> reader.getSigned(DataType.BYTE).toInt()
            114 -> reader.getSigned(DataType.BYTE).toInt()
            115 -> teamCape = reader.getUnsigned(DataType.BYTE).toInt().toInt()
            139 -> reader.getUnsigned(DataType.SHORT).toInt()
            140 -> reader.getUnsigned(DataType.SHORT).toInt()
            148 -> placeholderLink = reader.getUnsigned(DataType.SHORT).toInt()
            149 -> placeholderTemplate = reader.getUnsigned(DataType.SHORT).toInt()
            249 -> {
                params.putAll(readParams(reader))

                for (i in 0 until 8) {
                    val paramId = 451 + i
                    val option = params.get(paramId) as? String ?: continue
                    equipmentMenu[i] = option
                }
            }
        }

    }

}