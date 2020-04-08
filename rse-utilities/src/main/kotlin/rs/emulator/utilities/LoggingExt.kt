package rs.emulator.utilities

import mu.KLogger
import mu.KotlinLogging

fun Any.logger(): KLogger = KotlinLogging.logger(javaClass.simpleName)