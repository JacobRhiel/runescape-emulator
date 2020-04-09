package rs.emulator

import org.junit.Assert
import org.junit.Test
import rs.emulator.container.ResultType
import rs.emulator.container.impl.Inventory
import rs.emulator.storables.Item
import java.util.logging.Level
import java.util.logging.Logger
import kotlin.math.log

class InventoryTest {

    val logger = Logger.getLogger(InventoryTest::class.java.simpleName)

    @Test
    fun addStackableItem() {

        val inv = Inventory()

        val coins = Item(995, 1000)
        coins["stackable"] = true

        inv.add(coins)

        Assert.assertNotNull("Failed to add 1000 coins", inv.find { it.value.isIdentical(coins) })

    }

    @Test
    fun removeStackableItem() {

        val inv = Inventory()

        val added = Item(995, 1000)
        added["stackable"] = true

        inv.add(added)

        val coins = Item(995, 500)
        coins["stackable"] = true

        inv.remove(coins)

        Assert.assertNull("Failed to remove 500 coins", inv.find { it.value.isIdentical(coins) && it.value.amount == 1000 })

    }

    @Test
    fun addNonStackableItem() {
        val inv = Inventory()


        val whips = Item(4151, 4)

        inv.add(whips)

        Assert.assertTrue("Failed to add whips separately", inv.count { it.value.isIdentical(whips) } == 4)

    }

    @Test
    fun removeNonStackableItem() {
        val inv = Inventory()

        val added = Item(4151, 4)

        inv.add(added)

        val whips = Item(4151, 2)

        inv.remove(whips)

        Assert.assertTrue("Failed to remove whips separately", inv.count { it.value.isIdentical(whips) } == 2)

    }

    @Test
    fun resetSetTest() {
        val inv = Inventory()

        val whip = Item(4151)

        val set = inv.add(whip)

        Assert.assertNotNull("Failed to record added item in result set", set.resultMap[ResultType.ADDED]?.find { it.isIdentical(whip) })

        val removedSet = inv.remove(whip)

        Assert.assertNotNull("Failed to record removed item from result set", removedSet.resultMap[ResultType.REMOVED]?.find { it.isIdentical(whip) })

        val coins = Item(995, 5000)
        coins["stackable"] = true

        val coinSet = inv.add(coins)

        Assert.assertNotNull("Failed to record stackable item to result set", coinSet.resultMap[ResultType.ADDED]?.find { it.isIdentical(coins) })

        val removedCoins = Item(995, 2500)
        removedCoins["stackable"] = true

        val cSet = inv.remove(removedCoins)

        Assert.assertTrue("Failed to record stackable modified to result set", cSet.resultMap[ResultType.MODIFIED]?.count { it.isIdentical(removedCoins) && it.amount == 2500 } == 1)

        val moreRemovedCoins = Item(995, 3000)
        moreRemovedCoins["stackable"] = true

        val removeSet = inv.remove(moreRemovedCoins)

        Assert.assertTrue("Failed to record stackable removed to result set", removeSet.resultMap[ResultType.REMOVED]?.count { it.isIdentical(moreRemovedCoins) } == 1)

    }

}
