@file:Suppress("UnstableApiUsage")

package rs.emulator.packet

import com.google.common.util.concurrent.AbstractIdleService
import com.google.inject.Inject
import com.google.inject.Singleton
import gg.rsmod.game.message.*
import rs.emulator.utilities.logger

/**
 *
 * @author Chk
 */
@Singleton class PacketService @Inject constructor(private val structureSet: MessageStructureSet,
                                                   private val decoderSet: MessageDecoderSet,
                                                   private val encoderSet: MessageEncoderSet
) : AbstractIdleService()
{

    override fun startUp()
    {

        structureSet.load()

        decoderSet.init(structureSet)

        encoderSet.init()

        logger().info("Loaded {} packets. {} encoders and {} decoders.", structureSet.packetCount, encoderSet.encoderCount, decoderSet.decoderCount)

        PacketConstants.MESSAGE_STRUCTURE_SET = structureSet

        PacketConstants.MESSAGE_ENCODER_SET = encoderSet

        PacketConstants.MESSAGE_DECODER_SET = decoderSet

    }

    override fun shutDown()
    {



    }

}