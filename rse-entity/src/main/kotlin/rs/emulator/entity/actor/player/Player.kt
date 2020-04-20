package rs.emulator.entity.actor.player

import gg.rsmod.util.ServerProperties
import io.netty.channel.Channel
import rs.emulator.cache.definition.definition
import rs.emulator.cache.definition.varp.VarBitDefinition
import rs.emulator.encryption.xtea.XteaKeyService
import rs.emulator.entity.actor.Actor
import rs.emulator.entity.actor.movement.MovementQueue
import rs.emulator.entity.actor.player.storage.Inventory
import rs.emulator.entity.actor.player.storage.StorageManager
import rs.emulator.entity.actor.player.storage.bank.Bank
import rs.emulator.entity.actor.player.storage.equipment.Equipment
import rs.emulator.entity.actor.player.update.PlayerUpdateProtocol
import rs.emulator.entity.actor.player.update.block.UpdateBlockSet
import rs.emulator.entity.update.UpdateBlockType
import rs.emulator.entity.actor.player.viewport.Viewport
import rs.emulator.model.widget.InterfaceEvent
import rs.emulator.model.widget.WidgetSet
import rs.emulator.model.widget.root.RootWidgetType
import rs.emulator.model.widget.viewport.ViewportWidgetType
import rs.emulator.packet.network.message.ChatMessageType
import rs.emulator.packet.network.message.impl.*
import rs.emulator.security.uuid.UUIDGenerator
import rs.emulator.world.map.old.region.EntityType
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

    val varps = VarpSet(10253)//todo cache check size of archive.

    val playerUpdateBlocks = UpdateBlockSet()

    val xteaKeyService = XteaKeyService()

    val viewport by lazy { Viewport() }

    val storageManager = StorageManager()

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

        storageManager.bind(94, Equipment()) {

            setStateChangeListener {
                channel.write(
                    UpdateInvFullMessage(
                        containerKey = 94,
                        items = items.array
                    )
                )
            }

        }

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

        RootWidgetType.values().filter { it.interfaceId != -1 }.forEach { pane ->

            channel.write(interfaces.createDisplayRequest(interfaces.viewportWidget.interfaceId, pane.fixedChildId, pane.interfaceId))

        }

        channel.write(RunClientScriptMessage(1105, 1))
        channel.write(RunClientScriptMessage(423, "gpi"))

        syncVarp(1055)

        setVarbit(8119, 1)

/*        channel.write(VarpSmallMessage(843, 0))
        channel.write(VarpSmallMessage(1055, 0))
        channel.write(VarpSmallMessage(1107, 0))
        channel.write(VarpSmallMessage(1306, 0))

        channel.write(VarpLargeMessage(1737, -2147483648))*/

        for (i in 0 until varps.maxVarps)
        {
            if (varps.isDirty(i))
            {
                val varp = varps[i]
                val message = when
                {
                    varp.state in -Byte.MAX_VALUE..Byte.MAX_VALUE -> VarpSmallMessage(varp.id, varp.state)
                    else                                          -> VarpLargeMessage(varp.id, varp.state)
                }
                println("writing varp?")
                channel.write(message)
            }
        }
        varps.clean()

        channel.write(MessageGameMessage(ChatMessageType.GAME_MESSAGE.id, "", "Welcome to RuneScape Emulator."))

        storageManager.bind(93, Inventory()) {
            setStateChangeListener {
                channel.write(
                    UpdateInvFullMessage(
                        interfaceId = 149,
                        component = 0,
                        containerKey = 93,
                        items = items.array
                    )
                )
            }
        }
        storageManager.invalidateStateFor(93)

        storageManager.bind(95, Bank()) {
            setStateChangeListener {

                channel.write(UpdateInvFullMessage(
                    containerKey = 95,
                    items = items.array
                ))

            }
        }

/*
        val msg = EntityGroupMessage(7, EntityUpdate(7, this).toMessage())

        channel.write(UpdateZonePartialEnclosedMessage(local.x, local.z, PacketConstants.MESSAGE_ENCODER_SET!!, PacketConstants.MESSAGE_STRUCTURE_SET!!, msg))
*/

    }

    fun sendDebugMessage(message: String)
    {
        channel.write(MessageGameMessage(ChatMessageType.MOD_CHAT.id, "Debug", message))
    }

    fun setInterfaceEvents(interfaceId: Int, component: Int, range: IntRange, settings: EnumSet<InterfaceEvent>) = channel.write(IfSetEventsMessage(hash = ((interfaceId shl 16) or component), fromChild = range.start, toChild = range.endInclusive, setting = settings.sumBy { it.mask }))


    fun getVarp(id: Int): Int = varps.getState(id)

    fun setVarp(id: Int, value: Int) {
        varps.setState(id, value)
    }

    fun toggleVarp(id: Int) {
        varps.setState(id, varps.getState(id) xor 1)
    }

    fun syncVarp(id: Int) {
        setVarp(id, getVarp(id))
    }

    fun getVarbit(id: Int): Int
    {
        val def: VarBitDefinition = definition().find(id)
        println("varp get: " + def.index)
        return varps.getBit(def.index, def.leastSignificantBit, def.mostSignificantBit)
    }

    fun setVarbit(id: Int, value: Int) {
        val def: VarBitDefinition = definition().find(id)
        varps.setBit(def.index, def.leastSignificantBit, def.mostSignificantBit, value)
        println("varp : " + id + ", " + def.index)
    }

    /**
     * Write a varbit message to the player's client without actually modifying
     * its varp value in [Player.varps].
     */
/*    fun sendTempVarbit(id: Int, value: Int) {
        val def = world.definitions.get(VarpDefinition::class.java, id)
        val state = BitManipulation.setBit(varps.getState(def.varp), def.startBit, def.endBit, value)
        val message = if (state in -Byte.MAX_VALUE..Byte.MAX_VALUE) VarpSmallMessage(def.varp, state) else VarpLargeMessage(def.varp, state)
        write(message)
    }*/

    fun toggleVarbit(id: Int) {
        val def: VarBitDefinition = definition().find(id)
        varps.setBit(def.index, def.leastSignificantBit, def.mostSignificantBit, getVarbit(id) xor 1)
    }

    override fun isRunning(): Boolean = varps[173].state != 0 || movementQueue.peekLastStep()?.type == MovementQueue.StepType.FORCED_RUN

    override fun getSize(): Int = 1

    override val entityType: EntityType
        get() = EntityType.CLIENT

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