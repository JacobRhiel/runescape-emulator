package rs.emulator.tools.osrsbox.index

import com.google.gson.Gson
import com.google.inject.Guice
import com.google.inject.Inject
import com.google.inject.Injector
import com.google.inject.Singleton
import rs.emulator.cache.FileStore
import rs.emulator.cache.definition.entity.obj.meta.ObjMetaDataDefinition
import rs.emulator.configuration.environment.RSEEnvironment
import rs.emulator.utilities.injector.injector

/**
 *
 * @author Chk
 */
@Singleton
class OSRSBoxItemMetaDataPacker @Inject constructor()
{

    private lateinit var injector: Injector

    @Inject lateinit var environment: RSEEnvironment

    @Inject
    private lateinit var fileStore: FileStore

    fun start()
    {

        val start = System.currentTimeMillis()

        fileStore.init()

/*        val entry = fileStore.fetchArchiveFile(21, 10, 4151)

        println(String(entry.contents))

        val def = Gson().fromJson(String(entry.contents), ObjMetaDataDefinition::class.java)

        //val def: ObjMetaDataDefinition = definition().find(4151)

        println(def.examine)

        fileStore.close()*/


/*        val idx1 = fileStore.getOrCreateIndex(21)

        idx1.compressionType = CompressionType.GZIP

        val archive1 = idx1.getOrCreateArchive(10)

        archive1.compressionType = CompressionType.GZIP

        val entry = fileStore.fetchArchiveFile(IndexConfig.CONFIGS.identifier, ArchiveConfig.OBJ.identifier, 1038)

        val a = fileStore.fetchArchiveFile(IndexConfig.CONFIGS.identifier, ArchiveConfig.OBJ.identifier, 1040)

        val whip = fileStore.fetchArchiveFile(IndexConfig.CONFIGS.identifier, ArchiveConfig.OBJ.identifier, 4151)

        val entry1 = archive1.getOrCreateEntry(1038)

        val entry2 = archive1.getOrCreateEntry(1040)

        val entry3 = archive1.getOrCreateEntry(1041)

        val entry4 = archive1.getOrCreateEntry(1042)

        entry1.contents = entry.contents

        entry3.contents = entry.contents

        entry4.contents = entry.contents

        //archive1.save()

        val whipEntry = archive1.getOrCreateEntry(4151)

        println("whip: " + whip.contents.toTypedArray().contentDeepToString())
        whipEntry.contents = whip.contents

        entry2.contents = a.contents

        archive1.save()

        //archive1.save()

        idx1.save()

        fileStore.close()*/

        //val def: ObjDefinition = definition().find(1042)

        val data = fileStore.fetchArchiveFile(21, 10, 4151)

        val json = String(data.contents)

        //println(def.name)

        val meta = Gson().fromJson(json, ObjMetaDataDefinition::class.java)

        println("${meta.examine} - ${meta.buy_limit} - ${meta.equipment?.slot}")

        fileStore.close()

/*        val idx = fileStore.getOrCreateIndex(IndexConfig.META_DATA)

        idx.compressionType = CompressionType.GZIP

        val archive = idx.getOrCreateArchive(ArchiveConfig.OBJ)

        archive.compressionType = CompressionType.GZIP

        for(i in 0 .. 1052)
        {

            val gatherEntry = fileStore.fetchArchiveFile(IndexConfig.CONFIGS.identifier, ArchiveConfig.OBJ.identifier, i)

            val entry = archive.getOrCreateEntry(i)

            entry.contents = gatherEntry.contents

        }

        archive.save()

        idx.save()

        fileStore.close()*/

/*        val gson = Gson()

        val map = gson.fromJson<Map<Int, ObjMetaDataDefinition>>(FileReader(File("D:\\RuneScape\\Private Servers\\Junk\\runescape-emulator\\rse-tools\\src\\main\\resources\\items-complete.json")), object : TypeToken<Map<Int, ObjMetaDataDefinition>>(){}.type)

        val idx = fileStore.getOrCreateIndex(IndexConfig.META_DATA)

        idx.compressionType = CompressionType.GZIP

        val archive = idx.getOrCreateArchive(ArchiveConfig.OBJ)

        archive.compressionType = CompressionType.GZIP

        map.forEach { index, it ->

            if(index < 4150 || index > 4175) return@forEach

            val entry = archive.getOrCreateEntry(index)

            entry.contents = gson.toJson(it).toByteArray()

        }

        archive.save()

        idx.save()

        fileStore.close()

        val end = System.currentTimeMillis()

        println("" + (end - start) + "ms." )*/

    }

    companion object
    {

        @JvmStatic
        fun main(args: Array<String>)
        {

            val rse = OSRSBoxItemMetaDataPacker()

            rse.injector = Guice.createInjector()

            injector = rse.injector

            rse.injector.getInstance(OSRSBoxItemMetaDataPacker::class.java).start()

        }

    }

}