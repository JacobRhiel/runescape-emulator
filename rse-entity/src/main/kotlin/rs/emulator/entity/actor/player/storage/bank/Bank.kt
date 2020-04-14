package rs.emulator.entity.actor.player.storage.bank

import rs.emulator.containers.StorableContainer
import rs.emulator.obersables.ObservableArray
import rs.emulator.storables.Item

class Bank : StorableContainer<Item> {

    val items : ObservableArray<Item> = ObservableArray(Array(800, init = { Item.EMPTY_ITEM }), Item.EMPTY_ITEM)
    private var stateChangeListener = {}

    override fun nextSlot(): Int {
        return items.indexOfFirst { it == Item.EMPTY_ITEM }
    }

    override fun swap(fromSlot: Int, toSlot: Int) {

    }

    override fun isFull(): Boolean {
        return items.all { it != Item.EMPTY_ITEM }
    }

    fun addItem(element: Item, tab : Int = 0) {
        items[nextSlot()] = element.copy()
        stateChangeListener()
    }

    fun removeItem(element: Item, tab : Int = 0) {

        stateChangeListener()
    }

    fun setStateChangeListener(body : () -> Unit) {
        this.stateChangeListener = body
    }

    @Deprecated("Deperacted in this context", ReplaceWith("addItem"), DeprecationLevel.HIDDEN)
    override fun add(element: Item) {
        TODO("Not yet implemented")
    }

    @Deprecated("Deprecated in this context", ReplaceWith("removeItem"), DeprecationLevel.HIDDEN)
    override fun remove(element: Item) {
        TODO("Not yet implemented")
    }

    override fun iterator(): MutableIterator<Item> {
        TODO("Not yet implemented")
    }


}