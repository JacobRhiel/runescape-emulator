package rs.emulator.entity.update.player.sync

import rs.emulator.buffer.BufferedWriter
import rs.emulator.entity.update.player.Direction
import rs.emulator.entity.update.sync.SynchronizationSegment
import rs.emulator.world.map.region.RegionCoordinate

/**
 *
 * @author Chk
 */
class RegionPlayerSynchronizationSegment(private val current: RegionCoordinate, private val last: RegionCoordinate) : SynchronizationSegment
{

    override fun encode(builder: BufferedWriter)
    {

        builder.putBits(1, true)//View Update
        builder.putBits(2, REGION)//Movement type
        //Calculate movement since last seen position
        RegionCoordinate.regionDelta(current, last) { deltaX, deltaY, deltaPlane ->
            val direction = Direction.getDirection(deltaX, deltaY)
            builder.putBits(5, (deltaPlane shl 3) + (direction and 0x7))
        }

    }

}