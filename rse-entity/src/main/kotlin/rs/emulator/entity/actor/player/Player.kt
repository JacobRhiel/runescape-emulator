package rs.emulator.entity.actor.player

import gg.rsmod.util.ServerProperties
import io.netty.channel.Channel
import rs.emulator.encryption.xtea.XteaKeyService
import rs.emulator.entity.actor.Actor
import rs.emulator.entity.actor.player.update.PlayerUpdateProtocol
import rs.emulator.entity.actor.player.update.block.UpdateBlockSet
import rs.emulator.entity.update.UpdateBlockType
import rs.emulator.model.widget.WidgetSet
import rs.emulator.model.widget.root.RootWidgetType
import rs.emulator.model.widget.viewport.ViewportWidgetType
import rs.emulator.security.uuid.UUIDGenerator
import java.io.File
import java.nio.file.Paths
import java.util.*

/**
 *
 * @author Chk
 */
open class Player(val channel: Channel,
                  private val loginUsername: String) : Actor()
{

    val updateProtocol = PlayerUpdateProtocol()

    val uuid: UUID = UUIDGenerator.generate(loginUsername) //todo save/reload instead of regenerate

    fun fetchTileHashes() = updateProtocol.tiles

    val interfaces by lazy { WidgetSet() }

    val playerUpdateBlocks = UpdateBlockSet()

    val xteaKeyService = XteaKeyService()

    override fun addBlock(block: UpdateBlockType) {
        val bits = playerUpdateBlocks.updateBlocks[block]!!
        println("adding bits: ${bits.bit}")
        blockBuffer.addBit(bits.bit)
    }

    override fun hasBlock(block: UpdateBlockType): Boolean {
        val bits = playerUpdateBlocks.updateBlocks[block]!!
        println("block: $block has bits: ${bits.bit}")
        return blockBuffer.hasBit(bits.bit)
    }

    fun loadUpdateBlocks(blocksFile: File) {
        val properties = ServerProperties().loadYaml(blocksFile)

        if (properties.has("players")) {
            playerUpdateBlocks.load(properties.extract("players"))
        }
    }

    fun login()
    {

        loadUpdateBlocks(Paths.get("./data/blocks.yml").toFile())

        updateProtocol.initializeGPI(this)

        //addBlock(UpdateBlockType.ANIMATION)

        addBlock(UpdateBlockType.APPEARANCE)

/*        addBlock(UpdateBlockType.UNKNOWN_1)

        addBlock(UpdateBlockType.CONTEXT_MENU)

        addBlock(UpdateBlockType.UNKNOWN_2)*/

    }

    fun widgets()
    {
        interfaces.constructViewport(ViewportWidgetType.FIXED)

        channel.write(interfaces.createViewportRequest())

        /*RootWidgetType.values().filter { it.interfaceId != -1 }.forEach { pane ->

            channel.write(interfaces.createDisplayRequest(interfaces.viewportWidget.interfaceId, pane.fixedChildId, pane.interfaceId))

        }*/
    }

    companion object
    {

        /**
         * How many tiles a player can 'see' at a time, normally.
         */
        const val NORMAL_VIEW_DISTANCE = 15

        /**
         * How many tiles a player can 'see' at a time when in a 'large' viewport.
         */
        const val LARGE_VIEW_DISTANCE = 127

        /**
         * How many tiles in each direction a player can see at a given time.
         * This should be as far as players can see entities such as ground items
         * and objects.
         */
        const val TILE_VIEW_DISTANCE = 32

    }

}