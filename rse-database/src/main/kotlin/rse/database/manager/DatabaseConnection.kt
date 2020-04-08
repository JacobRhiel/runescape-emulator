package rse.database.manager

import gg.rsmod.util.ServerProperties
import rs.emulator.utilities.logger.info
import java.sql.Connection
import java.sql.DriverManager


class DatabaseConnection(
    properties: ServerProperties
)
{

    private lateinit var connection: Connection

    private val host: String = properties.get<String>("host")!!

    private val port: Int = properties.get<Int>("port")!!

    private val database: String = properties.get<String>("database")!!

    private val username: String = properties.get<String>("username")!!

    private val password: String = properties.get<String>("password")!!

    fun initConnection()
    {

        connection = DriverManager.getConnection(
            String.format(
                "jdbc:postgresql://%s:%d/%s?prepareThreshold=0",
                host,
                port,
                database
            ), username, password)

        info("Successfully initialized database connection to: $host - $port - $database.")

    }


}