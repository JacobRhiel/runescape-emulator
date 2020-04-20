package rs.emulator.entity.actor.player.update.segment

import rs.emulator.packet.GamePacketBuilder
import rs.emulator.entity.actor.player.Player
import rs.emulator.entity.update.segment.SynchronizationSegment
import rs.emulator.world.map.region.RegionCoordinate

/**
 * @author Tom <rspsmods@gmail.com>
 */
class AddLocalPlayerSegment(private val other: Player, private val locationSegment: PlayerLocationHashSegment?) :
    SynchronizationSegment
{

    override fun encode(buf: GamePacketBuilder) {
        /*
         * Signal to the client that the player needs to be decoded.
         */
        buf.putBits(1, 1)

        /*
         * Signal to the client that the non-local player needs to be added
         * as a local player.
         */
        buf.putBits(2, 0)

        /*
         * Signal to the client that the player needs to have their location
         * decoded.
         */
        buf.putBits(1, if (locationSegment != null) 1 else 0)

        /*
         * Encode the player's location hash.
         */
        locationSegment?.encode(buf)

        buf.putBits(13, other.tile.x and 0x1FFF)
        buf.putBits(13, other.tile.z and 0x1FFF)
        buf.putBits(1, 1) // Requires block update
    }

/*    fun movement(current: RegionCoordinate, last: RegionCoordinate) : SynchronizationSegment?
    {

        RegionCoordinate.regionDelta(current, last) { deltaX, deltaY, deltaPlane ->
            return if (deltaX == 0 && deltaY == 0 && deltaPlane == 0) {
                null//No update needed
            } else if (deltaX == 0 && deltaY == 0 && deltaPlane != 0) {
                HeightPlayerSync.create(current, last)//Change player plane
            } else if (deltaX == -1 || deltaY == -1 || deltaX == 1 || deltaY == 1) {
                RegionPlayerSync.create(current, last)//Move to adjacent region
            } else {
                MoveGlobalPlayerSync.create(current, last)//Move to a non-adjacent region
            }
        }

    }*/

}