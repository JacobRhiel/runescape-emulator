package rs.emulator.cache.index.archive

import rs.emulator.cache.index.archive.entry.ArchiveEntry

/**
 *
 * @author Chk
 */
class ArchiveTable
{

    var entryCount = 0

    var lastEntryId = 0

    var entries = emptyArray<ArchiveEntry?>()

}