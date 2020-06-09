package rs.emulator.containers

import rs.emulator.items.Item

class ContainerState(init: ContainerState.() -> Unit) {

    val added: MutableList<Pair<Item, Int>> = mutableListOf()
    val removed: MutableList<Pair<Item, Int>> = mutableListOf()

    var add: Item.(Int) -> Unit = { addItem(it, this) }
    var remove: Item.(Int) -> Unit = { removeItem(it, this) }
    var commit: ItemContainer.() -> Unit = {
        addItems()
        removeItems()
        clearPlaceholders()
        fireStateChange()
    }

    init {
        init(this)
    }

    fun addItem(slot: Int, item: Item) {
        added.add(item to slot)
    }

    fun removeItem(slot: Int, item: Item) {
        removed.add(item to slot)
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
            if (item.amount <= 0) {
                this[slot] = Item.EMPTY_ITEM
            } else {
                this[slot].amount = item.amount
            }
        }
    }

    fun ItemContainer.clearPlaceholders() {
        forEachIndexed { index, item ->
            if(item === Item.PlACE_HOLDER) {
                this[index] = Item.EMPTY_ITEM
            }
        }
    }

    fun added(add: Item.(Int) -> Unit) {
        this.add = add
    }

    fun removed(remove: Item.(Int) -> Unit) {
        this.remove = remove
    }

    fun commit(commit: ItemContainer.() -> Unit) {
        this.commit = commit
    }

}