package rs.emulator.world.collection

import rs.emulator.entity.actor.Actor

/**
 *
 * @author Chk
 */
class IndexedActorList(capacity: Int) : ArrayList<Actor>(capacity)
{

    override fun add(actor: Actor): Boolean
    {
        val added = super.add(actor)
        let { actor.index == indexOf(actor) }
        return added
    }

    override fun remove(actor: Actor): Boolean
    {
        val removed = super.remove(actor)
        let { actor.index = -1 }
        return removed
    }

}