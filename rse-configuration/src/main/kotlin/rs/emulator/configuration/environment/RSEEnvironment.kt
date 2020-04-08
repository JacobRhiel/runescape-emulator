package rs.emulator.configuration.environment

import com.google.inject.Inject
import com.google.inject.Singleton
import rs.emulator.configuration.YamlConfiguration
import rs.emulator.configuration.node.formattedTextValue
import rs.emulator.configuration.utilities.StringUtil
import java.nio.file.Path
import java.nio.file.Paths

/**
 * Represents our default environment for the applied project that this library has been built for: runescape-emulator.
 */
@Singleton class RSEEnvironment @Inject constructor()
    : YamlConfiguration("env-configuration")
{

    /**
     * Default directory, here we read the values of our .yml [YamlConfiguration] file.
     * Using the extension [JsonNodeExt], substitution values are to be applied to the unformatted string read from the configuration.
     */
    override fun defaultDirectory(): Path
    {

        val substitutions = mutableMapOf<String, String>()

        substitutions["user.home"] = System.getProperty("user.home")

        val directory = StringUtil.expand(fetchValue("default_directory", "./default/"), substitutions.toMap())

        return Paths.get("$directory")

    }

}