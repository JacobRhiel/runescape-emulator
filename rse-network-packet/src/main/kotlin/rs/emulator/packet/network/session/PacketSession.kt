package rs.emulator.packet.network.session

import gg.rsmod.net.packet.PacketMetadata
import io.netty.channel.Channel
import io.netty.channel.ChannelHandlerContext
import rs.emulator.encryption.isaac.IsaacRandom
import rs.emulator.entity.actor.player.Player
import rs.emulator.network.shared.channel.DefaultChannelHandler
import rs.emulator.network.shared.message.NetworkMessage
import rs.emulator.network.shared.session.NetworkSession
import rs.emulator.packet.PacketConstants
import rs.emulator.packet.network.message.channel.decoder.GamePacketDecoder
import rs.emulator.packet.network.message.channel.decoder.GamePacketEncoder
import rs.emulator.packet.network.message.channel.encoder.GameMessageEncoder
import rs.emulator.packet.network.message.impl.*
import rs.emulator.world.map.region.chunk.Tile

/**
 *
 * @author Chk
 */
class PacketSession(
    val channel: Channel,
    private val isaacKeys: IntArray) : NetworkSession
{

    private val decodeRandom = IsaacRandom(isaacKeys)

    private val encodeRandom = IsaacRandom(IntArray(isaacKeys.size) { isaacKeys[it] + 50 })

    init
    {

        channel.pipeline().addBefore(DefaultChannelHandler::class.simpleName, GamePacketEncoder::class.simpleName, GamePacketEncoder(encodeRandom))

        channel.pipeline().addAfter(
            GamePacketEncoder::class.simpleName,
            GameMessageEncoder::class.simpleName,
            GameMessageEncoder(PacketConstants.MESSAGE_ENCODER_SET!!, PacketConstants.MESSAGE_STRUCTURE_SET!!)
        )

        channel.pipeline().addBefore(
            DefaultChannelHandler::class.simpleName,
            GamePacketDecoder::class.simpleName,
            GamePacketDecoder(decodeRandom,
                              PacketMetadata(PacketConstants.MESSAGE_STRUCTURE_SET!!)
            ))

    }

    fun test(player: Player)
    {

        player.tile = Tile(3087, 3497)

        player.lastTile = player.tile

        player.login()

        val msg = RebuildLoginMessage(
            player.index,
            player.tile,
            player.fetchTileHashes(),
            player.xteaKeyService
        )

        channel.write(msg)

        player.widgets()

        if(channel.isActive)
            channel.flush()

    }

    override fun onMessage(ctx: ChannelHandlerContext, msg: NetworkMessage)
    {



    }

    override fun onDestroy(ctx: ChannelHandlerContext)
    {

    }

}