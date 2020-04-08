package rs.emulator.world

import rs.emulator.WorldLocation
import rs.emulator.world.configuration.WorldConfiguration

/**
 *
 * @author Chk
 */
class WorldBuilder(private val world: World)
{

    fun identifier(id: Int) = apply { world.identifier = id }

    fun mask(mask: Int) = apply { world.mask = mask }

    fun address(address: String) = apply { world.address = address }

    fun activity(activity: String) = apply { world.activity = activity }

    fun location(location: WorldLocation) = apply { world.location = location.identifier }

    fun location(identifier: Int) = apply {

        val location = WorldLocation.fetchLocation(identifier) ?: throw Error("No world identifier found for $identifier.")

        world.location = location.identifier

    }

    fun fromConfiguration(configuration: WorldConfiguration) = apply {

        world.identifier = configuration.fetchValue("identifier")?.asInt()!!

        world.mask = configuration.fetchValue("mask")?.asInt()!!

        world.address = configuration.fetchValue("address")?.asText()!!

        world.activity = configuration.fetchValue("activity")?.asText()!!

        world.location = configuration.fetchValue("location")?.asInt()!!

    }

    fun build() = world

}