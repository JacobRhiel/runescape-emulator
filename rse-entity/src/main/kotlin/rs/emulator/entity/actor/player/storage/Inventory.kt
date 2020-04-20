package rs.emulator.entity.actor.player.storage

import rs.emulator.containers.ItemContainer
import rs.emulator.storables.Item

class Inventory : ItemContainer(28) {

    override fun addItem(element: Item, tempListener: (Item, Item) -> Unit) {
        if(isFull()) {
            tempListener(element, Item.EMPTY_ITEM)
            return
        }
        val isStackable : Boolean = element["stackable"]
        if(isStackable) {
            val item = this.find { it.isIdentical(element) }
            if(item != null) {
                val i = item.copy()
                item += element
                tempListener(i, element)
            } else {
                val slot = nextSlot()
                this[slot] = element.copy()
                tempListener(Item.EMPTY_ITEM, this[slot])
            }
        } else {
            var amt = element.amount
            while(amt > 0 && hasSpace()) {
                this[nextSlot()] = element.copy(1)
                amt--
            }
            if(isFull() && amt > 0) {
                tempListener(element.copy(amt), element.copy(element.amount - amt))
            } else {
                tempListener(Item.EMPTY_ITEM, element)
            }
        }
        fireStateChange()
    }

    override fun removeItem(element: Item, tempListener: (Item, Item) -> Unit) {
        if(this.all { it == Item.EMPTY_ITEM }) {
            tempListener(Item.EMPTY_ITEM, Item.EMPTY_ITEM)
            return
        }
        val slot = this.indexOfFirst { it.isIdentical(element) }
        if(slot != -1 && this[slot] != Item.EMPTY_ITEM) {
            val isStackable : Boolean = element["stackable"]
            val old = this[slot]
            when {
                isStackable -> this[slot] -= element
                element.amount > 1 -> {
                    var amt = element.amount
                    val iter = this.iterator()
                    while(iter.hasNext() && amt > 0) {
                        val toRemove = iter.next()
                        if(toRemove.isIdentical(element)) {
                            iter.remove()
                            amt--
                        }
                    }
                }
                else -> this[slot] = Item.EMPTY_ITEM
            }
            tempListener(old, this[slot])
        }
        fireStateChange()
    }

}