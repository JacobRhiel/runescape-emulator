package gg.rsmod.game.message

import gg.rsmod.util.HuffmanCodec
import rs.emulator.cache.index.IndexConfig
import rs.emulator.packet.network.message.impl.MessagePublicMessage
import rs.emulator.entity.actor.player.Player
import rs.emulator.entity.actor.update.mask.ChatMessage
import rs.emulator.entity.actor.update.mask.ChatMessage.Companion.huffman
import rs.emulator.entity.update.UpdateBlockType
import rs.emulator.fileStore

/**
 * @author Tom <rspsmods@gmail.com>
 */
class MessagePublicHandler : MessageHandler<MessagePublicMessage>
{

    override fun handle(client: Player, message: MessagePublicMessage) {
        val decompressed = ByteArray(256)
        huffman.decompress(message.data, decompressed, message.length)

        val unpacked = String(decompressed, 0, message.length)
        val type = ChatMessage.ChatType.values.firstOrNull { it.id == message.type } ?: ChatMessage.ChatType.NONE
        val effect = ChatMessage.ChatEffect.values.firstOrNull { it.id == message.effect } ?: ChatMessage.ChatEffect.NONE
        val color = ChatMessage.ChatColor.values.firstOrNull { it.id == message.color } ?: ChatMessage.ChatColor.NONE

        client.blockBuffer.publicChat = ChatMessage(unpacked, 2, type, effect, color)
        client.addBlock(UpdateBlockType.PUBLIC_CHAT)
       // world.getService(LoggerService::class.java, searchSubclasses = true)?.logPublicChat(client, unpacked)
    }
}