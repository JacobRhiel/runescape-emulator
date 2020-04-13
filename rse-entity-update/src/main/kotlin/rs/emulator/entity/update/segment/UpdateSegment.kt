package rs.emulator.entity.update.segment

import rs.emulator.buffer.BufferedWriter

/**
 *
 * @author Chk
 */
interface UpdateSegment
{

    fun encode(buf: BufferedWriter)

}