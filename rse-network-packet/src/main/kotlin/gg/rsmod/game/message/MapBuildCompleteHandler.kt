package gg.rsmod.game.message

import rs.emulator.packet.network.message.impl.MapBuildCompleteMessage
import rs.emulator.entity.actor.player.Player
import rs.emulator.world.World

/**
 * @author Tom <rspsmods@gmail.com>
 */
class MapBuildCompleteHandler : MessageHandler<MapBuildCompleteMessage> {

    override fun handle(player: Player, message: MapBuildCompleteMessage)
    {
        println("handling map build completion.")
        //client.lastMapBuildTime = world.currentCycle
    }
}