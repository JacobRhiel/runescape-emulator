package gg.rsmod.util.io

import io.netty.buffer.ByteBuf

/**
 * @author Tom <rspsmods@gmail.com>
 */
object BufferUtils
{

    fun ByteBuf.readString(): String
    {
        return if (isReadable)
        {
            val start = readerIndex()
            while (readByte().toInt() != 0);
            val size = readerIndex() - start

            val data = ByteArray(size)
            readerIndex(start)
            readBytes(data)

            String(data, 0, size - 1)
        }
        else
        {
            ""
        }
    }

    fun ByteBuf.readJagexString(): String {
        return if (isReadable && readByte().toInt() != 0)
        {
            val start = readerIndex()
            while (readByte().toInt() != 0);
            val size = readerIndex() - start

            val data = ByteArray(size)
            readerIndex(start)
            readBytes(data)

            String(data, 0, size - 1)
        }
        else
        {
            ""
        }
    }
}