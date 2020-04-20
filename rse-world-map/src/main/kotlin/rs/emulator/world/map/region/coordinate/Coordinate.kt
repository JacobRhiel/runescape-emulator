package rs.emulator.world.map.region.coordinate

import rs.emulator.world.map.coordinate.WorldCoordinate
import rs.emulator.world.map.region.RegionCoordinate
import rs.emulator.world.map.region.chunk.ChunkCoordinate

/**
 *
 * @author Chk
 */
abstract class Coordinate(val x: Int, val z: Int, val plane: Int = 0)
{

    open fun toLocal() : ChunkCoordinate = ChunkCoordinate((x shr 6) shl 8 and z shr 6, x and 63, z and 63, plane)

    open fun toRegion() : RegionCoordinate = RegionCoordinate(x shr 6, z shr 6, plane)

    open fun toWorld() : WorldCoordinate = WorldCoordinate(x, z, plane)

    override fun toString(): String = "x: $x z: $z : plane $plane"

}