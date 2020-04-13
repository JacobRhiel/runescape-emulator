package rs.emulator.entity.update.player

import rs.emulator.entity.update.ActorUpdateProtocol

/**
 *
 * @author Chk
 */
class PlayerUpdateProtocol : ActorUpdateProtocol
{

    private val idlePlayerFlags = IntArray(2048)

    override fun instantiate()
    {



    }

    fun isSlotFree(index: Int): Boolean = idlePlayerFlags[index] and 0x1 == 0

    fun isSlotBlocked(index: Int) : Boolean = idlePlayerFlags[index] and 0x1 != 0

    fun setIdle(index: Int) = idlePlayerFlags[index].apply { or(2) }

    fun shiftSlots() = idlePlayerFlags.forEachIndexed { index, _ -> idlePlayerFlags[index] = idlePlayerFlags[index] shr 1 }

}