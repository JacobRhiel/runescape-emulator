package rs.emulator.cache.definition.region.landscape

import rs.emulator.buffer.BufferedReader
import rs.emulator.buffer.type.DataType
import rs.emulator.cache.definition.Definition
import rs.emulator.cache.index.IndexConfig
import java.util.*

/**
 *
 * @author Chk
 */
class LandscapeDefinition(identifier: Int) : Definition(identifier)
{

    private val regionX = identifier shr 8

    private val regionY = identifier and 0xFF

    private val tiles = ArrayList<LandscapeTile>()

    override val indexConfig: IndexConfig
        get() = IndexConfig.MAPS

    override val archive: Int
        get() = identifier

    override val archiveName: String
        get() = "l${identifier}_$identifier"

    override fun decode(opcode: Int, reader: BufferedReader)
    {
        var id = -1
        var idOffset: Int

        while (reader.unsignedIntSmartShortCompat.also { idOffset = it } != 0)
        {
            id += idOffset
            var position = 0
            var positionOffset: Int
            while (reader.unsignedSmart.also { positionOffset = it } != 0)
            {
                position += positionOffset - 1
                val localY = position and 0x3F
                val localX = position shr 6 and 0x3F
                val plane = position shr 12 and 0x3
                val attributes: Int = reader.getUnsigned(DataType.BYTE).toInt()
                val type = attributes shr 2
                val orientation = attributes and 0x3
                tiles.add(
                    LandscapeTile(
                        id,
                        type,
                        orientation,
                        localX,
                        localY,
                        plane
                    )
                )
            }
        }
    }

}