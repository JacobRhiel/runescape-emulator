package rs.emulator.entity.update.sync

import rs.emulator.buffer.BufferedWriter
import rs.emulator.entity.actor.Actor

/**
 *
 * @author Chk
 */
interface SynchronizationSegment
{

    //fun update(actor: Actor, actors: List<Actor>, local: Actor)

    fun encode(builder: BufferedWriter)

    val ADD get() = 0

    val REMOVE get() = 0

    val UPDATE get() = 0

    val WALKING get() = 1

    val HEIGHT get() = 1

    val RUNNING get() = 2

    val REGION get() = 2

    val MOVE get() = 3

}