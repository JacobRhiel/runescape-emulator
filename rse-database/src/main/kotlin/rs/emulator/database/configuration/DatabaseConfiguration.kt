package rs.emulator.database.configuration

import com.google.inject.Inject
import com.google.inject.Singleton
import rs.emulator.configuration.YamlConfiguration
import rs.emulator.configuration.environment.RSEEnvironment
import java.nio.file.Path

/**
 *
 * @author Chk
 */
@Singleton class DatabaseConfiguration @Inject constructor(environment: RSEEnvironment)
    : YamlConfiguration("database_configuration", environment)
{

    override fun defaultDirectory(): Path = reference.defaultDirectory().resolve("database")

}