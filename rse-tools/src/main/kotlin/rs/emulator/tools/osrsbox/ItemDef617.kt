package rs.emulator.tools.osrsbox

import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.definition.Definition
import rs.emulator.cache.index.IndexConfig
import java.util.*

/**
 *
 * @author Chk
 */
class ItemDef617(identifier: Int) : Definition(identifier)
{
    override val indexConfig: IndexConfig
        get() = IndexConfig.OBJ_617

    override val archive: Int
        get() = identifier ushr 8

    override val shiftedId: Int
        get() = identifier and 0xFF

    var name: String = "unknown"

    override fun decode(opcode: Int, reader: BufferedReader)
    {

        if (opcode == 1)
        {
                reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode == 2)
        {
            name = reader.string
        } else if (opcode == 4)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode == 5)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode.inv() == -7)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode == 7)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode == 8)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode.inv() == -12)
        {
            
        } else if (opcode == 12)
        {
            reader.getSigned(DataType.INT).toInt()
        } else if (opcode.inv() == -17)
        {
            
        } else if (opcode == 18)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode.inv() == -24)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode == 24)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode == 25)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode.inv() == -27)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode.inv() <= -31 && opcode.inv() > -36)
        {
            reader.string
        } else if (opcode.inv() <= -36 && opcode.inv() > -41)
        {
            reader.string
        } else if (opcode == 40)
        {
            val i_29_: Int = reader.getUnsigned(DataType.BYTE).toInt()
            
            var i_30_ = 0
            while (i_29_ > i_30_)
            {
                reader.getUnsigned(DataType.SHORT).toInt()
                reader.getUnsigned(DataType.SHORT).toInt()
                i_30_++
            }
        } else if (opcode == 41)
        {
            val i_18_: Int = reader.getUnsigned(DataType.BYTE).toInt()
            
            var i_19_ = 0
            while (i_18_.inv() < i_19_.inv())
            {
                reader.getUnsigned(DataType.SHORT).toInt()
                reader.getUnsigned(DataType.SHORT).toInt()
                i_19_++
            }
        } else if (opcode == 42)
        {
            val i_27_: Int = reader.getUnsigned(DataType.BYTE).toInt()
            
            var i_28_ = 0
            while (i_27_ > i_28_)
            {
                reader.getSigned(DataType.BYTE).toInt()
                i_28_++
            }
        } else if (opcode.inv() == -66)
        {
            
        } else if (opcode.inv() == -79)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode == 79)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode == 90)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode == 91)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode == 92)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode.inv() == -94)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode.inv() == -96)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode.inv() == -97)
        {
            reader.getUnsigned(DataType.BYTE).toInt()
        } else if (opcode == 97)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode.inv() == -99)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode >= 100 && opcode < 110)
        {
            
            reader.getUnsigned(DataType.SHORT).toInt()
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode.inv() == -111)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode == 111)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode.inv() == -113)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode.inv() == -114)
        {
            reader.getSigned(DataType.BYTE).toInt()
        } else if (opcode.inv() == -115)
        {
            reader.getSigned(DataType.BYTE).toInt() * 5
        } else if (opcode == 115)
        {
            reader.getUnsigned(DataType.BYTE).toInt()
        } else if (opcode == 121)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode == 122)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode.inv() == -126)
        {
            reader.getSigned(DataType.BYTE).toInt() shl 2
            reader.getSigned(DataType.BYTE).toInt() shl 2
            reader.getSigned(DataType.BYTE).toInt() shl 2
        } else if (opcode == 126)
        {
            reader.getSigned(DataType.BYTE).toInt() shl 2
            reader.getSigned(DataType.BYTE).toInt() shl 2
            reader.getSigned(DataType.BYTE).toInt() shl 2
        } else if (opcode.inv() == -128)
        {
            reader.getUnsigned(DataType.BYTE).toInt()
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode == 128)
        {
            reader.getUnsigned(DataType.BYTE).toInt()
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode == 129)
        {
            reader.getUnsigned(DataType.BYTE).toInt()
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode == 130)
        {
            reader.getUnsigned(DataType.BYTE).toInt()
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode == 132)
        {
            val i_20_: Int = reader.getUnsigned(DataType.BYTE).toInt()
            
            var i_21_ = 0
            while (i_20_ > i_21_)
            {
                reader.getUnsigned(DataType.SHORT).toInt()
                i_21_++
            }
        } else if (opcode == 134)
        {
            reader.getUnsigned(DataType.BYTE).toInt()
        } else if (opcode.inv() == -140)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode.inv() == -141)
        {
            reader.getUnsigned(DataType.SHORT).toInt()
        } else if (opcode.inv() == -250)
        {
            readParams(reader)
        } else
        {
            println("Unknown opcode $opcode")
        }


    }

}