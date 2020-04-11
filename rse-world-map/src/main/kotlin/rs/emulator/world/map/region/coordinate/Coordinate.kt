package rs.emulator.world.map.region.coordinate

import rs.emulator.world.map.coordinate.WorldCoordinate
import rs.emulator.world.map.region.chunk.LocalCoordinate

/**
 *
 * @author Chk
 */
abstract class Coordinate(val x: Int, val z: Int, val plane: Int = 0)
{

    fun toLocal() : LocalCoordinate = LocalCoordinate(toLocalX(), toLocalZ(), plane)

    fun toLocalX() : Int = (((x shr 3) - (x shr 3)) shl 3)

    fun toLocalZ() : Int = (((z shr 3) - (z shr 3)) shl 3)

    fun toWorld() : WorldCoordinate = WorldCoordinate(x, z, plane)

}