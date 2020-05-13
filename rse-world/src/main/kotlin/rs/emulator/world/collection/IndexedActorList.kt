package rs.emulator.world.collection

import rs.emulator.entity.actor.Actor

/**
 *
 * @author Chk
 */
class IndexedActorList<T : Actor>(capacity: Int) : ArrayList<T>(capacity)
{

    override fun add(actor: T): Boolean
    {
        val added = super.add(actor)
        val index = indexOf(actor)
        println("index: " + actor.index)
        actor.index = index//if(index == 0) 1 else index + 1
        return added
    }

    override fun remove(actor: T): Boolean
    {
        val removed = super.remove(actor)
        actor.index = -1
        return removed
    }

}