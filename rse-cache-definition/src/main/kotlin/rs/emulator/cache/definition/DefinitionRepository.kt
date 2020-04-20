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

    @PublishedApi @Inject internal lateinit var fileStore: FileStore

    @PublishedApi internal val definitionCache: Cache<Class<Definition>, HashMap<Int, Definition>> = Caffeine.newBuilder()
        .maximumSize(0xFFFF) //65535 default maximum size of any entry.
        .expireAfterAccess(2, TimeUnit.MINUTES)
        .recordStats()
        .build()

    private fun submitType(clazz: Class<Definition>) = definitionCache.put(clazz, hashMapOf())

    inline fun <reified T : Definition> find(identifier: Int): T = find(identifier, -1)

    inline fun <reified T : Definition> find(identifier: Int, child: Int): T
    {

        val definition = T::class.java.getDeclaredConstructor(Int::class.java).newInstance(identifier)

        val shiftedId = definition.shiftedId

        val hasShiftedId = shiftedId != -1

        val reader = when
        {
            definition.archiveName != null -> BufferedReader(fileStore.fetchArchiveFileByName(definition.indexConfig.identifier, definition.archiveName!!).contents)
            else                           -> BufferedReader(fileStore.fetchArchiveFile(definition.indexConfig.identifier,
                                                                                        if(child == -1) definition.archive else if(hasShiftedId) shiftedId else identifier,
                                                                                        if(child == -1) if(hasShiftedId) shiftedId else identifier else child).contents)
        }

        definition.decodeHeader(reader)

        submitEntry(definition)

        val definitions = definitionCache.getIfPresent(T::class.java)!!

        return definitions[identifier] as T

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