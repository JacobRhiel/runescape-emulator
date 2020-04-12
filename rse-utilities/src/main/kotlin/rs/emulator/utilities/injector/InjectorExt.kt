package rs.emulator.utilities.injector

import com.google.inject.Injector

/**
 *
 * @author Chk
 */

lateinit var injector: Injector

fun EmittedInject.injectedInstanceOf(clazz: Class<*>) = injector.getInstance(clazz)