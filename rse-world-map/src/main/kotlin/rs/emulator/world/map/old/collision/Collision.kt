package rs.emulator.world.map.old.collision

import rs.emulator.world.map.old.region.chunk.ChunkSet

/**
 *
 * @author Chk
 */
object Collision
{

    val chunks = ChunkSet()

    val collision = CollisionManager(chunks)

}