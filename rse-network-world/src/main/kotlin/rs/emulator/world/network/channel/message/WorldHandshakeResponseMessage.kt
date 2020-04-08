package rs.emulator.world.network.channel.message

import rs.emulator.world.network.protocol.WorldConnectionResponseProtocol

/**
 *
 * @author Chk
 */
data class WorldHandshakeResponseMessage(val response: WorldConnectionResponseProtocol)