package rs.emulator.entity.actor.player.storage.equipment

import rs.emulator.containers.ItemContainer
import rs.emulator.obersables.ObservableContainerState
import rs.emulator.storables.Item

class Equipment : ItemContainer(11) {

    override fun addItem(element: Item, observer: ObservableContainerState.() -> Unit) {
        val containerState = ObservableContainerState { observer(this) }
        val equipSlot: Int = element["equip_slot"]
        val isStackable: Boolean = element["stackable"]
        val isTwoHanded: Boolean = element["twoHanded"]

        when {
            equipSlot == EquipmentSlots.WEAPON.slot && isTwoHanded -> {
                if(this[EquipmentSlots.SHIELD.slot] != Item.EMPTY_ITEM) {
                    containerState.remove(this[EquipmentSlots.SHIELD.slot].copy(0), EquipmentSlots.SHIELD.slot)
                }
            }
            equipSlot == EquipmentSlots.SHIELD.slot && isTwoHanded -> {
                if(this[EquipmentSlots.WEAPON.slot] != Item.EMPTY_ITEM) {
                    containerState.remove(this[EquipmentSlots.WEAPON.slot].copy(0), EquipmentSlots.WEAPON.slot)
                }
            }
            equipSlot == EquipmentSlots.SHIELD.slot -> {
                val isWeaponTwoHanded : Boolean = this[EquipmentSlots.WEAPON.slot]["twoHanded"]
                if(isWeaponTwoHanded) {
                    containerState.remove(this[EquipmentSlots.WEAPON.slot].copy(0), EquipmentSlots.WEAPON.slot)
                }
            }
            else -> {
                val stackable : Boolean = this[equipSlot]["stackable"]
                var old = this[equipSlot].copy()
                if(stackable && isStackable) {
                    old += element
                } else {
                    old = element.copy()
                }
                containerState.add(old, equipSlot)
            }
        }
        containerState.commit(this)
    }

    override fun removeItem(element: Item, observer: ObservableContainerState.() -> Unit) {
        val containerState = ObservableContainerState { observer(this) }
        val slot : Int = element["equip_slot"]
        containerState.remove(this[slot].copy(0), slot)
        containerState.commit(this)
    }
}