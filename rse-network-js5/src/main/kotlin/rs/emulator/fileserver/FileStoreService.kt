@file:Suppress("UnstableApiUsage")

package rs.emulator.fileserver

import com.google.common.util.concurrent.AbstractIdleService
import com.google.inject.Inject
import com.google.inject.Singleton
import rs.emulator.cache.FileStore

/**
 *
 * @author Chk
 */
@Singleton class FileStoreService @Inject constructor()
    : AbstractIdleService()
{

    @Inject private lateinit var fileStore: FileStore

    override fun startUp()
    {

        fileStore.init()

        store = fileStore

    }

    override fun shutDown()
    {

        //fileStore.close()

    }

    companion object
    {

        lateinit var store: FileStore

    }

}