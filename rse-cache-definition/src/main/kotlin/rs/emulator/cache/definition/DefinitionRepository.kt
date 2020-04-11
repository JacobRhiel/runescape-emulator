package rs.emulator.cache.definition

import com.github.benmanes.caffeine.cache.Cache
import com.github.benmanes.caffeine.cache.Caffeine
import com.google.inject.Inject
import com.google.inject.Singleton
import io.netty.buffer.Unpooled
import rs.emulator.buffer.BufferedReader
import rs.emulator.cache.FileStore
import rs.emulator.cache.definition.region.landscape.LandscapeDefinition
import rs.emulator.cache.definition.region.mapscape.MapScapeDefinition
import rs.emulator.cache.index.IndexConfig
import rs.emulator.cache.index.archive.ArchiveConfig
import rs.emulator.cache.index.archive.ArchiveFile
import rs.emulator.cache.index.archive.entry.ArchiveEntry
import java.util.concurrent.TimeUnit

/**
 *
 * @author Chk
 */
@Singleton class DefinitionRepository @Inject constructor()
{

    @Inject
    private lateinit var fileStore: FileStore

    companion object
    {

        var INSTANCE: DefinitionRepository? = null

    }

    private val definitionCache: Cache<Class<Definition>, HashMap<Int, Definition>> = Caffeine.newBuilder()
        .maximumSize(0xFFFF) //65535 default maximum size of any entry.
        .expireAfterAccess(2, TimeUnit.MINUTES)
        .recordStats()
        .build()

    private fun submitType(clazz: Class<Definition>) = definitionCache.put(clazz, hashMapOf())

    fun <T : Definition> find(clazz: Class<out T>, identifier: Int): T? = find(clazz, identifier, -1)

    fun <T : Definition> find(clazz: Class<out T>, identifier: Int, child: Int): T?
    {

        val definition = clazz.getDeclaredConstructor(Int::class.java).newInstance(identifier)

        val reader = when
        {
            definition.archiveName != null -> BufferedReader(fileStore.fetchArchiveFileByName(definition.indexConfig.identifier, definition.archiveName!!).contents)
            else                           -> BufferedReader(fileStore.fetchArchiveFile(definition.indexConfig.identifier, if(child == -1) definition.archive else identifier, if(child == -1) identifier else child).contents)
        }

        definition.decodeHeader(reader)

        submitEntry(definition)

        val definitions = definitionCache.getIfPresent(clazz)!!

        return definitions[identifier] as T?

    }

    fun submitEntry(definition: Definition)
    {

        var cache = definitionCache.getIfPresent(definition.javaClass)

        if (cache == null)
            submitType(definition.javaClass)

        cache = definitionCache.getIfPresent(definition.javaClass)!!

        cache[definition.identifier] = definition

    }

    fun expireCacheFor(definition: Definition)
    {

        definitionCache.cleanUp()

        definitionCache.invalidate(definition)

    }

    fun expireCache()
    {

        definitionCache.cleanUp()

        definitionCache.invalidateAll()

    }

}