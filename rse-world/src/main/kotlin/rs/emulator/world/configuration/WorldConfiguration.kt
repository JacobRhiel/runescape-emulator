package rs.emulator.world.configuration

import com.google.inject.Inject
import com.google.inject.Singleton
import rs.emulator.configuration.YamlConfiguration
import rs.emulator.configuration.environment.RSEEnvironment
import rs.emulator.encryption.rsa.service.RSAService
import java.nio.file.Path

/**
 *
 * @author Chk
 */
@Singleton class WorldConfiguration @Inject constructor(environment: RSEEnvironment)
    : YamlConfiguration("world_configuration", environment)
{

    @Inject private lateinit var rsaService: RSAService

    fun fetchModulus() = rsaService.modulus

    fun fetchExponent() = rsaService.exponent

    override fun defaultDirectory(): Path = reference.defaultDirectory().resolve("world")//todo world id conf?

}