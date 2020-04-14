package rs.emulator.entity.actor.player.storage.equipment

import rs.emulator.containers.ItemContainer
import rs.emulator.storables.Item

class Equipment : ItemContainer(11) {

    override fun addItem(element: Item, tempListener: (Item, Item) -> Unit) {
        val equipSlot: Int = element["equip_slot"]
        val isStackable: Boolean = element["stackable"]
        val isTwoHanded: Boolean = element["twoHanded"]

        when {
            equipSlot == EquipmentSlots.WEAPON.slot && isTwoHanded -> {
                if(this[EquipmentSlots.SHIELD.slot] != Item.EMPTY_ITEM) {
                    tempListener(this[EquipmentSlots.SHIELD.slot], element)
                    this[EquipmentSlots.SHIELD.slot] = Item.EMPTY_ITEM
                }
            }
            equipSlot == EquipmentSlots.SHIELD.slot && isTwoHanded -> {
                if(this[EquipmentSlots.WEAPON.slot] != Item.EMPTY_ITEM) {
                    tempListener(this[EquipmentSlots.WEAPON.slot], element)
                    this[EquipmentSlots.WEAPON.slot] = Item.EMPTY_ITEM
                }
            }
            equipSlot == EquipmentSlots.SHIELD.slot -> {
                val isWeaponTwoHanded : Boolean = this[EquipmentSlots.WEAPON.slot]["twoHanded"]
                if(isWeaponTwoHanded) {
                    tempListener(this[EquipmentSlots.WEAPON.slot], element)
                    this[EquipmentSlots.WEAPON.slot] = Item.EMPTY_ITEM
                }
            }
        }
        val stackable : Boolean = this[equipSlot]["stackable"]
        if(this[equipSlot] == Item.EMPTY_ITEM) {
            this[equipSlot] = element.copy()
        } else if(stackable && isStackable) {
            this[equipSlot] += element
        } else {
            this[equipSlot] = element.copy()
        }
        fireStateChange()
    }

    override fun removeItem(element: Item, tempListener: (Item, Item) -> Unit) {
        val slot : Int = element["equip_slot"]
        tempListener(this[slot], Item.EMPTY_ITEM)
        this[slot] = Item.EMPTY_ITEM
        fireStateChange()
    }
}