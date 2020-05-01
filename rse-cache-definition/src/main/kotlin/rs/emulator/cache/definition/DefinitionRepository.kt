package rs.emulator.cache.definition

import com.github.benmanes.caffeine.cache.Cache
import com.github.benmanes.caffeine.cache.Caffeine
import com.google.inject.Inject
import com.google.inject.Singleton
import rs.emulator.buffer.BufferedReader
import rs.emulator.cache.FileStore
import rs.emulator.cache.definition.entity.loc.LocDefinitionGenerator
import rs.emulator.cache.definition.entity.npc.NpcDefinitionGenerator
import rs.emulator.cache.definition.entity.obj.ObjDefinitionGenerator
import rs.emulator.cache.definition.entity.obj.meta.ObjMetaDataDefinitionGenerator
import rs.emulator.cache.definition.generator.DefinitionGenerator
import rs.emulator.cache.definition.region.landscape.LandscapeDefinitionGenerator
import rs.emulator.cache.definition.region.mapscape.MapScapeDefinitionGenerator
import rs.emulator.cache.definition.varp.bit.VarBitDefinitionGenerator
import rs.emulator.cache.definition.varp.player.VarPlayerDefinitionGenerator
import rs.emulator.cache.definition.widget.WidgetDefinitionGenerator
import rs.emulator.cache.definition.widget.inv.InvDefinitionGenerator
import rs.emulator.cache.definition.widget.param.ParamDefinitionGenerator
import java.util.concurrent.TimeUnit

/**
 *
 * @author Chk
 */
@Singleton class DefinitionRepository @Inject constructor()
{

    @PublishedApi @Inject internal lateinit var fileStore: FileStore

    @PublishedApi
    internal val generators = listOf(
        ObjDefinitionGenerator(),
        ObjMetaDataDefinitionGenerator(),
        NpcDefinitionGenerator(),
        LocDefinitionGenerator(),
        VarBitDefinitionGenerator(),
        VarPlayerDefinitionGenerator(),
        LandscapeDefinitionGenerator(),
        MapScapeDefinitionGenerator(),
        InvDefinitionGenerator(),
        ParamDefinitionGenerator(),
        WidgetDefinitionGenerator()
    )

    @PublishedApi internal val definitionCache: Cache<Class<Definition>, HashMap<Int, Definition>> = Caffeine.newBuilder()
        .maximumSize(0xFFFF) //65535 default maximum size of any entry.
        .expireAfterAccess(2, TimeUnit.MINUTES)
        .recordStats()
        .build()

    private fun submitType(clazz: Class<Definition>) = definitionCache.put(clazz, hashMapOf())

    inline fun <reified T : Definition> find(identifier: Int): T = find(identifier, -1)

    inline fun <reified T : Definition> find(identifier: Int, child: Int): T
    {

        val generator = generators.firstOrNull { it.definitionClass == T::class.java }
            ?: throw Error("No generator found for definition type: ${T::class.simpleName}.")

        val shiftedId = generator.shiftedId

        val hasShiftedId = shiftedId != -1

        val reader = when
        {
            generator.namedArchive ->
            {
                val archiveName = generator.generateArchiveName(identifier)
                BufferedReader(fileStore.fetchArchiveFileByName(generator.indexConfig.identifier, archiveName).contents)
            }
            else                           ->
            {
                BufferedReader(fileStore.fetchArchiveFile(generator.indexConfig.identifier,
                                                          if(child == -1)
                                                              if(generator.archive == -1) identifier else generator.archive
                                                          else if(hasShiftedId) shiftedId else identifier,
                                                          if(child == -1)
                                                              if(hasShiftedId) shiftedId else identifier else child).contents)
            }
        }

        val definition = generator.decodeHeader(identifier, reader)

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

        cache[definition.id] = definition

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