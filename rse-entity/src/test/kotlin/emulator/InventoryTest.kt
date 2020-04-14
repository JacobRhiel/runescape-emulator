package rs.emulator

import org.junit.Assert
import org.junit.Test
import rs.emulator.entity.actor.player.storage.Inventory
import rs.emulator.storables.Item

class InventoryTest {

    @Test
    fun addStackableItem() {
        val inv = Inventory()
        val coins = Item.asStackable(995, 2000)

        inv.addItem(coins)

        Assert.assertNotNull("Failed to add $coins", inv.find { it.isIdentical(coins) })

    }

    @Test
    fun removeStackableItem() {
        val inv = Inventory()
        val coins = Item.asStackable(995, 2000)

        inv.addItem(coins)

        inv.removeItem(coins.copy(1000))

        Assert.assertNotNull("Failed to remove $coins", inv.find { it.isIdentical(coins) && it.amount == 1000 })

    }

    @Test
    fun listenerChangeTest() {
        val inv = Inventory()
        val coins = Item.asStackable(995)

        inv.addChangeListener { _, _, item2 ->
            Assert.assertTrue("Failed to record change for $coins", item2.isIdentical(coins))
        }

        inv.addItem(coins)


    }

    @Test
    fun addNonStackableItem() {
        val inv = Inventory()
        val whip = Item(4151)

        inv.addItem(whip)

        Assert.assertTrue("Failed to add non stackable item $whip", inv.count { it.isIdentical(whip) } == 1)

        val whips = Item(4151, 2)

        inv.addItem(whips)

        Assert.assertTrue("Failed to add none stackable item $whips", inv.count { it.isIdentical(whip) } == 3)

    }

    @Test
    fun removeNonStackableItem() {
        val inv = Inventory()
        val whip = Item(4151)

        inv.addItem(whip)

        inv.removeItem(Item(4151))

        Assert.assertTrue("Failed to remove non stackable $whip", inv.count { it.isIdentical(whip) } == 0)

        val whips = Item(4151, 5)

        inv.addItem(whips)

        inv.removeItem(Item(4151, 2))

        Assert.assertTrue("Failed to remove non stackale ${whips.copy(2)}", inv.count { it.isIdentical(whip) } == 3)

    }

    @Test
    fun swapSlots() {
        val inv = Inventory()
        val santa = Item(1050)
        val whip = Item(4151)

        inv.addItem(santa)
        inv.addItem(whip)

        inv.swap(0, 1)

        Assert.assertTrue("Failed to swap santa to slot 1", inv[1].isIdentical(santa))
        Assert.assertTrue("Failed to swap whip to slot 0", inv[0].isIdentical(whip))

    }

    @Test
    fun tempListenerTest() {
        val inv = Inventory()
        val whip = Item(4151)

        inv.addItem(whip) { left_over, added ->
            Assert.assertTrue(
                "Temp listener expect 1 empty 1 added",
                left_over == Item.EMPTY_ITEM && added != Item.EMPTY_ITEM
            )
        }

        val whips = Item(4151, 27)

        inv.addItem(whips) { left_over, added ->
            Assert.assertTrue("Listener expect 0 left and 27 added", left_over == Item.EMPTY_ITEM && added.amount == 27)
        }

        val santa = Item(1050, 5)

        inv.addItem(santa) { left_over, added ->
            Assert.assertTrue(
                "Expect 5 ($left_over) left overs and 0 ($added) added",
                left_over.amount == 5 && added == Item.EMPTY_ITEM
            )
        }

        val rWhip = Item(4151)

        inv.removeItem(rWhip) { old, new ->
            Assert.assertTrue("Expect 1 ($old) and empty ($new)", old.isIdentical(rWhip) && new == Item.EMPTY_ITEM)
        }

        val moreSanta = Item(1050, 3)

        inv.addItem(moreSanta) { left_over, added ->
            Assert.assertTrue("Expect 2 ($left_over) and 1 added ($added)", left_over.amount == 2 && added.amount == 1)
        }

    }

    /**
     * Haven't written bank code, therefor shifting was tested on inventory.
     * All containers can be shifted, Item.EMPTY_ITEM will be shifted to the right.
     */

    @Test
    fun shifting() {
        val inv = Inventory()
        val whips = Item(4151, 28)

        inv.addItem(whips)

        inv[1] = Item.EMPTY_ITEM
        inv[2] = Item(1050)
        inv[3] = Item.EMPTY_ITEM

        inv.shiftItems()

        Assert.assertTrue(
            "Failed to shift items to the left",
            inv[26] == Item.EMPTY_ITEM
                    && inv[27] == Item.EMPTY_ITEM
                    && inv[1].isIdentical(Item(1050))
        )

    }

}
