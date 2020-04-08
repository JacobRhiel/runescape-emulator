package rs.emulator.security.uuid

import com.fasterxml.uuid.Generators
import com.fasterxml.uuid.UUIDComparator
import java.util.*

/**
 *
 * @author Chk
 */
object UUIDGenerator
{

    private val generator = Generators.nameBasedGenerator()

    fun generate(username: String): UUID = generator.generate(username)

    private fun UUID.compare(uuid: UUID, other: UUID) : Int = UUIDComparator.staticCompare(uuid, other)

}