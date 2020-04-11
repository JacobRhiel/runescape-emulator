package rs.emulator.entity

import rs.emulator.world.map.old.region.EntityType
import rs.emulator.world.map.old.region.chunk.Tile

/**
 *
 * @author Chk
 */
abstract class Entity
{

    lateinit var tile: Tile

    abstract val entityType: EntityType

}