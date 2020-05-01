package rs.emulator.entity

import rs.emulator.entity.old.region.EntityType
import rs.emulator.entity.old.region.chunk.Tile
import rs.emulator.world.map.region.RegionCoordinate

/**
 *
 * @author Chk
 */
abstract class Entity
{

    lateinit var coordinate: RegionCoordinate

    lateinit var tile: Tile

    abstract val entityType: EntityType

}