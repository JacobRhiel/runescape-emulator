@file:Suppress("UnstableApiUsage")

package rs.emulator.database.service

import com.google.common.util.concurrent.AbstractIdleService
import com.google.inject.Inject
import com.google.inject.Singleton
import io.github.classgraph.ClassGraph
import org.hibernate.cfg.Configuration
import rs.emulator.database.configuration.DatabaseConfiguration
import rs.emulator.database.entry.Entry
import rs.emulator.database.transaction.Transactor
import rs.emulator.utilities.logger

/**
 *
 * @author Chk
 */
@Singleton class JDBCPoolingService @Inject constructor()
    : AbstractIdleService()
{

    @Inject private lateinit var configuration: DatabaseConfiguration

    override fun startUp()
    {

        val configuration = Configuration().configure().addProperties(configuration.fetchProperties())

        val transactors = mutableListOf<Transactor>()

        ClassGraph().enableAllInfo().whitelistPackages().scan().use {

            val classes = it.getSubclasses(Entry::class.qualifiedName).loadClasses().filterNotNull()

            //classes.forEach { transactor -> transactors.add(transactor.getDeclaredConstructor().newInstance() as Transactor) }

            //todo possibly run guice injection since we are already here?
            logger().info("Scanned for Transactors and found {}.", transactors.size)

        }

        val sessionFactory = configuration.buildSessionFactory()

        transactors.forEach { transactor -> transactor.factory = sessionFactory }

        logger().info("Initialized {} transactors.", transactors.size)

    }

    override fun shutDown()
    {

    }

}