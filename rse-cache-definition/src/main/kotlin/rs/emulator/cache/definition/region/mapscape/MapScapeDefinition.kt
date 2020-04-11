package rs.emulator.cache.definition.region.mapscape

import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.definition.Definition
import rs.emulator.cache.index.IndexConfig

/**
 *
 * @author Chk
 */
class MapScapeDefinition(identifier: Int) : Definition(identifier)
{

    override val indexConfig: IndexConfig
        get() = IndexConfig.MAPS

    override val archive: Int
        get() = identifier

    override val archiveName: String
        get() = "m${identifier}_$identifier"

    private val regionX: Int = identifier shr 8

    private val regionY: Int = identifier and 0xFF

    val tiles: Array<Array<Array<MapScapeTile?>>> = Array(64) { Array(64) { arrayOfNulls<MapScapeTile>(4) } }

    override fun decodeHeader(reader: BufferedReader) = decode(-1, reader)

    override fun decode(opcode: Int, reader: BufferedReader)
    {
        for (plane in 0 until 4)
        {
            for (x in 0 until 64)
            {
                for (z in 0 until 64)
                {

                    val builder = MapScapeTile.Builder()
                        .coordinates(x, z).plane(plane)

                    while (true)
                    {
                        val attribute: Int = reader.getUnsigned(DataType.BYTE).toInt()
                        if (attribute == 0)
                            break
                        else if (attribute == 1)
                        {
                            builder.plane(reader.getUnsigned(DataType.BYTE).toInt())
                            break
                        } else if (attribute <= 49)
                            builder.attribute(attribute).overlay(reader.getSigned(DataType.BYTE).toByte())
                        else if (attribute <= 81)
                            builder.settings((attribute - 49).toByte())
                        else
                            builder.underlay((attribute - 81).toByte())
                    }

                    tiles[x][z][plane] = builder.build()

                }
            }
        }
    }

}