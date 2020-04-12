package rs.emulator.world.map

import com.github.benmanes.caffeine.cache.Cache
import com.github.benmanes.caffeine.cache.Caffeine
import com.google.inject.Inject
import com.google.inject.Singleton
import it.unimi.dsi.fastutil.objects.*
import rs.emulator.cache.FileStore
import rs.emulator.cache.definition.DefinitionRepository
import rs.emulator.cache.definition.definition
import rs.emulator.cache.definition.region.landscape.LandscapeDefinition
import rs.emulator.cache.definition.region.mapscape.MapScapeDefinition
import rs.emulator.cache.index.IndexConfig
import rs.emulator.world.map.region.Region
import rs.emulator.world.map.region.chunk.LocalCoordinate
import rs.emulator.world.map.region.coordinate.Coordinate
import java.util.concurrent.TimeUnit

/**
 *
 * @author Chk
 */
@Singleton class WorldMap @Inject constructor(fileStore: FileStore)
{

    companion object
    {

        var INSTANCE: WorldMap? = null

    }

    private val regionCache: Cache<Int, Object2ObjectOpenHashMap<Region, HashMap<MapScapeDefinition, LandscapeDefinition>>> = Caffeine.newBuilder()
        .maximumSize(/*fileStore.fetchIndex(IndexConfig.MAPS.identifier).indexTable.archiveCount.toLong()*/15000)//todo size
        .expireAfterAccess(2, TimeUnit.MINUTES)
        .recordStats()
        .build()

    fun findAndLoadRegion(id: Int) = findRegion(id).apply { this.load() }

    fun findRegion(id: Int) = findRegion(coordinate = LocalCoordinate(((id shr 8) and 0xFF) shl 6, (id and 0xFF shl 6), 1))

    fun <T : Coordinate> findAndLoadRegion(coordinate: T) : Region = findRegion(coordinate).apply { this.load() }

    fun <T : Coordinate> findRegion(coordinate: T) : Region
    {

        val regionId = coordinate.x shl 8 and coordinate.z

        var region = regionCache.getIfPresent(regionId)?.keys?.find { it.id == regionId }

        if(region == null)
            region = submitRegion(Region(regionId))

        return region

    }

    private fun submitRegion(region: Region): Region
    {

        val definitions = HashMap<MapScapeDefinition, LandscapeDefinition>()

        val mapScapeDefinition: MapScapeDefinition = definition().find(region.id)

        val landscapeDefinition: LandscapeDefinition = definition().find(region.id)

        definitions[mapScapeDefinition] = landscapeDefinition

        val regionDefinitions = Object2ObjectOpenHashMap<Region, HashMap<MapScapeDefinition, LandscapeDefinition>>()

        regionDefinitions[region] = definitions

        regionCache.put(region.id, regionDefinitions)

        return region.apply { this.mapScapeDefinition = mapScapeDefinition }.apply { this.landscapeDefinition = landscapeDefinition }

    }

}