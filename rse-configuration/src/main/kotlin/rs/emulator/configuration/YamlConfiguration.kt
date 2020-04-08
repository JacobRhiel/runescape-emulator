package rs.emulator.configuration

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.ObjectNode
import com.google.inject.Inject
import rs.emulator.utilities.logger
import java.io.FileOutputStream
import java.nio.file.Path
import java.util.*
import kotlin.collections.HashMap

/**
 * Constructs a new [YamlConfiguration] for parsing and updating specific configuration files.
 * @author Chk
 */
abstract class YamlConfiguration
    : ConfigurationResource
{

    /**
     * Key -> Value mapping of all currently loaded [JsonNode]s.
     */
    protected val keyValueMap = HashMap<String, Any>()


    /**
     * Required for generic referencing and casting purposes.
     * Kotlin requires a 'public' copied version of a variable to be used with reified
     * generics.
     */
    @PublishedApi internal val `access$keyValueMap`: HashMap<String, Any>
        get() = keyValueMap

    /**
     * Configuration file, we ignore this for Jackson loading as it isn't crucial to the configuration.
     */
    @JsonIgnore private val configuration: String

    /**
     * The extension files [Path], we ignore this for Jackson loading as it isn't crucial to the configuration.
     */
    @JsonIgnore private val extension: Path

    /**
     * The reference [YamlConfiguration], we ignore this for Jackson loading as it isn't crucial to the configuration.
     */
    @JsonIgnore protected lateinit var reference: YamlConfiguration

    /**
     * Use only the configuration value, this will generate the use of the default resource by default.
     * @param configuration - The configuration name.
     */
    @Inject constructor(configuration: String) : this(configuration, null)

    /**
     * Applies the configuration name as well as the extension path if passed or the [defaultDirectory] if not.
     * @param configuration - The name of the configuration.
     * @param extension - The extension of the path, IE: defaultDirectory().resolve(otherPathParams), can be null by default.
     */
    @Inject constructor(configuration: String, extension: Path?)
    {
        this.configuration = configuration
        this.extension = extension ?: this.defaultDirectory()
        associateValues()
    }

    /**
     * Applies the configuration from another [YamlConfiguration] as it's reference, this provides access directly to another
     * configuration file without the need to try and pass it another way.
     * @param configuration - The name of the configuration.
     * @param reference - The reference [YamlConfiguration] file.
     */
    @Inject constructor(configuration: String, reference: YamlConfiguration)
    {
        this.configuration = configuration
        this.extension = reference.defaultDirectory()
        this.reference = reference
        associateValues()
    }

    /**
     * Overrides a saved resource.
     * @param replace - Replaces the saved resource otherwise ignore. (Programmatic error can occur).
     */
    fun saveResource(replace: Boolean) = super.saveResource(configuration, replace)

    /**
     * Associates the values of the configuration ".yml" file.
     * A.K.A, maps the key to value in a locally stored map.
     */
    private fun associateValues()
    {

        val resource = getResource(configuration) ?: return

        val node = mapper.readTree(resource)

        node.fieldNames().forEach { field -> keyValueMap.putIfAbsent(field, node.get(field)) }

        //Save the default resource if it doesn't exist, this should only occur if it gets corrupted or just does
        //not exist in the [defaultDirectory]
        saveDefaultResource(configuration)

    }

    /**
     * Fetches a value [JsonNode] based on its key.
     * @param key - The key of the [JsonNode].
     * @return The [JsonNode] if it exists, otherwise send error of non-existence.
     */
    fun fetchValue(key: String): JsonNode?
    {

        val value = keyValueMap[key]

        if(keyValueMap.isNotEmpty() && value == null)
            logger().error("There is no valid value for key: $key.")

        return mapper.convertValue(value, JsonNode::class.java)

    }

    /**
     * Fetches a [key] based value from the [keyValueMap] and takes the generic
     * [T] as a default argument as well as the Object value of the returned key value.
     * @param key - The key of the value to find.
     * @param default - The default if no key has been found.
     * @return T - The type of the fetched value.
     */
    inline fun <reified T : Any> fetchValue(key: String, default: T) : T
    {
        return if(`access$keyValueMap`.containsKey(key))
            mapper.convertValue(`access$keyValueMap`[key], T::class.java) as T
        else
            mapper.convertValue(default, T::class.java) as T
    }

    /**
     * Fetches a [key] based value from the [keyValueMap] and takes the generic
     * [T] as a default argument.
     * @param key - The key of the value to find.
     * @return T - The type of the fetched value.
     */
    inline fun <reified T : Any> fetchValue(key: String) : T?  = `access$keyValueMap`[key] as? T

    /**
     * Sets a value [JsonNode] to it's associated key.
     * @param key - The key to apply to
     * @param value - The value to apply to the [JsonNode].
     */
    fun setValue(key: String, value: Any)
    {

        val node = mapper.createObjectNode()

        node.set<JsonNode>(key, mapper.convertValue(value, JsonNode::class.java))

        keyValueMap[key] = node

    }

    /**
     * Writes the [keyValueMap] as a [Properties] for use in requested applications,
     * this was mainly written for HikariCP integration.
     * If pojo operations or a custom schema would be needed, use [propertiesMapper] as a default
     * reference.
     * Reference page: https://github.com/FasterXML/jackson-dataformats-text/tree/master/properties#customizing-handling-with-javapropsschema
     */
    fun fetchProperties() : Properties = propertiesMapper.writeValueAsProperties(keyValueMap)

    /**
     * Saves any updates directly applied to our local map [keyValueMap].
     */
    fun saveUpdates()
    {

        val node = mapper.readTree(getResource(configuration)) as ObjectNode

        keyValueMap.forEach { (key, value) ->

            val valueNode = mapper.createObjectNode()

            valueNode.set<JsonNode>(key, mapper.convertValue(value, JsonNode::class.java))

            node.set<ObjectNode>(key, if(valueNode.isArray) valueNode else (value as ArrayNode)[key])

        }

        val configurationDir = defaultDirectory()

        if(!configurationDir.toFile().exists())
            configurationDir.toFile().mkdirs()

        mapper.writerWithDefaultPrettyPrinter().writeValue(FileOutputStream(configurationDir
                                                                                .resolve("$configuration.yml")
                                                                                .toFile()), node)

    }

}