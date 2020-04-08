@file:Suppress("UnstableApiUsage")

package rs.emulator.configuration

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator
import rs.emulator.utilities.logger
import java.io.*
import java.net.URLConnection
import java.nio.file.Files

import java.nio.file.Path

/**
 * Creates a "resource" mainly for resource access and usage of this specific configuration type.
 * Classes that inherit this interface will be structured specifically around the usage of local resources,
 * intended for in-jar storage to be transferred to another directory upon usage and/or being written too.
 * @author Chk
 */
interface ConfigurationResource
{

    /**
     * [YAMLFactory] that is constructed specifically for writing cleanliness and human readability.
     * @see YAMLGenerator.Feature for descriptions of each feature.
     */
    val factory: YAMLFactory
        get() = YAMLFactory()
            .disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER)
            .enable(YAMLGenerator.Feature.INDENT_ARRAYS)

    /**
     * [ObjectMapper] for mapping of our bound [YAMLFactory].
     */
    val mapper: ObjectMapper
        get() = ObjectMapper(factory)

    /**
     * [JavaPropsMapper] with default [JavaPropsFactory] bindings for .yml -> .properties conversion.
     */
    val propertiesMapper: JavaPropsMapper
        get() = JavaPropsMapper()

    /**
     * Constructs a default directory for the specified configuration, this is NOT the resource location,
     * but where the output file should end up.
     */
    fun defaultDirectory() : Path

    /**
     * Attempts to locate the resource that is shipped with this library or any implementing source's jar
     * or resource location, this is resource usage specific, there is no plan to add support for custom directory folders.
     */
    private fun fetchDefaultDirectoryResource(fileName: String): File?
    {

        return defaultDirectory()
            .toFile()
            .walkTopDown()
            .filter { it.name == fileName }
            .firstOrNull()

    }

    private fun checkForUpdatedDefaultResource(fileName: String)
    {

        

    }

    /**
     * Gathers the resources' [InputStream] based on the [configuration] name.
     * @param configuration - The name value in simplistic form, this format is only supporting YAML.
     * @return [InputStream] the input stream of the read resource file, by default it will use the file found in
     * resources, however after a new one has been created for dynamic purposes within the @see [defaultDirectory],
     * the file will then attempt to be parsed from that location directly.
     */
    fun getResource(configuration: String): InputStream?
    {

        val name = "$configuration.yml"

        val defaultResource = fetchDefaultDirectoryResource(name)
            ?: try
            {

                val url = this.javaClass.classLoader.getResource(name)

                if (url == null)
                {

                    logger().error("Resource: $name does not exist on classPath.")

                    return null

                }
                else
                {

                    val connection: URLConnection = url.openConnection()

                    connection.useCaches = false

                    return connection.getInputStream()

                }
            }
            catch (ex: IOException)
            {
                return null
            }

        return defaultResource.inputStream()

    }

    /**
     * Saves the default resource if it has not already been saved by default.
     * This utilizes the resources' version of the file as default, and will then on
     * load this over the default resource file.
     * @param configuration - The name of the configuration file.
     */
    fun saveDefaultResource(configuration: String)
    {

        val defaultDirFile = defaultDirectory().toFile()

        val configurationName = "$configuration.yml"

        requireNotNull(defaultDirFile) { "Configuration Resource must have a data folder attached." }

        val outFile = File(defaultDirFile, configurationName)

        if(outFile.exists())
            return

        if (!defaultDirFile.exists())
            defaultDirFile.mkdirs()

        try
        {

            val stream = getResource(configuration)

            if (!outFile.exists())
                Files.copy(stream, outFile.toPath())

        }
        catch (ex: IOException)
        {
            logger().warn("Could not save " + outFile.name + " to " + outFile, ex)
        }

        logger().info("Successfully saved resource {} to {}.", configurationName, outFile.absolutePath)

    }

    /**
     * Saves a resource dependent on several factors:
     * Factor A.) being that the resource exists, otherwise it is programmatic error.
     * Factor B.) being that our [defaultDirectory] actually has a path, otherwise also being programmatic error.
     * If neither can proceed, an error will be thrown for each specific occurrence.
     */
    fun saveResource(
            path: String,
            replace: Boolean
    )
    {

        var resourcePath = path

        val defaultDirFile = defaultDirectory().toFile()

        requireNotNull(defaultDirFile) { "Configuration Resource must have a data folder attached." }

        require(resourcePath != "") { "ResourcePath cannot be null or empty" }

        resourcePath = resourcePath.replace('\\', '/')

        val stream = getResource(resourcePath) ?: throw IllegalArgumentException("The embedded resource '$resourcePath' cannot be found in $defaultDirFile")

        val outFile = File(defaultDirFile, "$resourcePath.yml")

        val lastIndex = resourcePath.lastIndexOf('/')

        var outDir = File(defaultDirFile, resourcePath.substring(0, if (lastIndex >= 0) lastIndex else 0))

        if (!outDir.exists())
            outDir.mkdirs()

        try
        {

            if (!outFile.exists() || replace)
                Files.copy(stream, outFile.toPath())
            else
                logger().info("Did not save " + outFile.name + " to " + outFile + " because " + outFile.name + " already exists.")

        }
        catch (ex: IOException)
        {
            logger().warn("Could not save " + outFile.name + " to " + outFile, ex)
        }

        logger().info("Successfully saved resource {} to {}.", resourcePath, outFile.absolutePath)

    }

}