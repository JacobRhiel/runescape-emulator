package rs.emulator.world.map.region.chunk

import rs.emulator.world.map.region.coordinate.Coordinate

/**
 *
 * @author Chk
 */
class LocalCoordinate(x: Int, z: Int, plane: Int = 0) : Coordinate(x, z, plane)
{

    override fun equals(other: Any?): Boolean
    {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int = (x shl 16) or z

}