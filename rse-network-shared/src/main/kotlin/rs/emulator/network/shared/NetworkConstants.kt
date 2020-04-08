package rs.emulator.network.shared

import io.netty.util.AttributeKey
import rs.emulator.network.shared.session.NetworkSession

/**
 *
 * @author Chk
 */
object NetworkConstants
{

    lateinit var CURRENT_SESSION: NetworkSession

    val SESSION_KEY: AttributeKey<NetworkSession> = AttributeKey.valueOf("network_session")

}