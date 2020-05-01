package rs.emulator.packet.network.session

import gg.rsmod.game.message.Message
import gg.rsmod.game.message.MessageHandler
import gg.rsmod.net.packet.PacketMetadata
import io.netty.channel.Channel
import io.netty.channel.ChannelHandlerContext
import rs.emulator.encryption.isaac.IsaacRandom
import rs.emulator.entity.actor.player.Player
import rs.emulator.network.shared.channel.DefaultChannelHandler
import rs.emulator.network.shared.message.NetworkMessage
import rs.emulator.network.shared.session.NetworkSession
import rs.emulator.packet.*
import rs.emulator.packet.network.message.channel.decoder.GamePacketDecoder
import rs.emulator.packet.network.message.channel.decoder.GamePacketEncoder
import rs.emulator.packet.network.message.channel.encoder.GameMessageEncoder
import rs.emulator.packet.network.message.impl.*
import rs.emulator.utilities.logger
import rs.emulator.entity.old.region.chunk.Tile

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

    lateinit var player: Player

    fun test(player: Player)
    {

        this.player = player

        player.tile = Tile(3087, 3497)

        player.login()

        println("player index: " + player.index)

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

    private data class MessageHandle(val message: Message, val handler: MessageHandler<Message>, val opcode: Int, val length: Int)

    override fun onMessage(ctx: ChannelHandlerContext, msg: NetworkMessage)
    {

        if (msg is GamePacket) {
            val decoder = PacketConstants.MESSAGE_DECODER_SET!!.get(msg.opcode)
            if (decoder == null) {
                logger().warn("No decoder found for message $msg.")
                return
            }
            println("handling decoder: " + decoder::class.simpleName)
            val handler = PacketConstants.MESSAGE_DECODER_SET!!.getHandler(msg.opcode)
            if (handler == null) {
                logger().warn("No handler found for message $msg")
                return
            }

            val message = decoder.decode(msg.opcode, PacketConstants.MESSAGE_STRUCTURE_SET!!.get(msg.opcode)!!, GamePacketReader(msg))

            val handle = MessageHandle(message, handler, msg.opcode, msg.payload.readableBytes())

            handle.handler.handle(player, message)

            //messages.add(MessageHandle(message, handler, msg.opcode, msg.payload.readableBytes()))

            msg.payload.release()
        }

    }

    override fun onDestroy(ctx: ChannelHandlerContext)
    {

    }

}