package rs.emulator.encryption.xtea

import com.google.gson.Gson
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
import mu.KLogging
import rs.emulator.utilities.logger
import java.io.FileNotFoundException
import java.nio.file.*

/**
 * A [Service] that loads and exposes XTEA keys required for map decryption.
 *
 * @author Tom <rspsmods@gmail.com>
 */
class XteaKeyService
{

    private val keys = Int2ObjectOpenHashMap<IntArray>()

    val validRegions: IntArray
        get() = keys.keys.toIntArray()

    init
    {

        val path = Paths.get("./data/xteas/")

        if (!Files.exists(path)) {
            throw FileNotFoundException("Path does not exist. $path")
        }

        val singleFile = path.resolve("xteas.json")

        if (Files.exists(singleFile))
            loadSingleFile(singleFile)

        loadKeys()
    }

    fun get(region: Int): IntArray {
        if (keys[region] == null) {
            logger().trace { "No XTEA keys found for region $region." }
            keys[region] = EMPTY_KEYS
        }
        return keys[region]!!
    }

    private fun loadKeys() {
        /*
         * Get the total amount of valid regions and which keys we are missing.
         */
        val maxRegions = Short.MAX_VALUE
        var totalRegions = 0
        val missingKeys = mutableListOf<Int>()

       /* val regionIndex = world.filestore.getIndex(IndexType.MAPS)
        for (regionId in 0 until maxRegions) {
            val x = regionId shr 8
            val z = regionId and 0xFF

            *//*
             * Check if the region corresponding to the x and z can be
             * found in our cache.
             *//*
            regionIndex.findArchiveByName("m${x}_$z") ?: continue
            regionIndex.findArchiveByName("l${x}_$z") ?: continue

            *//*
             * The region was found in the regionIndex.
             *//*
            totalRegions++

            *//*
             * If the XTEA is not found in our xteaService, we know the keys
             * are missing.
             *//*
            if (get(regionId).contentEquals(EMPTY_KEYS)) {
                missingKeys.add(regionId)
            }
        }*/

        val validKeys = totalRegions - missingKeys.size
        logger().info("loaded {} xtea keys.", keys.size)
        //logger.info("Loaded {} / {} ({}%) XTEA keys.", validKeys, totalRegions,
              //  String.format("%.2f", (validKeys.toDouble() * 100.0) / totalRegions.toDouble()))
    }

    private fun loadSingleFile(path: Path) {
        val reader = Files.newBufferedReader(path)
        val xteas = Gson().fromJson(reader, Array<XteaFile>::class.java)
        reader.close()
        xteas?.forEach { xtea ->
            keys[xtea.mapsquare] = xtea.key
        }
    }

    private data class XteaFile(val mapsquare: Int, val key: IntArray) {

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as XteaFile

            if (mapsquare != other.mapsquare) return false
            if (!key.contentEquals(other.key)) return false

            return true
        }
        override fun hashCode(): Int {
            var result = mapsquare
            result = 31 * result + key.contentHashCode()
            return result
        }
    }

    companion object
    {
        val EMPTY_KEYS = intArrayOf(0, 0, 0, 0)
    }
}
