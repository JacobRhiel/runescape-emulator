package gg.rsmod.game.message

import rs.emulator.packet.network.message.impl.MoveMinimapClickMessage
import rs.emulator.entity.actor.movement.MovementQueue
import rs.emulator.entity.actor.player.Player

/**
 * @author Tom <rspsmods@gmail.com>
 */
class ClickMinimapHandler : MessageHandler<MoveMinimapClickMessage> {

    override fun handle(client: Player, message: MoveMinimapClickMessage) {
       /* if (!client.lock.canMove()) {
            return
        }

        if (client.timers.has(STUN_TIMER)) {
            client.write(SetMapFlagMessage(255, 255))
            client.writeMessage(Entity.YOURE_STUNNED)
            return
        }*/

        log(client, "Click minimap: x=%d, z=%d, type=%d", message.x, message.z, message.movementType)

       // client.closeInterfaceModal()
        client.interruptQueues()
        //client.resetInteractions()

        if (message.movementType == 2 /*&& world.privileges.isEligible(client.privilege, Privilege.ADMIN_POWER)*/) {
            client.moveTo(message.x, message.z, client.tile.height)
        } else {
            val stepType = if (message.movementType == 1) MovementQueue.StepType.FORCED_RUN else MovementQueue.StepType.NORMAL
            val noClip = false//client.attr[NO_CLIP_ATTR] ?: false
            client.walkTo(message.x, message.z, stepType, detectCollision = !noClip)
        }
    }
}