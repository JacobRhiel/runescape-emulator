@file:Suppress("UnstableApiUsage")

package rs.emulator.fileserver

import com.google.common.util.concurrent.AbstractIdleService
import com.google.inject.Inject
import com.google.inject.Singleton
import net.runelite.cache.fs.Store
import java.io.File

/**
 *
 * @author Chk
 */
@Singleton class FileStoreService @Inject constructor()
    : AbstractIdleService()
{

    private val fileStore = Store(File("./data/cache/"))

    override fun startUp()
    {

        fileStore.load()

        store = fileStore

    }

    override fun shutDown()
    {

        //fileStore.close()

    }

    companion object
    {

        lateinit var store: Store

    }

}