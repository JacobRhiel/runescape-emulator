package gg.rsmod.game.message

import com.fasterxml.jackson.databind.node.ArrayNode
import com.google.inject.Inject
import com.google.inject.Singleton
import rs.emulator.buffer.packet.PacketType
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
import rs.emulator.buffer.type.DataType
import rs.emulator.buffer.type.order.DataOrder
import rs.emulator.buffer.type.signature.DataSignature
import rs.emulator.buffer.type.transform.DataTransformation
import rs.emulator.packet.configuration.PacketConfiguration
import rs.emulator.packet.network.message.MessageValue
import rs.emulator.packet.network.message.impl.*
import java.io.File
import kotlin.collections.set

/**
 * Stores all the [MessageStructure]s that are used on the
 * [gg.rsmod.game.service.GameService].
 *
 * @author Tom <rspsmods@gmail.com>
 */
@Singleton
class MessageStructureSet @Inject constructor(private val configuration: PacketConfiguration)
{

    /**
     * The [MessageStructure]s stored respectively to their [Class].
     */
    private val structureClasses = Object2ObjectOpenHashMap<Class<*>, MessageStructure>()

    /**
     * The [MessageStructure]s stored respectively to their opcode.
     */
    private val structureOpcodes = arrayOfNulls<MessageStructure>(256)

    val packetCount: Int = structureClasses.size

    fun get(type: Class<*>): MessageStructure? = structureClasses[type]

    fun get(opcode: Int): MessageStructure? = structureOpcodes[opcode]

    /**
     * Decodes the [packetStructures] [File]. The format is irrelevant as long
     * as the [structureClasses] is populated with correct data.
     */
    fun load(): MessageStructureSet {
        load(storeOpcodes = false)
        //load(storeOpcodes = true)
        return this
    }

    private fun load(storeOpcodes: Boolean)
    {

        //todo add configuration checking, for dummies.
        val outgoingPackets = configuration.fetchValue<ArrayNode>("outgoing_packets")!!.toList()

        outgoingPackets.forEach {

            val messageClassName = it.get("message").asText().removeSurrounding("\"")

            val packetType = PacketType.valueOf(it.get("type").asText())

            val messageClazz = Class.forName(messageClassName)

            val packetLength = if(it.has("length")) it.get("length").asInt() else 0

            val ignore = if(it.has("ignore")) it.get("ignore").asBoolean() else false

            val opcodes = mutableListOf<Int>()

            if(it.has("opcodes"))
            {
                val split = (it.get("opcodes").asText().trim().split(","))
                split.forEach { opcode -> opcodes.add(opcode.toInt()) }
            }
            else if(it.has("opcode"))
                opcodes.add(it.get("opcode").asInt())

            if(messageClazz::class.java != IgnoreMessage::class.java)
            {

                val structure = if(it.has("structure")) it.get("structure") as ArrayNode else null

                val values = Object2ObjectLinkedOpenHashMap<String, MessageValue>()

                structure?.forEach { struct ->

                    val name = struct["name"].asText()
                    val order = if (struct.has("order")) DataOrder.valueOf(struct["order"].asText()) else DataOrder.BIG
                    val transform = if (struct.has("trans")) DataTransformation.valueOf(struct["trans"].asText()) else DataTransformation.NONE
                    val type = DataType.valueOf(struct["type"].asText())
                    val signature = if (struct.has("sign")) DataSignature.valueOf((struct["sign"].asText()).toUpperCase()) else DataSignature.SIGNED
                    values[name] = MessageValue(
                        id = name, order = order, transformation = transform, type = type,
                        signature = signature
                    )
                }

                val messageStructure = MessageStructure(type = packetType, opcodes = opcodes.toIntArray(), length = packetLength,
                                                        ignore = ignore, values = values)

                structureClasses[messageClazz] = messageStructure

                opcodes.forEach { opcode -> structureOpcodes[opcode] = messageStructure }

            }
            else
            {

                val messageStructure = MessageStructure(type = packetType, opcodes = opcodes.toIntArray(), length = packetLength,
                                                        ignore = ignore, values = Object2ObjectLinkedOpenHashMap(0))

                structureClasses[messageClazz] = messageStructure

                opcodes.forEach { opcode -> structureOpcodes[opcode] = messageStructure }

            }

        }

        val incomingPackets = configuration.fetchValue<ArrayNode>("incoming_packets")!!.toList()

        incomingPackets.forEach {

            val messageClassName = it.get("message").asText().removeSurrounding("\"")

            val packetType = PacketType.valueOf(it.get("type").asText())

            val messageClazz = Class.forName(messageClassName)

            val packetLength = if(it.has("length")) it.get("length").asInt() else 0

            val ignore = if(it.has("ignore")) it.get("ignore").asBoolean() else false

            val opcodes = mutableListOf<Int>()

            if(it.has("opcodes"))
            {
                val split = (it.get("opcodes").asText().trim().split(","))
                split.forEach { opcode -> opcodes.add(opcode.toInt()) }
            }
            else if(it.has("opcode"))
                opcodes.add(it.get("opcode").asInt())

            if(messageClazz::class.java != IgnoreMessage::class.java)
            {

                val structure = if(it.has("structure")) it.get("structure") as ArrayNode else null

                val values = Object2ObjectLinkedOpenHashMap<String, MessageValue>()

                structure?.forEach { struct ->

                    val name = struct["name"].asText()
                    val order = if (struct.has("order")) DataOrder.valueOf(struct["order"].asText()) else DataOrder.BIG
                    val transform = if (struct.has("trans")) DataTransformation.valueOf(struct["trans"].asText()) else DataTransformation.NONE
                    val type = DataType.valueOf(struct["type"].asText())
                    val signature = if (struct.has("sign")) DataSignature.valueOf((struct["sign"].asText()).toUpperCase()) else DataSignature.SIGNED
                    values[name] = MessageValue(
                        id = name, order = order, transformation = transform, type = type,
                        signature = signature
                    )
                }

                val messageStructure = MessageStructure(type = packetType, opcodes = opcodes.toIntArray(), length = packetLength,
                                                        ignore = ignore, values = values)

                structureClasses[messageClazz] = messageStructure

                opcodes.forEach { opcode -> structureOpcodes[opcode] = messageStructure }

            }
            else
            {

                val messageStructure = MessageStructure(type = packetType, opcodes = opcodes.toIntArray(), length = packetLength,
                                                        ignore = ignore, values = Object2ObjectLinkedOpenHashMap(0))

                structureClasses[messageClazz] = messageStructure

                opcodes.forEach { opcode -> structureOpcodes[opcode] = messageStructure }

            }

        }

    }
}