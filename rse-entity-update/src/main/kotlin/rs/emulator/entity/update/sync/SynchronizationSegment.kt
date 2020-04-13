package rs.emulator.entity.update.sync

import rs.emulator.buffer.BufferedWriter

/**
 *
 * @author Chk
 */
interface SynchronizationSegment
{

    fun encode(buf: BufferedWriter)

}