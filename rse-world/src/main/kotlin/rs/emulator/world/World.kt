package rs.emulator.world

import rs.emulator.database.annotations.NoArg
import rs.emulator.database.entry.Entry
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 *
 * @author Chk
 */
@NoArg
@Entity
@Table(name = "worlds")
data class World(
    @Id @Column(name = "identifier", unique = true, nullable = false) var identifier: Int = 0,
    @Column(name = "mask") var mask: Int = 0,
    @Column(name = "address") var address: String = "",
    @Column(name = "activity") var activity: String = "",
    @Column(name = "location") var location: Int = 0
) : Entry()
{

    fun newBuilder() : WorldBuilder = WorldBuilder(this)

}