package rs.emulator

import org.junit.Assert
import org.junit.Test
import rs.emulator.containers.items.equipment.Equipment
import rs.emulator.containers.items.equipment.EquipmentSlots
import rs.emulator.storables.Item

class EquipmentTest {

    @Test
    fun equipStackableItem() {
        val eq = Equipment()
        val ammo = Item.asStackable(117, 100)
        ammo["equip_slot"] = EquipmentSlots.AMMO.slot

        eq.addItem(ammo)

        Assert.assertTrue(eq[EquipmentSlots.AMMO.slot].id == 117)

        val otherAmmo = Item.asStackable(118, 100)
        otherAmmo["equip_slot"] = EquipmentSlots.AMMO.slot

        eq.addItem(otherAmmo) {removed, equiped ->
            Assert.assertTrue(removed.id == 117 && equiped.id == 118)
        }
    }

    @Test
    fun twoHandedTest() {
        val eq = Equipment()

        val whip = Item(4151)
        whip["equip_slot"] = EquipmentSlots.WEAPON.slot

        eq.addItem(whip)

        val twoHanded = Item(4153)
        twoHanded["equip_slot"] = EquipmentSlots.WEAPON.slot
        twoHanded["twoHanded"] = true

        eq.addItem(twoHanded) {removed, equip ->
            Assert.assertTrue("Failed to equip two handed", removed.id == 4151 && equip.id == 4153)
        }

        val shield = Item(10)
        shield["equip_slot"] = EquipmentSlots.SHIELD.slot

        eq.addItem(shield) {removed, equip ->
            Assert.assertTrue("Failed remove two handed", removed.id == 4153 && equip.id == 10)
        }
    }

}