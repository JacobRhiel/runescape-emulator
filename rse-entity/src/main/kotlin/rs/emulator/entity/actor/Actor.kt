package rs.emulator.entity.actor

import rs.emulator.entity.Entity
import rs.emulator.entity.actor.movement.MovementQueue
import rs.emulator.entity.actor.player.Player
import rs.emulator.entity.update.UpdateBlockBuffer
import rs.emulator.entity.update.UpdateBlockType
import rs.emulator.model.path.*
import rs.emulator.model.path.strategy.BFSPathFindingStrategy
import rs.emulator.model.queue.QueueTask
import rs.emulator.model.queue.QueueTaskSet
import rs.emulator.model.queue.impl.PawnQueueTaskSet
import rs.emulator.packet.network.message.impl.SetMapFlagMessage
import rs.emulator.entity.old.collision.Collision
import rs.emulator.entity.old.collision.CollisionManager
import rs.emulator.entity.old.region.chunk.*
import java.util.*

/**
 *
 * @author Chk
 */
abstract class Actor : Entity()
{

    var index: Int = -1

    var lastTile: Tile? = null

    var blockBuffer = UpdateBlockBuffer()

    var lastKnownRegionBase: Coordinate? = null

    val movementQueue by lazy { MovementQueue(this) }

    var steps: MovementQueue.StepDirection? = null

    internal var lastFacingDirection: Direction = Direction.SOUTH

    val faceDirection: Direction
        get() = lastFacingDirection

    var moved = false

    abstract fun addBlock(block: UpdateBlockType)

    abstract fun hasBlock(block: UpdateBlockType): Boolean

    abstract fun isRunning() : Boolean

    abstract fun getSize(): Int

    private var futureRoute: FutureRoute? = null

    fun moveTo(x: Int, z: Int, height: Int = 0) {
        moved = true
        blockBuffer.teleport = !tile.isWithinRadius(x, z, height, Player.NORMAL_VIEW_DISTANCE)
        tile = Tile(x, z, height)
        movementQueue.clear()
        addBlock(UpdateBlockType.MOVEMENT)
    }

    fun moveTo(tile: Tile) {
        moveTo(tile.x, tile.z, tile.height)
    }

    /**
     * Handle the [futureRoute] if necessary.
     */
    fun handleFutureRoute() {
        if (futureRoute?.completed == true && futureRoute?.strategy?.cancel == false) {
            val futureRoute = futureRoute!!
            walkPath(futureRoute.route.path, futureRoute.stepType, futureRoute.detectCollision)
            this.futureRoute = null
        }
    }

    /**
     * Walk to all the tiles specified in our [path] queue, using [stepType] as
     * the [MovementQueue.StepType].
     */
    fun walkPath(path: Queue<Tile>, stepType: MovementQueue.StepType, detectCollision: Boolean) {
        if (path.isEmpty()) {
            if (this is Player) {
                channel.write(SetMapFlagMessage(255, 255))
            }
            return
        }

       /* if (timers.has(FROZEN_TIMER)) {
            if (this is Player) {
                writeMessage(MAGIC_STOPS_YOU_FROM_MOVING)
            }
            return
        }

        if (timers.has(STUN_TIMER)) {
            return
        }*/

        movementQueue.clear()

        var tail: Tile? = null
        var next = path.poll()
        while (next != null) {
            movementQueue.addStep(next, stepType, detectCollision)
            val poll = path.poll()
            if (poll == null) {
                tail = next
            }
            next = poll
        }

        /*
         * If the tail is null (should never be unless we mess with code above), or
         * if the tail is the tile we're standing on, then we don't have to move at all!
         */
        if (tail == null || tail.sameAs(tile)) {
            if (this is Player) {
                channel.write(SetMapFlagMessage(255, 255))
            }
            movementQueue.clear()
            return
        }

        if (this is Player && lastKnownRegionBase != null) {
            channel.write(SetMapFlagMessage(tail.x - lastKnownRegionBase!!.x, tail.z - lastKnownRegionBase!!.z))
        }
    }

    fun walkTo(tile: Tile, stepType: MovementQueue.StepType = MovementQueue.StepType.NORMAL, detectCollision: Boolean = true) = walkTo(tile.x, tile.z, stepType, detectCollision)

    fun walkTo(x: Int, z: Int, stepType: MovementQueue.StepType = MovementQueue.StepType.NORMAL, detectCollision: Boolean = true) {
        /*
         * Already standing on requested destination.
         */
        if (tile.x == x && tile.z == z) {
            return
        }

       /* if (timers.has(FROZEN_TIMER)) {
            if (this is Player) {
                writeMessage(MAGIC_STOPS_YOU_FROM_MOVING)
            }
            return
        }

        if (timers.has(STUN_TIMER)) {
            return
        }*/

        val multiThread = true//world.multiThreadPathFinding
        val request = PathRequest.createWalkRequest(this, x, z, projectile = false, detectCollision = detectCollision)
        val strategy = createPathFindingStrategy(copyChunks = multiThread)

        /*
         * When using multi-thread path-finding, the [PathRequest.createWalkRequest]
         * must have the [tile] in sync with the game-thread, so we need to make sure
         * that in this cycle, the pawn's [tile] does not change. The easiest way to
         * do this is by clearing their movement queue. Though it can cause weird
         */
        if (multiThread) {
            movementQueue.clear()
        }
        futureRoute?.strategy?.cancel = true

        if (multiThread) {
            futureRoute = FutureRoute.of(strategy, request, stepType, detectCollision)
        } else {
            val route = strategy.calculateRoute(request)
            walkPath(route.path, stepType, detectCollision)
        }
    }

    suspend fun walkTo(it: QueueTask, tile: Tile, stepType: MovementQueue.StepType = MovementQueue.StepType.NORMAL, detectCollision: Boolean = true) = walkTo(it, tile.x, tile.z, stepType, detectCollision)

    suspend fun walkTo(it: QueueTask, x: Int, z: Int, stepType: MovementQueue.StepType = MovementQueue.StepType.NORMAL, detectCollision: Boolean = true): Route
    {
        /*
         * Already standing on requested destination.
         */
        if (tile.x == x && tile.z == z) {
            return Route(EMPTY_TILE_DEQUE, success = true, tail = Tile(tile))
        }
        val multiThread = true//world.multiThreadPathFinding
        val request = PathRequest.createWalkRequest(this, x, z, projectile = false, detectCollision = detectCollision)
        val strategy = createPathFindingStrategy(copyChunks = multiThread)

        movementQueue.clear()
        futureRoute?.strategy?.cancel = true

        if (multiThread) {
            futureRoute = FutureRoute.of(strategy, request, stepType, detectCollision)
            while (!futureRoute!!.completed) {
                it.wait(1)
            }
            return futureRoute!!.route
        }

        val route = strategy.calculateRoute(request)
        walkPath(route.path, stepType, detectCollision)
        return route
    }

    internal fun createPathFindingStrategy(copyChunks: Boolean = false): PathFindingStrategy {
        val collision: CollisionManager = if (copyChunks) {
            val chunks = Collision.chunks.copyChunksWithinRadius(tile.chunkCoords, height = tile.height, radius = Chunk.CHUNK_VIEW_RADIUS)
            CollisionManager(chunks, createChunksIfNeeded = false)
        } else {
            Collision.collision
        }
        return /*if (entityType.isPlayer) */BFSPathFindingStrategy(collision)/* else SimplePathFindingStrategy(collision)*/
    }

    fun hasMoveDestination(): Boolean = futureRoute != null || movementQueue.hasDestination()

    fun stopMovement() {
        movementQueue.clear()
    }

    fun interruptQueues() {
        queues.terminateTasks()
    }

    val queues: QueueTaskSet = PawnQueueTaskSet()

    companion object {
        private val EMPTY_TILE_DEQUE = ArrayDeque<Tile>()
    }

}