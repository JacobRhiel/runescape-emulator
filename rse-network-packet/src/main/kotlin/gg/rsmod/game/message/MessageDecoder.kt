package gg.rsmod.game.message

import rs.emulator.packet.GamePacketReader
import rs.emulator.buffer.type.DataType
import rs.emulator.buffer.type.signature.DataSignature

abstract class MessageDecoder<T : Message>
{

    abstract fun decode(opcode: Int, reader: GamePacketReader): T

}