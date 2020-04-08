package rs.emulator.fileserver.network.message

import rs.emulator.network.shared.message.NetworkMessage

/**
 *
 * @author Chk
 */
data class JS5SetupXORMessage(val key: Int) : NetworkMessage
