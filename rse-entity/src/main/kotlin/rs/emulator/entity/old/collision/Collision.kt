package rs.emulator.entity.old.collision

import rs.emulator.entity.old.region.chunk.ChunkSet

/**
 *
 * @author Chk
 */
object Collision
{

    val chunks = ChunkSet()

    val collision = CollisionManager(chunks)

}