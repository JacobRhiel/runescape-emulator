package rs.emulator.entity.old.region.chunk

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
import it.unimi.dsi.fastutil.objects.ObjectArrayList
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
import rs.emulator.entity.Entity
import rs.emulator.entity.actor.Direction
import rs.emulator.entity.actor.player.Player
import rs.emulator.packet.network.message.impl.EntityGroupMessage
import rs.emulator.packet.network.message.impl.UpdateZonePartialFollowsMessage
import rs.emulator.entity.old.collision.*
import rs.emulator.entity.old.region.EntityType
import rs.emulator.entity.old.region.EntityUpdate

/**
 * Represents an 8x8 tile in the game map.
 *
 * @author Tom <rspsmods@gmail.com>
 */
class Chunk(val coords: ChunkCoords, val heights: Int) {

    constructor(other: Chunk) : this(other.coords, other.heights) {
        copyMatrices(other)
    }

    /**
     * The array of matrices of 8x8 tiles. Each index representing a height.
     */
    private val matrices: Array<CollisionMatrix> = CollisionMatrix.createMatrices(Tile.TOTAL_HEIGHT_LEVELS, CHUNK_SIZE, CHUNK_SIZE)

    internal val blockedTiles = ObjectOpenHashSet<Tile>()

    /**
     * The [Entity]s that are currently registered to the [Tile] key. This is
     * not used for [gg.rsmod.game.model.entity.Pawn], but rather [Entity]s
     * that do not regularly change [Tile]s.
     */
    private lateinit var entities: MutableMap<Tile, MutableList<Entity>>

    /**
     * A list of [EntityUpdate]s that will be sent to players who have just entered
     * a region that has this chunk as viewable.
     */
    private lateinit var updates: MutableList<EntityUpdate<*>>

    /**
     * Create the collections used for [Entity]s and [EntityUpdate]s.
     * @see entities
     * @see updates
     */
    fun createEntityContainers() {
        entities = Object2ObjectOpenHashMap()
        updates = ObjectArrayList()
    }

    fun getMatrix(height: Int): CollisionMatrix = matrices[height]

    fun setMatrix(height: Int, matrix: CollisionMatrix) {
        matrices[height] = matrix
    }

    private fun copyMatrices(other: Chunk) {
        other.matrices.forEachIndexed { index, matrix ->
            matrices[index] = CollisionMatrix(matrix)
        }
    }

    /**
     * Check if [tile] belongs to this chunk.
     */
    fun contains(tile: Tile): Boolean = coords == tile.chunkCoords

    fun isBlocked(tile: Tile, direction: Direction, projectile: Boolean): Boolean = matrices[tile.height].isBlocked(tile.x % CHUNK_SIZE, tile.z % CHUNK_SIZE, direction, projectile)

    fun isClipped(tile: Tile): Boolean = matrices[tile.height].isClipped(tile.x % CHUNK_SIZE, tile.z % CHUNK_SIZE)

    fun addEntity(entity: Entity, tile: Tile)
    {

        /*if (entity.entityType.isObject) {
            world.collision.applyCollision(world.definitions, entity as GameObject, CollisionUpdate.Type.ADD)
        }*/

        //if (!entity.entityType.isTransient) {
            val list = entities[tile] ?: ObjectArrayList(1)
            list.add(entity)
            entities[tile] = list
        //}

        val update = createUpdateFor(entity, spawn = true)
        if (update != null) {


           // if (entity.entityType != EntityType.STATIC_OBJECT) {

               // if (!entity.entityType.isTransient) {
                    updates.add(update)
                //}

                sendUpdate(update)
            //}
        }
    }

    fun removeEntity(entity: Entity, tile: Tile) {

        /*if (entity.entityType.isObject) {
            Collision.collision.applyCollision(world.definitions, entity as GameObject, CollisionUpdate.Type.REMOVE)
        }*/

        entities[tile]?.remove(entity)

        val update = createUpdateFor(entity, spawn = false)
        if (update != null) {
            /*if (entity.entityType == EntityType.STATIC_OBJECT) {
                updates.add(update)
            } else {*/
                updates.removeIf { it.entity == entity }
            //}

            sendUpdate(update)
        }
    }

    /**
     * Update the item amount of an existing [GroundItem] in [entities].
     *//*
    fun updateGroundItem(world: World, item: GroundItem, oldAmount: Int, newAmount: Int) {
        val update = ObjCountUpdate(EntityUpdateType.UPDATE_GROUND_ITEM, item, oldAmount, newAmount)
        sendUpdate(world, update)

        if (updates.removeIf { it.entity == item }) {
            updates.add(createUpdateFor(item, spawn = true)!!)
        }
    }

    *//**
     * Send the [update] to any [Client] entities that are within view distance
     * of this chunk.
     */
    private fun sendUpdate(update: EntityUpdate<*>) {
        val surrounding = coords.getSurroundingCoords()

        for (coords in surrounding) {
            val chunk = Collision.chunks.get(coords, createIfNeeded = false) ?: continue
            val clients = chunk.getEntities<Player>(EntityType.CLIENT)
            for (client in clients) {
                if (!canBeViewed(client, update.entity)) {
                    continue
                }
                val local = client.lastKnownRegionBase!!.toLocal(this.coords.toTile())
                client.channel.write(UpdateZonePartialFollowsMessage(local.x, local.z))
                client.channel.write(update.toMessage())
            }
        }
    }

    /**
     * Sends all [updates] from this chunk to the player [p].
     *
     * @param gameService
     * Game service is required to get the XTEA service.
     */
    fun sendUpdates(p: Player): ObjectArrayList<EntityGroupMessage>
    {
        val messages = ObjectArrayList<EntityGroupMessage>()

        updates.forEach { update ->
            val message = EntityGroupMessage(update.type.id, update.toMessage())
            if (canBeViewed(p, update.entity)) {
                messages.add(message)
            }
        }

        return messages
    }

    /**
     * Checks to see if player [p] is able to view [entity].
     */
    private fun canBeViewed(p: Player, entity: Entity): Boolean {
        if (p.tile.height != entity.tile.height) {
            return false
        }
       /* if (entity.entityType.isGroundItem) {
            val item = entity as GroundItem
            return item.isPublic() || item.isOwnedBy(p)
        }*/
        return true
    }

    private fun <T : Entity> createUpdateFor(entity: T, spawn: Boolean): EntityUpdate<*>? = null

    @Suppress("UNCHECKED_CAST")
    fun <T> getEntities(vararg types: EntityType): List<T> = entities.values.flatten().filter { it.entityType in types } as List<T>

    @Suppress("UNCHECKED_CAST")
    fun <T> getEntities(tile: Tile, vararg types: EntityType): List<T> = entities[tile]?.filter { it.entityType in types } as? List<T> ?: emptyList()

    companion object {
        /**
         * The size of a chunk, in tiles.
         */
        const val CHUNK_SIZE = 8

        /**
         * The amount of chunks in a region.
         */
        const val CHUNKS_PER_REGION = 13

        /**
         * The amount of [Chunk]s that can be viewed at a time by a player.
         */
        const val CHUNK_VIEW_RADIUS = 3

        /**
         * The size of a region, in tiles.
         */
        const val REGION_SIZE = CHUNK_SIZE * CHUNK_SIZE

        /**
         * The size of the viewport a [gg.rsmod.game.model.entity.Player] can
         * 'see' at a time, in tiles.
         */
        const val MAX_VIEWPORT = CHUNK_SIZE * CHUNKS_PER_REGION
    }
}