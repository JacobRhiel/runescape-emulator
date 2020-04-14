package rs.emulator.entity.actor.player.storage

import rs.emulator.containers.ItemContainer
import rs.emulator.storables.Item

class Bank : ItemContainer(300) {

    val placeHolder: Array<Boolean> = Array(this.size, init = {false})

    override fun addItem(element: Item, tempListener: (Item, Item) -> Unit) {
        val isNote : Boolean = element["noted"]
        if(isNote) {
            val noteLink : Int = element["note_link"]
        }



        fireStateChange()
    }

    override fun removeItem(element: Item, tempListener: (Item, Item) -> Unit) {
        val isPlaceholder : Boolean = element["placeholder"]

        fireStateChange()
    }
}