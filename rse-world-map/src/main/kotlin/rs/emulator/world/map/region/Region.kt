package rs.emulator.world.map.region

import rs.emulator.cache.definition.region.landscape.LandscapeDefinition
import rs.emulator.cache.definition.region.mapscape.MapScapeDefinition
import rs.emulator.world.map.collision.CollisionFlags
import rs.emulator.world.map.collision.CollisionFlags.BLOCKED_TILE
import rs.emulator.world.map.collision.CollisionFlags.BRIDGE_TILE
import rs.emulator.world.map.collision.CollisionMesh
import rs.emulator.world.map.coordinate.WorldCoordinate
import rs.emulator.world.map.old.region.chunk.Chunk.Companion.REGION_SIZE
import rs.emulator.world.map.region.chunk.RegionChunk

/**
 *
 * @author Chk
 */
class Region(val id: Int)
{

    val x: Int = id shr 8

    val z: Int = id and 0xFF

    val baseX = (id shr 8 and 0xFF) shl 6

    val baseZ = (id and 0xFF) shl 6

    lateinit var mapScapeDefinition: MapScapeDefinition

    lateinit var landscapeDefinition: LandscapeDefinition

    lateinit var collisionMesh: CollisionMesh

    fun load()
    {

        for (plane in 0 until 4)
        {
            for (localX in 0 until 64)
            {
                for (localZ in 0 until 64)
                {

                    val worldCoordinate = WorldCoordinate(baseX + localX, baseZ + localZ, plane)

                    mapScapeDefinition.tiles[localX][localZ][plane]?.settings

                }
            }
        }

        collisionMesh = CollisionMesh(this)

    }

    fun isOutOfBounds(localX: Int, localY: Int): Boolean
    {
        return localX < 0 || localX >= REGION_SIZE || localY < 0 || localY >= REGION_SIZE
    }

    /**
     * Adds masks to clipping based on the settings provided
     * @param entityId The regions entity id
     * @param settings The tile settings
     * @param rotation The chunks rotation
     * @param chunkX The chunks x coordinate
     * @param chunkY The chunks y coordinate
     * @param chunkPlane The chunks plane coordinate
     */
    fun apply(entityId: Int, settings: Array<Array<ByteArray>>, rotation: Int?, chunkX: Int?, chunkY: Int?, chunkPlane: Int?) {
        if (rotation == null) {
            //Static region
            applySettings(settings, REGION_RANGE, REGION_RANGE, PLANE_RANGE) { localX, localY, plane ->
                //Add mask
                collisionMesh.addMask(entityId, localX, localY, plane, CollisionFlags.FLOOR_BLOCKS_WALK)
            }
        } else if (chunkX != null && chunkY != null && chunkPlane != null) {
            //Dynamic region
            //Add settings for only the chunk
            applySettings(settings, chunkX until chunkX + 8, chunkY until chunkY + 8, chunkPlane..chunkPlane) { localX, localY, plane ->
                //Calculate new position after rotation
               /* val newX = chunk.translateX(localX and 0x7, localY and 0x7, rotation)
                val newY = chunk.translateY(localX and 0x7, localY and 0x7, rotation)
                //Add mask
                collisionMesh.addMask(entityId, chunkX or newX, chunkY or newY, plane, CollisionFlags.FLOOR_BLOCKS_WALK)*/
            }
        }
    }

    /**
     * Applies [action] to all tiles in the region which are blocked (but not a bridge)
     * @param settings The tile settings
     * @param horizontal The x range to iterate
     * @param vertical The y range to iterate
     * @param planes The plane range to iterate
     * @param action Action to apply
     */
    private fun applySettings(settings: Array<Array<ByteArray>>, horizontal: IntRange, vertical: IntRange, planes: IntRange, action: (Int, Int, Int) -> Unit) {
        //Check all tiles in specified range
        for (plane in planes) {
            for (localX in horizontal) {
                for (localY in vertical) {
                    //If blocked but not by a bridge
                    if (settings[plane][localX][localY].toInt() and BLOCKED_TILE == BLOCKED_TILE && settings[1][localX][localY].toInt() and BRIDGE_TILE != BRIDGE_TILE) {
                        action(localX, localY, plane)
                    }
                }
            }
        }
    }

    companion object
    {

        const val REGION_PLANES = 4

        val PLANE_RANGE = 0 until REGION_PLANES

        val REGION_RANGE = 0 until REGION_SIZE

        const val SIZE = RegionChunk.SIZE * RegionChunk.SIZE

    }

}