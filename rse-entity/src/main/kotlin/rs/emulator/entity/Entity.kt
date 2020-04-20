package rs.emulator.entity

import rs.emulator.world.map.old.region.EntityType
import rs.emulator.world.map.old.region.chunk.Tile
import rs.emulator.world.map.region.RegionCoordinate
import rs.emulator.world.map.region.coordinate.Coordinate

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