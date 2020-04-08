package rs.emulator

/**
 * https://www.rune-server.ee/runescape-development/rs-503-client-server/configuration/601853-world-list-location-configuration.html
 * @author Chk
 */
enum class WorldLocation(val identifier: Int)
{

    UNITED_STATES(227),

    ;

    companion object
    {

        fun fetchLocation(identifier: Int) = values().firstOrNull { it.identifier == identifier }

    }

}