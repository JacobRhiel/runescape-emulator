package rs.emulator.fileserver.network.message

import io.netty.channel.ChannelHandlerContext
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
) : NetworkMessage
{

    override fun handle(ctx: ChannelHandlerContext)
    {

        val fileStore = FileStoreService.store

        if (index == 255)
        {
            if (archive == 255)
            {
                val buf = fileStore.fetchIndexHeaderBuffer().toBufferedReader()
                ctx.writeAndFlush(JS5FileResponseMessage(index, archive, buf))
            } else
                ctx.writeAndFlush(JS5FileResponseMessage(index, archive, fileStore.fetchIndexTableData(archive)))
        }
        else
            ctx.writeAndFlush(JS5FileResponseMessage(index, archive, fileStore.fetchArchiveCompressed(index, archive)))

    }

}