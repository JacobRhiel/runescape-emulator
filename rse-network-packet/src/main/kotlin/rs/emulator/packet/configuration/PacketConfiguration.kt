package rs.emulator.packet.configuration

import com.google.inject.Inject
import com.google.inject.Singleton
import rs.emulator.configuration.YamlConfiguration
import rs.emulator.configuration.environment.RSEEnvironment
import java.nio.file.Path

/**
 *
 * @author Chk
 */
@Singleton class PacketConfiguration @Inject constructor(environment: RSEEnvironment)
    : YamlConfiguration("packet_configuration", environment)
{

    override fun defaultDirectory(): Path = reference.defaultDirectory().resolve("packets") //todo: ./world/packets?

}