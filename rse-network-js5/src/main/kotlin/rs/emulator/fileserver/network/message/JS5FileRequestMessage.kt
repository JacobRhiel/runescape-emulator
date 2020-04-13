package rs.emulator.fileserver.network.message

import io.netty.channel.ChannelHandlerContext
import rs.emulator.fileStore
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

        if (index == 255)
        {
            if (archive == 255)
                ctx.writeAndFlush(JS5FileResponseMessage(index, archive, fileStore.fetchIndexHeaderBuffer().toBufferedReader()))
            else
                ctx.writeAndFlush(JS5FileResponseMessage(index, archive, fileStore.fetchIndexTableData(archive)))
        }
        else
            ctx.writeAndFlush(JS5FileResponseMessage(index, archive, fileStore.fetchArchiveCompressed(index, archive)))

    }

}