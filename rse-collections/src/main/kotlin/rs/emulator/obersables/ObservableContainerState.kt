package rs.emulator.obersables

import rs.emulator.containers.ItemContainer
import rs.emulator.storables.Item

class ObservableContainerState(init : ObservableContainerState.() -> Unit) {

    val added : MutableList<Pair<Item, Int>> = mutableListOf()
    val removed : MutableList<Pair<Item, Int>> = mutableListOf()

    var add : Item.(Int) -> Unit = { added.add(this to it) }
    var remove : Item.(Int) -> Unit = { removed.add(this to it) }
    var commit : ItemContainer.() -> Unit = {
        addItems()
        removeItems()
        fireStateChange()
    }

    init {
        init(this)
    }

    fun ItemContainer.addItems() {
        added.forEach {
            val item = it.first
            val slot = it.second
            this[slot] = item
        }
    }

    fun ItemContainer.removeItems() {
        removed.forEach {
            val item = it.first
            val slot = it.second
            if(item.amount <= 0) {
                this[slot] = Item.EMPTY_ITEM
            } else {
                this[slot].amount = item.amount
            }
        }
    }

    fun added(add : Item.(Int) -> Unit) {
        this.add = add
    }

    fun removed(remove : Item.(Int) -> Unit) {
        this.remove = remove
    }

    fun commit(commit : ItemContainer.() -> Unit) {
        this.commit = commit
    }

}