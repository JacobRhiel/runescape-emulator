package rs.emulator.world.network.protocol

/**
 *
 * @author Chk
 */
enum class WorldConnectionResponseProtocol(
    val opcode: Int
)
{

    CONNECTION_APPROVED(2),

    REVISION_MISMATCH(6),

    BAD_SESSION_ID(10)

    ;

    companion object
    {

        fun fetchProtocol(opcode: Int) = values().firstOrNull { it.opcode == opcode }

    }

}