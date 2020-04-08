package rs.emulator.cache.reference

import com.google.inject.Inject
import com.google.inject.Singleton
import rs.emulator.configuration.CacheConfiguration
import rs.emulator.cache.index.IndexFile
import rs.emulator.cache.index.archive.entry.EntryData
import java.io.File

/**
 *
 * @author Chk
 */
@Singleton class ReferenceTable @Inject constructor(configuration: CacheConfiguration)
    : IndexFile(255, configuration.defaultDirectory().resolve("main_file_cache.idx255").toFile())
{

    fun readIndex(index: IndexFile): EntryData
    {

        val identifier = index.identifier

        return readEntry(identifier)

    }

    fun getIndexCount(): Int = (idx.length() / 6).toInt()

}