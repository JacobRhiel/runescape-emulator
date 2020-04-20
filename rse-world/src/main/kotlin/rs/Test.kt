package rs

/**
 *
 * @author Chk
 */
object Test
{

    @JvmStatic
    fun main(args: Array<String>)
    {

       /* for(i in 0 until 1000)
        {
            val a = Integer.decode("0x$i")
            println("$i : $a")
        }*/

        println("test: " + ((1057 + 512) - (((1057 + 512) shr 8) shl 8)))

        println(0xff)

        println("5: " + (5 shl 8))
        println("6: " + (6 shl 8))
        println("7: " + (7 shl 8))
        println("8: " + (8 shl 8))
        println("49: " + (49 shl 8))

    }

}