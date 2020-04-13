package rs.emulator.entity.update

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
import rs.emulator.entity.update.mask.UpdateMask

/**
 *
 * @author Chk
 */
interface ActorUpdateProtocol
{

    fun instantiate()

    /*val maskSet = Int2ObjectOpenHashMap<UpdateMask>()

    companion object
    {

        @JvmStatic
        fun main(args: Array<String>)
        {

            for(i in 0 until 5012)
            {
                if(Integer.decode("0x$i") == 2048)
                    println("0x$i, 2048")
            }

        }

    }*/

}