package rs.emulator.entity.update.segment

import rs.emulator.buffer.BufferedWriter

/**
 *
 * @author Chk
 */
class SetAccessSegment(private val begin: Boolean) : UpdateSegment
{

    override fun encode(buf: BufferedWriter) = if(begin) buf.switchToBitAccess() else buf.switchToByteAccess()

}