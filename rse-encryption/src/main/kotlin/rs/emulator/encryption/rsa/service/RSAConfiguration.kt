package rs.emulator.encryption.rsa.service

import com.google.inject.Inject
import com.google.inject.Singleton
import rs.emulator.configuration.YamlConfiguration
import rs.emulator.configuration.environment.RSEEnvironment
import java.nio.file.Path

/**
 *
 * @author Chk
 */
@Singleton class RSAConfiguration @Inject constructor(environment: RSEEnvironment)
    : YamlConfiguration("rsa_configuration", environment)
{

    fun fetchConfigurationByWorld(worldId: Int): Path = defaultDirectory().resolve("world$worldId")

    override fun defaultDirectory(): Path = reference.defaultDirectory().resolve("rsa")

}