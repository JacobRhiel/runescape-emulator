package rs.emulator.world.task

import rs.emulator.entity.actor.Actor

/**
 * A task in any pawn synchronization process.
 *
 * @author Tom <rspsmods@gmail.com>
 */
interface SynchronizationTask<T : Actor>
{

    fun run(actor: T)

}