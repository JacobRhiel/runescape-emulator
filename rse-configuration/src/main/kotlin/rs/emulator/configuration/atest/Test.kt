@file:Suppress("UnstableApiUsage")

package rs.emulator.configuration.atest

import com.google.inject.*
import rs.emulator.configuration.environment.RSEEnvironment

/**
 *
 * @author Chk
 */
class Test @Inject constructor()
{

    private lateinit var injector: Injector

    @Inject private lateinit var environment: RSEEnvironment

    fun start()
    {

        val value = environment.fetchValue("revision", 69)

        println(value)

        val value1 = environment.fetchValue<Int>("rev")

        println(value1)

    }

    companion object
    {

        @JvmStatic
        fun main(args: Array<String>)
        {

            val test = Test()

            test.injector = Guice.createInjector(TestModule())

            test.injector.getInstance(Test::class.java).start()

        }

    }

}