package gg.rsmod.game.message

import rs.emulator.entity.actor.movement.MovementQueue
import rs.emulator.packet.network.message.impl.MoveGameClickMessage
import rs.emulator.packet.network.message.impl.SetMapFlagMessage
import rs.emulator.entity.actor.player.Player
import rs.emulator.utilities.logger

/**
 * @author Tom <rspsmods@gmail.com>
 */
class ClickMapHandler : MessageHandler<MoveGameClickMessage> {

    override fun handle(client: Player, message: MoveGameClickMessage) {
        /*if (!client.lock.canMove()) {
            return
        }

        if (client.timers.has(STUN_TIMER)) {
            client.write(SetMapFlagMessage(255, 255))
            client.writeMessage(Entity.YOURE_STUNNED)
            return
        }*/

        logger().info("Click map: x={}, z={}, type={}", message.x, message.z, message.movementType)

        /*client.closeInterfaceModal()
        client.interruptQueues()
        client.resetInteractions()*/
        client.interruptQueues()
        if (message.movementType == 2 /*&& world.privileges.isEligible(client.privilege, Privilege.ADMIN_POWER)*/) {
            client.moveTo(message.x, message.z, client.tile.height)
        } else {
            val stepType = if (message.movementType == 1) MovementQueue.StepType.FORCED_RUN else MovementQueue.StepType.NORMAL
            val noClip = false//client.attr[NO_CLIP_ATTR] ?: false
            client.walkTo(message.x, message.z, stepType, detectCollision = !noClip)
        }
    }
}