package rs.emulator.cache.definition.widget

import net.runelite.cache.definitions.ClientScript1Instruction
import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.definition.Definition
import rs.emulator.cache.index.IndexConfig
import java.util.*

/**
 *
 * @author Chk
 */
class WidgetDefinition(identifier: Int) : Definition(identifier)
{

    override val indexConfig: IndexConfig
        get() = IndexConfig.INTERFACES

    override var archive: Int = identifier

    var id = -1
    var isIf3 = false
    var type = 0
    var contentType = 0
    var originalX = 0
    var originalY = 0
    var originalWidth = 0
    var originalHeight = 0
    var widthMode = 0
    var heightMode = 0
    var xPositionMode = 0
    var yPositionMode = 0
    var parentId = -1
    var isHidden = false
    var scrollWidth = 0
    var scrollHeight = 0
    var noClickThrough = false
    var spriteId = -1
    var textureId = 0
    var spriteTiling = false
    var opacity = 0
    var borderType = 0
    var shadowColor = 0
    var flippedVertically = false
    var flippedHorizontally = false
    var modelType = 1
    var modelId = -1
    var offsetX2d = 0
    var offsetY2d = 0
    var rotationX = 0
    var rotationY = 0
    var rotationZ = 0
    var modelZoom = 100
    var animation = -1
    var orthogonal = false
    var modelHeightOverride = 0
    var fontId = -1
    var text = ""
    var lineHeight = 0
    var xTextAlignment = 0
    var yTextAlignment = 0
    var textShadowed = false
    var textColor = 0
    var filled = false
    var lineWidth = 1
    var lineDirection = false
    var clickMask = 0
    var name = ""
    lateinit var actions: Array<String?>
    var dragDeadZone = 0
    var dragDeadTime = 0
    var dragRenderBehavior = false
    var targetVerb = ""
    lateinit var onLoadListener: Array<Any>
    lateinit var onMouseOverListener: Array<Any>
    lateinit var onMouseLeaveListener: Array<Any>
    lateinit var onTargetLeaveListener: Array<Any>
    lateinit var onTargetEnterListener: Array<Any>
    lateinit var onVarTransmitListener: Array<Any>
    lateinit var onInvTransmitListener: Array<Any>
    lateinit var onStatTransmitListener: Array<Any>
    lateinit var onTimerListener: Array<Any>
    lateinit var onOpListener: Array<Any>
    lateinit var onMouseRepeatListener: Array<Any>
    lateinit var onClickListener: Array<Any>
    lateinit var onClickRepeatListener: Array<Any>
    lateinit var onReleaseListener: Array<Any>
    lateinit var onHoldListener: Array<Any>
    lateinit var onDragListener: Array<Any>
    lateinit var onDragCompleteListener: Array<Any>
    lateinit var onScrollWheelListener: Array<Any>
    lateinit var varTransmitTriggers: IntArray
    lateinit var invTransmitTriggers: IntArray
    lateinit var statTransmitTriggers: IntArray
    var hasListener = false

    var menuType = 0

    // This is set to a siblings' child id when that widget should get a hover effect when this one is hovered
    var hoveredSiblingId = 0
    lateinit var alternateOperators: IntArray
    lateinit var alternateRhs: IntArray
    lateinit var clientScripts: Array<Array<ClientScript1Instruction>?>
    lateinit var itemIds: IntArray
    lateinit var itemQuantities: IntArray
    var xPitch = 0
    var yPitch = 0
    lateinit var xOffsets: IntArray
    lateinit var yOffsets: IntArray
    lateinit var sprites: IntArray
    lateinit var configActions: Array<String?>
    var alternateText = ""
    var alternateTextColor = 0
    var hoveredTextColor = 0
    var alternateHoveredTextColor = 0
    var alternateSpriteId = -1
    var alternateModelId = -1
    var alternateAnimation = -1
    var spellName = ""
    var tooltip = "Ok"

    override fun decodeHeader(reader: BufferedReader)
    {
        if (reader.byteArray()[0].toInt() == -1)
        {
            decodeIf3(reader)
        } else
        {
            decodeIf1(reader)
        }
    }

    override fun decode(opcode: Int, reader: BufferedReader)
    {



    }

    private fun decodeIf1(
        var1: BufferedReader
    )
    {
        isIf3 = false
        type = var1.getUnsigned(DataType.BYTE).toInt()
        menuType = var1.getUnsigned(DataType.BYTE).toInt()
        contentType = var1.getUnsigned(DataType.SHORT).toInt()
        originalX = var1.getSigned(DataType.SHORT).toInt()
        originalY = var1.getSigned(DataType.SHORT).toInt()
        originalWidth = var1.getUnsigned(DataType.SHORT).toInt()
        originalHeight = var1.getUnsigned(DataType.SHORT).toInt()
        opacity = var1.getUnsigned(DataType.BYTE).toInt()
        parentId = var1.getUnsigned(DataType.SHORT).toInt()
        if (parentId == 0xFFFF)
        {
            parentId = -1
        } else
        {
            parentId += id and 0xFFFF.inv()
        }
        hoveredSiblingId = var1.getUnsigned(DataType.SHORT).toInt()
        if (hoveredSiblingId == 0xFFFF)
        {
            hoveredSiblingId = -1
        }
        val var2 = var1.getUnsigned(DataType.BYTE).toInt()
        var var3: Int
        if (var2 > 0)
        {
            alternateOperators = IntArray(var2)
            alternateRhs = IntArray(var2)
            var3 = 0
            while (var3 < var2)
            {
                alternateOperators[var3] = var1.getUnsigned(DataType.BYTE).toInt()
                alternateRhs[var3] = var1.getUnsigned(DataType.SHORT).toInt()
                ++var3
            }
        }
        var3 = var1.getUnsigned(DataType.BYTE).toInt()
        var var4: Int
        var var5: Int
        var var6: Int
        if (var3 > 0)
        {
            clientScripts = arrayOfNulls(var3)
            var4 = 0
            while (var4 < var3)
            {
                var5 = var1.getUnsigned(DataType.SHORT).toInt()
                val bytecode = IntArray(var5)
                var6 = 0
                while (var6 < var5)
                {
                    bytecode[var6] = var1.getUnsigned(DataType.SHORT).toInt()
                    if (bytecode[var6] == 0xFFFF)
                    {
                        bytecode[var6] = -1
                    }
                    val instructions: MutableList<ClientScript1Instruction> =
                        ArrayList()
                    var i = 0
                    while (i < bytecode.size)
                    {
                        val ins =
                            ClientScript1Instruction()
                        ins.opcode = ClientScript1Instruction.Opcode.values()[bytecode[i++]]
                        val ac = ins.opcode.argumentCount
                        ins.operands = Arrays.copyOfRange(bytecode, i, i + ac)
                        instructions.add(ins)
                        i += ac
                    }
                    clientScripts[var4] = instructions.toTypedArray()
                    ++var6
                }
                ++var4
            }
        }
        if (type == 0)
        {
            scrollHeight = var1.getUnsigned(DataType.SHORT).toInt()
            isHidden = var1.getUnsigned(DataType.BYTE).toInt() == 1
        }
        if (type == 1)
        {
            var1.getUnsigned(DataType.SHORT).toInt()
            var1.getUnsigned(DataType.BYTE).toInt()
        }
        if (type == 2)
        {
            itemIds = IntArray(originalWidth * originalHeight)
            itemQuantities = IntArray(originalHeight * originalWidth)
            var4 = var1.getUnsigned(DataType.BYTE).toInt()
            if (var4 == 1)
            {
                clickMask = clickMask or 268435456
            }
            var5 = var1.getUnsigned(DataType.BYTE).toInt()
            if (var5 == 1)
            {
                clickMask = clickMask or 1073741824
            }
            var6 = var1.getUnsigned(DataType.BYTE).toInt()
            if (var6 == 1)
            {
                clickMask = clickMask or Int.MIN_VALUE
            }
            val var7 = var1.getUnsigned(DataType.BYTE).toInt()
            if (var7 == 1)
            {
                clickMask = clickMask or 536870912
            }
            xPitch = var1.getUnsigned(DataType.BYTE).toInt()
            yPitch = var1.getUnsigned(DataType.BYTE).toInt()
            xOffsets = IntArray(20)
            yOffsets = IntArray(20)
            sprites = IntArray(20)
            var var8: Int
            var8 = 0
            while (var8 < 20)
            {
                val var9 = var1.getUnsigned(DataType.BYTE).toInt()
                if (var9 == 1)
                {
                    xOffsets[var8] = var1.getSigned(DataType.SHORT).toInt().toInt()
                    yOffsets[var8] = var1.getSigned(DataType.SHORT).toInt().toInt()
                    sprites[var8] = var1.getSigned(DataType.INT).toInt()
                } else
                {
                    sprites[var8] = -1
                }
                ++var8
            }
            configActions = arrayOfNulls(5)
            var8 = 0
            while (var8 < 5)
            {
                val var11 = var1.string
                if (var11.length > 0)
                {
                    configActions[var8] = var11
                    clickMask = clickMask or (1 shl var8 + 23)
                }
                ++var8
            }
        }
        if (type == 3)
        {
            filled = var1.getUnsigned(DataType.BYTE).toInt() == 1
        }
        if (type == 4 || type == 1)
        {
            xTextAlignment = var1.getUnsigned(DataType.BYTE).toInt()
            yTextAlignment = var1.getUnsigned(DataType.BYTE).toInt()
            lineHeight = var1.getUnsigned(DataType.BYTE).toInt()
            fontId = var1.getUnsigned(DataType.SHORT).toInt()
            if (fontId == 0xFFFF)
            {
                fontId = -1
            }
            textShadowed = var1.getUnsigned(DataType.BYTE).toInt() == 1
        }
        if (type == 4)
        {
            text = var1.string
            alternateText = var1.string
        }
        if (type == 1 || type == 3 || type == 4)
        {
            textColor = var1.getSigned(DataType.INT).toInt()
        }
        if (type == 3 || type == 4)
        {
            alternateTextColor = var1.getSigned(DataType.INT).toInt()
            hoveredTextColor = var1.getSigned(DataType.INT).toInt()
            alternateHoveredTextColor = var1.getSigned(DataType.INT).toInt()
        }
        if (type == 5)
        {
            spriteId = var1.getSigned(DataType.INT).toInt()
            alternateSpriteId = var1.getSigned(DataType.INT).toInt()
        }
        if (type == 6)
        {
            modelType = 1
            modelId = var1.getUnsigned(DataType.SHORT).toInt()
            if (modelId == 0xFFFF)
            {
                modelId = -1
            }
            alternateModelId = var1.getUnsigned(DataType.SHORT).toInt()
            if (alternateModelId == 0xFFFF)
            {
                alternateModelId = -1
            }
            animation = var1.getUnsigned(DataType.SHORT).toInt()
            if (animation == 0xFFFF)
            {
                animation = -1
            }
            alternateAnimation = var1.getUnsigned(DataType.SHORT).toInt()
            if (alternateAnimation == 0xFFFF)
            {
                alternateAnimation = -1
            }
            modelZoom = var1.getUnsigned(DataType.SHORT).toInt()
            rotationX = var1.getUnsigned(DataType.SHORT).toInt()
            rotationZ = var1.getUnsigned(DataType.SHORT).toInt()
        }
        if (type == 7)
        {
            itemIds = IntArray(originalWidth * originalHeight)
            itemQuantities = IntArray(originalWidth * originalHeight)
            xTextAlignment = var1.getUnsigned(DataType.BYTE).toInt()
            fontId = var1.getUnsigned(DataType.SHORT).toInt()
            if (fontId == 0xFFFF)
            {
                fontId = -1
            }
            textShadowed = var1.getUnsigned(DataType.BYTE).toInt() == 1
            textColor = var1.getSigned(DataType.INT).toInt()
            xPitch = var1.getSigned(DataType.SHORT).toInt().toInt()
            yPitch = var1.getSigned(DataType.SHORT).toInt().toInt()
            var4 = var1.getUnsigned(DataType.BYTE).toInt()
            if (var4 == 1)
            {
                clickMask = clickMask or 1073741824
            }
            configActions = arrayOfNulls(5)
            var5 = 0
            while (var5 < 5)
            {
                val var10 = var1.string
                if (var10.length > 0)
                {
                    configActions[var5] = var10
                    clickMask = clickMask or (1 shl var5 + 23)
                }
                ++var5
            }
        }
        if (type == 8)
        {
            text = var1.string
        }
        if (menuType == 2 || type == 2)
        {
            targetVerb = var1.string
            spellName = var1.string
            var4 = var1.getUnsigned(DataType.SHORT).toInt() and 63
            clickMask = clickMask or (var4 shl 11)
        }
        if (menuType == 1 || menuType == 4 || menuType == 5 || menuType == 6)
        {
            tooltip = var1.string
            if (tooltip.length == 0)
            {
                if (menuType == 1)
                {
                    tooltip = "Ok"
                }
                if (menuType == 4)
                {
                    tooltip = "Select"
                }
                if (menuType == 5)
                {
                    tooltip = "Select"
                }
                if (menuType == 6)
                {
                    tooltip = "Continue"
                }
            }
        }
        if (menuType == 1 || menuType == 4 || menuType == 5)
        {
            clickMask = clickMask or 4194304
        }
        if (menuType == 6)
        {
            clickMask = clickMask or 1
        }
    }

    private fun decodeIf3(
        var1: BufferedReader
    )
    {
        var1.getUnsigned(DataType.BYTE).toInt()
        isIf3 = true
        type = var1.getUnsigned(DataType.BYTE).toInt()
        contentType = var1.getUnsigned(DataType.SHORT).toInt()
        originalX = var1.getSigned(DataType.SHORT).toInt()
        originalY = var1.getSigned(DataType.SHORT).toInt()
        originalWidth = var1.getUnsigned(DataType.SHORT).toInt()
        if (type == 9)
        {
            originalHeight = var1.getSigned(DataType.SHORT).toInt()
        } else
        {
            originalHeight = var1.getUnsigned(DataType.SHORT).toInt()
        }
        widthMode = var1.getSigned(DataType.BYTE).toInt()
        heightMode = var1.getSigned(DataType.BYTE).toInt()
        xPositionMode = var1.getSigned(DataType.BYTE).toInt()
        yPositionMode = var1.getSigned(DataType.BYTE).toInt()
        parentId = var1.getUnsigned(DataType.SHORT).toInt()
        if (parentId == 0xFFFF)
        {
            parentId = -1
        } else
        {
            parentId += id and 0xFFFF.inv()
        }
        isHidden = var1.getUnsigned(DataType.BYTE).toInt() == 1
        if (type == 0)
        {
            scrollWidth = var1.getUnsigned(DataType.SHORT).toInt()
            scrollHeight = var1.getUnsigned(DataType.SHORT).toInt()
            noClickThrough = var1.getUnsigned(DataType.BYTE).toInt() == 1
        }
        if (type == 5)
        {
            spriteId = var1.getSigned(DataType.INT).toInt()
            textureId = var1.getUnsigned(DataType.SHORT).toInt()
            spriteTiling = var1.getUnsigned(DataType.BYTE).toInt() == 1
            opacity = var1.getUnsigned(DataType.BYTE).toInt()
            borderType = var1.getUnsigned(DataType.BYTE).toInt()
            shadowColor = var1.getSigned(DataType.INT).toInt()
            flippedVertically = var1.getUnsigned(DataType.BYTE).toInt() == 1
            flippedHorizontally = var1.getUnsigned(DataType.BYTE).toInt() == 1
        }
        if (type == 6)
        {
            modelType = 1
            modelId = var1.getUnsigned(DataType.SHORT).toInt()
            if (modelId == 0xFFFF)
            {
                modelId = -1
            }
            offsetX2d = var1.getSigned(DataType.SHORT).toInt().toInt()
            offsetY2d = var1.getSigned(DataType.SHORT).toInt().toInt()
            rotationX = var1.getUnsigned(DataType.SHORT).toInt()
            rotationZ = var1.getUnsigned(DataType.SHORT).toInt()
            rotationY = var1.getUnsigned(DataType.SHORT).toInt()
            modelZoom = var1.getUnsigned(DataType.SHORT).toInt()
            animation = var1.getUnsigned(DataType.SHORT).toInt()
            if (animation == 0xFFFF)
            {
                animation = -1
            }
            orthogonal = var1.getUnsigned(DataType.BYTE).toInt() == 1
            var1.getUnsigned(DataType.SHORT).toInt()
            if (widthMode != 0)
            {
                modelHeightOverride = var1.getUnsigned(DataType.SHORT).toInt()
            }
            if (heightMode != 0)
            {
                var1.getUnsigned(DataType.SHORT).toInt()
            }
        }
        if (type == 4)
        {
            fontId = var1.getUnsigned(DataType.SHORT).toInt()
            if (fontId == 0xFFFF)
            {
                fontId = -1
            }
            text = var1.string
            lineHeight = var1.getUnsigned(DataType.BYTE).toInt()
            xTextAlignment = var1.getUnsigned(DataType.BYTE).toInt()
            yTextAlignment = var1.getUnsigned(DataType.BYTE).toInt()
            textShadowed = var1.getUnsigned(DataType.BYTE).toInt() == 1
            textColor = var1.getSigned(DataType.INT).toInt()
        }
        if (type == 3)
        {
            textColor = var1.getSigned(DataType.INT).toInt()
            filled = var1.getUnsigned(DataType.BYTE).toInt() == 1
            opacity = var1.getUnsigned(DataType.BYTE).toInt()
        }
        if (type == 9)
        {
            lineWidth = var1.getUnsigned(DataType.BYTE).toInt()
            textColor = var1.getSigned(DataType.INT).toInt()
            lineDirection = var1.getUnsigned(DataType.BYTE).toInt() == 1
        }
        clickMask = read24BitInt(var1)
        name = var1.string
        val var2 = var1.getUnsigned(DataType.BYTE).toInt()
        if (var2 > 0)
        {
            actions = arrayOfNulls(var2)
            for (var3 in 0 until var2)
            {
                actions[var3] = var1.string
            }
        }
        dragDeadZone = var1.getUnsigned(DataType.BYTE).toInt()
        dragDeadTime = var1.getUnsigned(DataType.BYTE).toInt()
        dragRenderBehavior = var1.getUnsigned(DataType.BYTE).toInt() == 1
        targetVerb = var1.string
        onLoadListener = decodeListener(var1)
        onMouseOverListener = decodeListener(var1)
        onMouseLeaveListener = decodeListener(var1)
        onTargetLeaveListener = decodeListener(var1)
        onTargetEnterListener = decodeListener(var1)
        onVarTransmitListener = decodeListener(var1)
        onInvTransmitListener = decodeListener(var1)
        onStatTransmitListener = decodeListener(var1)
        onTimerListener = decodeListener(var1)
        onOpListener = decodeListener(var1)
        onMouseRepeatListener = decodeListener(var1)
        onClickListener = decodeListener(var1)
        onClickRepeatListener = decodeListener(var1)
        onReleaseListener = decodeListener(var1)
        onHoldListener = decodeListener(var1)
        onDragListener = decodeListener(var1)
        onDragCompleteListener = decodeListener(var1)
        onScrollWheelListener = decodeListener(var1)
        varTransmitTriggers = decodeTriggers(var1)
        invTransmitTriggers = decodeTriggers(var1)
        statTransmitTriggers = decodeTriggers(var1)
    }

    private fun decodeListener(var1: BufferedReader): Array<Any>
    {
        val var2 = var1.getUnsigned(DataType.BYTE).toInt()
        return arrayOf(
            if (var2 == 0)
            {
                emptyArray()
            } else
            {
                val var3 = arrayOfNulls<Any>(var2)
                for (var4 in 0 until var2)
                {
                    val var5 = var1.getUnsigned(DataType.BYTE).toInt()
                    if (var5 == 0)
                    {
                        var3[var4] = var1.getSigned(DataType.INT).toInt()
                    } else if (var5 == 1)
                    {
                        var3[var4] = var1.string
                    }
                }
                hasListener = true
                var3
            }
        )
    }

    private fun decodeTriggers(var1: BufferedReader): IntArray
    {
        val var2 = var1.getUnsigned(DataType.BYTE).toInt()
        return if (var2 == 0)
        {
            IntArray(0)
        } else
        {
            val var3 = IntArray(var2)
            for (var4 in 0 until var2)
            {
                var3[var4] = var1.getSigned(DataType.INT).toInt()
            }
            var3
        }
    }

    fun read24BitInt(reader: BufferedReader): Int
    {
        return ((reader.getUnsigned(DataType.BYTE) shl 16) + (reader.getUnsigned(DataType.BYTE) shl 8) + reader.getUnsigned(DataType.BYTE)).toInt()
    }

}