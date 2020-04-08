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

        for(i in 0 until 1000)
        {
            val a = Integer.decode("0x$i")
            println("$i : $a")
        }

    }

}