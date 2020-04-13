package rs.emulator.entity.loc

import com.google.common.base.MoreObjects
import rs.emulator.cache.definition.DefinitionRepository
import rs.emulator.cache.definition.definition
import rs.emulator.cache.definition.entity.LocDefinition
import rs.emulator.cache.definition.varp.VarBitDefinition
import rs.emulator.entity.Entity
import rs.emulator.entity.actor.player.Player
import rs.emulator.world.map.old.region.chunk.Tile

/**
 * A [GameObject] is any type of map object that can occupy a tile.
 *
 * @author Tom <rspsmods@gmail.com>
 */
abstract class GameObject : Entity
{

    /**
     * The object id.
     */
    val id: Int

    /**
     * A bit-packed byte that holds the object "type" and "rotation".
     */
    val settings: Byte

    val type: Int get() = settings.toInt() shr 2

    val rot: Int get() = settings.toInt() and 3

    private constructor(id: Int, settings: Int, tile: Tile)
    {
        this.id = id
        this.settings = settings.toByte()
        this.tile = tile
    }

    constructor(id: Int, type: Int, rot: Int, tile: Tile) : this(id, (type shl 2) or rot, tile)

    fun getDef(): LocDefinition = definition().find(id)

    //fun isSpawned(world: World): Boolean = world.isSpawned(this)

    /**
     * This method will get the "visually correct" object id for this npc from
     * [player]'s view point.
     *
     * Objects can change their appearance for each player depending on their
     * [ObjectDef.transforms] and [ObjectDef.varp]/[ObjectDef.varbit].
     */
    fun getTransform(player: Player): Int {
        val def = getDef()
        if (def.varbit != -1) {
            val varbitDef: VarBitDefinition = definition().find(def.varbit)
            val state = player.varps.getBit(varbitDef.identifier, varbitDef.leastSignificantBit, varbitDef.mostSignificantBit)
            return def.transforms!![state]
        }

        if (def.varp != -1) {
            val state = player.varps.getState(def.varp)
            return def.transforms!![state]
        }

        return id
    }

    override fun toString(): String = MoreObjects.toStringHelper(this).add("id", id).add("type", type).add("rot", rot).add("tile", tile.toString()).toString()
}