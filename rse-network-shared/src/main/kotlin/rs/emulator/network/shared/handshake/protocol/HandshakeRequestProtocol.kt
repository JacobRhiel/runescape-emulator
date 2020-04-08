package rs.emulator.network.shared.handshake.protocol

import rs.emulator.network.shared.protocol.HeaderProtocol

/**
 *
 * @author Chk
 */
enum class HandshakeRequestProtocol(
    private val opcode: Int
)
    : HeaderProtocol
{


    WORLD_SERVER_CONNECTION(14),

    FILE_SERVER_CONNECTION(15)

    ;

    companion object
    {

        fun fetchProtocol(opcode: Int) = values().firstOrNull { it.opcode == opcode }

    }


}