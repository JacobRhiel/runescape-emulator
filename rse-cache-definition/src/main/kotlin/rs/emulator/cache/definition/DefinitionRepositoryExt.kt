package rs.emulator.cache.definition

import rs.emulator.utilities.injector.injector

/**
 *
 * @author Chk
 */
fun definition(): DefinitionRepository = injector.getInstance(DefinitionRepository::class.java)