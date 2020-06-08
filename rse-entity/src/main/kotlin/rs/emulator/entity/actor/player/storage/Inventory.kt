package rs.emulator.entity.actor.player.storage

import rs.emulator.containers.ItemContainer
import rs.emulator.obersables.ObservableContainerState
import rs.emulator.storables.Item

class Inventory : ItemContainer(28) {

    override fun addItem(element: Item, observer: ObservableContainerState.() -> Unit) {
        val containerState = ObservableContainerState { observer(this) }
        observer(containerState)
        if(isFull()) {
            return
        }
        val isStackable : Boolean = element["stackable"]
        if(isStackable) {
            val foundSlot = this.findSlot(element)
            if(foundSlot != -1) {
                val i = this[foundSlot].copy()
                i += element
                containerState.add(i, foundSlot)
            } else {
                val slot = nextSlot()
                containerState.add(element.copy(), slot)
            }
        } else {
            var amt = element.amount
            var newSlot = nextSlot()
            while(amt > 0 && hasSpace()) {
                containerState.add(element.copy(1), newSlot)
                newSlot++
                amt--
            }
        }
        containerState.commit(this)
    }

    override fun removeItem(element: Item, observer: ObservableContainerState.() -> Unit) {
        val containerState = ObservableContainerState { observer(this) }
        if(this.all { it == Item.EMPTY_ITEM }) {
            return
        }
        val slot = this.findSlot(element)
        if(slot != -1 && this[slot] != Item.EMPTY_ITEM) {
            val isStackable : Boolean = element["stackable"]
            when {
                isStackable -> {
                    val copy = this[slot].copy()
                    copy -= element
                    containerState.remove(copy, slot)
                }
                element.amount > 1 -> {
                    var amt = element.amount
                    this.forEachIndexed { index, item ->
                        if (amt > 0) {
                            if(item.isIdentical(element)) {
                                containerState.remove(item.copy(0), index)
                            }
                            amt--
                        } else {
                            return@forEachIndexed
                        }
                    }
                }
                else -> containerState.remove(element.copy(0), slot)
            }
        }
        containerState.commit(this)
    }

}