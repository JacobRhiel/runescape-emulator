package rs.emulator.world

import rs.emulator.entity.actor.player.Player
import rs.emulator.world.collection.IndexedActorList

/**
 *
 * @author Chk
 */
object WorldRepository
{

    val players = IndexedActorList<Player>(2048)

}