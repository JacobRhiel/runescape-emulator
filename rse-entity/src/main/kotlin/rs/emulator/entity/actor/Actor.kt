package rs.emulator.entity.actor

import rs.emulator.entity.Entity
import rs.emulator.entity.update.UpdateBlockBuffer
import rs.emulator.entity.update.UpdateBlockType
import rs.emulator.world.map.region.chunk.Coordinate
import rs.emulator.world.map.region.chunk.Tile

/**
 *
 * @author Chk
 */
abstract class Actor : Entity()
{

    var index: Int = -1

    lateinit var lastTile: Tile

    var blockBuffer = UpdateBlockBuffer()

    var lastKnownRegionBase: Coordinate? = null

    abstract fun addBlock(block: UpdateBlockType)

    abstract fun hasBlock(block: UpdateBlockType): Boolean


}