package rs.emulator.network.shared.handshake.protocol

import rs.emulator.network.shared.protocol.HeaderProtocol

/**
 *
 * @author Chk
 */
enum class HandshakeResponseProtocol(
    private val opcode: Int
)
    : HeaderProtocol
{

    ALLOW_HANDSHAKE(0),

    REJECT_HANDSHAKE(1)

    ;

    companion object
    {

        fun fetchResponse(opcode: Int) = values().firstOrNull { it.opcode == opcode }

    }

}