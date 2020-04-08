package rs.emulator.fileserver.network.message

import com.google.common.primitives.Ints
import com.google.inject.Binder
import com.google.inject.Module
import io.netty.channel.ChannelHandlerContext
import mu.KLogging
import net.runelite.cache.fs.Container
import net.runelite.cache.fs.jagex.CompressionType
import net.runelite.cache.fs.jagex.DiskStorage
import rs.emulator.fileserver.FileStoreService
import rs.emulator.network.shared.message.NetworkMessage

/**
 *
 * @author Chk
 */
data class JS5FileRequestMessage(
    val urgent: Boolean,
    val index: Int,
    val archive: Int
) : NetworkMessage, Module
{

    override fun handle(ctx: ChannelHandlerContext)
    {

        val fileStore = FileStoreService.store

        var data: ByteArray

        if (index == 255)
        {
            if (archive == 255)
            {

                if (cachedIndexData == null)
                {
                    val buf = ctx.alloc().heapBuffer(fileStore.indexes.size * 8)

                    fileStore.indexes.forEach { index ->
                        buf.writeInt(index.crc)
                        buf.writeInt(index.revision)
                    }

                    val container = Container(CompressionType.NONE, -1)
                    container.compress(buf.array().copyOf(buf.readableBytes()), null)
                    cachedIndexData = container.data
                    buf.release()
                }
                data = cachedIndexData!!

                /*val buf = fileStore.fetchIndexHeaderBuffer().toBufferedReader()
                ctx.writeAndFlush(JS5FileResponseMessage(index, archive, buf))*/
            } else
            {
                println("index 255 not archive")
                //ctx.writeAndFlush(JS5FileResponseMessage(index, archive, fileStore.fetchIndexTableData(archive)))
                val storage = fileStore.storage as DiskStorage
                data = storage.readIndex(archive)
            }
            val response = JS5FileResponseMessage(index = index, archive = archive, buffer = data)
            ctx.writeAndFlush(response)
        }
        else
        {
            println("idx file request.")
            //ctx.writeAndFlush(JS5FileResponseMessage(index, archive, fileStore.fetchArchiveCompressed(index, archive)))
            val index = fileStore.findIndex(index)!!
            val archive = index.getArchive(archive)!!
            var data = fileStore.storage.loadArchive(archive)

            if (data != null)
            {
                val compression = data[0]
                val length = Ints.fromBytes(data[1], data[2], data[3], data[4])
                val expectedLength = length + (if (compression.toInt() != CompressionType.NONE) 9 else 5)
                if (expectedLength != length && data.size - expectedLength == 2)
                {
                    data = data.copyOf(data.size - 2)
                }

                val response = JS5FileResponseMessage(index = this.index, archive = this.archive, buffer = data)
                ctx.writeAndFlush(response)
            } else
            {
                logger.warn("Data is missing from archive. index={}, archive={}", index, archive)
            }
        }

    }

    override fun configure(binder: Binder)
    {

    }

    companion object : KLogging()
    {
        private var cachedIndexData: ByteArray? = null
    }

}