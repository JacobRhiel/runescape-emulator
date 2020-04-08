package rs.emulator.network.shared.handshake.channel.message

import rs.emulator.network.shared.handshake.protocol.HandshakeRequestProtocol
import rs.emulator.network.shared.message.NetworkMessage

/**
 *
 * @author Chk
 */
data class RequestUpdatePipelineMessage(val request: HandshakeRequestProtocol) : NetworkMessage
