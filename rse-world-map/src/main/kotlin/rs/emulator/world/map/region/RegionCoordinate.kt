package rs.emulator.world.map.region

import rs.emulator.world.map.coordinate.WorldCoordinate
import rs.emulator.world.map.region.chunk.ChunkCoordinate
import rs.emulator.world.map.region.coordinate.Coordinate

/**
 *
 * @author Chk
 */
class RegionCoordinate(x: Int, z: Int, plane: Int = 0) : Coordinate(x, z, plane)
{

    val regionId: Int
        get() = (x shl 8) + z

    val xInRegion: Int
        get() = x and 0x3F

    val zInRegion: Int
        get() = z and 0x3F

    val bottomLeftRegionX: Int get() = (x shr 3) - 6

    val bottomLeftRegionZ: Int get() = (z shr 3) - 6

    val basePosition: WorldCoordinate get() = WorldCoordinate(x shl 6, z shl 6, plane)

    override fun toWorld(): WorldCoordinate = basePosition

    /**
     * Return bottomLeftRegionX and bottomLeftRegionZ because region x and z always directs
     * to the base coordinates of the region.
     */
    override fun toLocal(): ChunkCoordinate = ChunkCoordinate(regionId, bottomLeftRegionX, bottomLeftRegionZ, plane)

    companion object
    {

        inline fun regionDelta(from: RegionCoordinate, to: RegionCoordinate, action: (Int, Int, Int) -> Unit) {
            action(from.xInRegion - to.xInRegion, from.zInRegion - to.zInRegion, from.plane - to.plane)
        }

    }

}