package rs.emulator.utilities.logger

import mu.KLogger
import mu.KotlinLogging

fun <T> log(clazz: Class<T>): KLogger
{
    return KotlinLogging.logger(clazz.simpleName)
}

fun Any.info(info: String)
{
    return KotlinLogging.logger(this.javaClass.simpleName).info(info)
}

fun Any.warn(warn: String)
{
    return KotlinLogging.logger(this.javaClass.simpleName).warn(warn)
}