package rs.emulator.world.map.region.chunk

import rs.emulator.world.map.coordinate.WorldCoordinate
import rs.emulator.world.map.old.region.chunk.Chunk
import rs.emulator.world.map.region.RegionCoordinate
import rs.emulator.world.map.region.coordinate.Coordinate

/**
 *
 * @author Chk
 */
class ChunkCoordinate(private val region: Int, x: Int, z: Int, plane: Int = 0) : Coordinate(x, z, plane)
{

    override fun toRegion(): RegionCoordinate = RegionCoordinate((region shr 8) * 64, (region and 0xff) * 64, plane)

    //(x shr 6) shl 8 and z shr 6, x and 63, z and 63
    override fun toWorld() = WorldCoordinate(x + ((region shr 8) shl 6), z + ((region and 0xFF) shl 6), plane)

    override fun equals(other: Any?): Boolean
    {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int = (x shl 16) or z

}