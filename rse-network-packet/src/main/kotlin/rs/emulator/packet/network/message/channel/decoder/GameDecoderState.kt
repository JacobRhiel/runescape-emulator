package rs.emulator.packet.network.message.channel.decoder

/**
 * @author Tom <rspsmods@gmail.com>
 */
enum class GameDecoderState {
    OPCODE,
    LENGTH,
    PAYLOAD
}