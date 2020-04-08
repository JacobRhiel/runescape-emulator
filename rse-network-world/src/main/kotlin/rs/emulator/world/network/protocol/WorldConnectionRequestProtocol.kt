package rs.emulator.world.network.protocol

/**
 *
 * @author Chk
 */
enum class WorldConnectionRequestProtocol(
    val opcode: Int
)
{

    CONNECTION(16),

    RECONNECTION(18)

    ;

    companion object
    {

        fun fetchProtocol(opcode: Int) = values().firstOrNull { it.opcode == opcode }

    }

}