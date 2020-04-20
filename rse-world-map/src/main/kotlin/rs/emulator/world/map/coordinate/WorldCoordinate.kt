package rs.emulator.world.map.coordinate

import rs.emulator.world.map.old.region.chunk.Chunk
import rs.emulator.world.map.region.coordinate.Coordinate

/**
 *
 * @author Chk
 */
class WorldCoordinate : Coordinate
{

    private val pointHash: Int

    constructor(x: Int, z: Int, plane: Int = 0) : this((x and 0x7FFF) or ((z and 0x7FFF) shl 15) or (plane shl 30))

    private constructor(hash: Int) : super(hash and 0x7FFF, (hash shr 15) and 0x7FFF, hash ushr 30)
    {
        this.pointHash = hash
    }

    val as30BitInteger: Int get() = (z and 0x3FFF) or ((x and 0x3FFF) shl 14) or ((plane and 0x3) shl 28)

    val asTileHashMultiplier: Int get() = (z shr 13) or ((x shr 13) shl 8) or ((plane and 0x3) shl 16)

    companion object
    {

        fun from30BitHash(packed: Int): WorldCoordinate
        {
            val x = ((packed shr 14) and 0x3FFF)
            val z = ((packed) and 0x3FFF)
            val height = (packed shr 28)
            return WorldCoordinate(x, z, height)
        }

        fun fromRegion(region: Int): WorldCoordinate
        {
            val x = ((region shr 8) shl 6)
            val z = ((region and 0xFF) shl 6)
            return WorldCoordinate(x, z)
        }

    }

}