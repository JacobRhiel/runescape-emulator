package rs.emulator.cache.reference

import com.google.inject.Inject
import com.google.inject.Singleton
import rs.emulator.cache.index.IndexFile
import rs.emulator.cache.index.archive.entry.EntryData
import java.io.File
import java.nio.file.Paths

/**
 *
 * @author Chk
 */
@Singleton class ReferenceTable @Inject constructor()
    : IndexFile(255, Paths.get("./data/cache").resolve("main_file_cache.idx255").toFile())
{

    fun readIndex(index: IndexFile): EntryData
    {

        val identifier = index.identifier

        return readEntry(identifier)

    }

    fun getIndexCount(): Int = (idx.length() / 6).toInt()

}