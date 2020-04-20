package rs.emulator.cache.definition

import rs.emulator.buffer.BufferedReader

/**
 *
 * @author Chk
 */
abstract class MetaDataDefinition(identifier: Int) : Definition(identifier)
{

    override fun decodeHeader(reader: BufferedReader)
    {

    }

    override fun decode(opcode: Int, reader: BufferedReader)
    {

    }

}