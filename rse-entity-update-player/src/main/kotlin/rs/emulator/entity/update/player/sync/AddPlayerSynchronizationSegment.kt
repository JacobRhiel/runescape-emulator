package rs.emulator.entity.update.player.sync

import rs.emulator.buffer.BufferedWriter
import rs.emulator.entity.actor.player.Player
import rs.emulator.entity.update.sync.SynchronizationSegment

/**
 *
 * @author Chk
 */
class AddPlayerSynchronizationSegment(private val player: Player) : SynchronizationSegment
{

    override fun encode(builder: BufferedWriter)
    {

        builder.putBits(1, 1)

        builder.putBits(2, ADD)

       // buf.putBits(1, if (locationSegment != null) 1 else 0)

        //locationSegment?.encode(buf)

        builder.putBits(13, player.coordinate.x and 0x1FFF)
        builder.putBits(13, player.tile.z and 0x1FFF)
        builder.putBits(1, 1) // Requires block update

    }

}