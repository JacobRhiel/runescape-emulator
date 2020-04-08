package rs.emulator.configuration

import com.google.inject.*
import rs.emulator.configuration.YamlConfiguration
import rs.emulator.configuration.environment.RSEEnvironment
import java.nio.file.Path

/**
 *
 * @author Chk
 */
@Singleton class CacheConfiguration @Inject constructor(environment: RSEEnvironment)
    : YamlConfiguration("cache-configuration", environment)
{

    override fun defaultDirectory(): Path = reference.defaultDirectory().resolve("cache")

}