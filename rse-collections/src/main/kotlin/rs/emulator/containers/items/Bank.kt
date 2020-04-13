package rs.emulator.containers.items

import rs.emulator.containers.ItemContainer
import rs.emulator.storables.Item

class Bank : ItemContainer(300) {

    val placeHolder: Array<Boolean> = Array(this.size, init = {false})

    override fun addItem(element: Item, tempListener: (Item, Item) -> Unit) {
        val item = this.find { it.isIdentical(element) }
        if(item != null) {
            item += element
        }
        fireStateChange()
    }

    override fun removeItem(element: Item, tempListener: (Item, Item) -> Unit) {
        val isPlaceholder : Boolean = element["placeholder"]

        fireStateChange()
    }
}