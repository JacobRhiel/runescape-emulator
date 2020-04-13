package rs.emulator

import rs.emulator.cache.FileStore
import rs.emulator.utilities.injector.injector

/**
 *
 * @author Chk
 */
val fileStore = injector.getInstance(FileStore::class.java)