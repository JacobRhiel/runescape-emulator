package rs.emulator.cache.index.archive

import rs.emulator.cache.index.archive.entry.ArchiveEntry
import java.util.*

/**
 *
 * @author Chk
 */
class ArchiveTable
{

    var entryCount = 0

    var lastEntryId = 0

    var entries: SortedMap<Int, ArchiveEntry> = TreeMap()

}