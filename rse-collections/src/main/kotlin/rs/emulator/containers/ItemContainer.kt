package rs.emulator.containers

import rs.emulator.obersables.ObservableArray
import rs.emulator.obersables.ObservableContainerState
import rs.emulator.storables.Item

abstract class ItemContainer(
    val size: Int
) : StorableContainer<Item> {

    val items: ObservableArray<Item> = ObservableArray(Array(size, init = { Item.EMPTY_ITEM }), Item.EMPTY_ITEM)

    private var onStateChange : () -> Unit = {}

    operator fun get(slot: Int): Item = items[slot]
    operator fun set(slot: Int, item: Item) {
        if (slot != -1) {
            items[slot] = item
        }
    }

    abstract fun addItem(element: Item, observer: ObservableContainerState.() -> Unit = {})
    abstract fun removeItem(element: Item, observer: ObservableContainerState.() -> Unit = {})

    fun setStateChangeListener(body : () -> Unit) {
        this.onStateChange = body
    }

    fun fireStateChange() {
        onStateChange()
    }

    @Deprecated("Deprecated in this context", ReplaceWith("addItem"), DeprecationLevel.HIDDEN)
    override fun add(element: Item) {
        addItem(element)
    }

    @Deprecated("Deprecated in this context", ReplaceWith("removeItem"), DeprecationLevel.HIDDEN)
    override fun remove(element: Item) {
        removeItem(element)
    }

    fun findSlot(element: Item) : Int {
        return this.indexOfFirst { it.isIdentical(element) }
    }

    operator fun contains(element: Item): Boolean = this.items.any { it.isIdentical(element) }

    fun addChangeListener(listener: (ObservableArray<Item>, Item, Item) -> Unit) {
        items.changeListeners.add(listener)
    }

    fun removeChangeListener(listener: (ObservableArray<Item>, Item, Item) -> Unit) {
        items.changeListeners.remove(listener)
    }

    fun shiftItems() {
        items.sortedBy { it }.forEachIndexed { index, item -> items[index] = item }
    }

    override fun nextSlot(): Int = items.indexOfFirst { it == Item.EMPTY_ITEM }

    override fun swap(fromSlot: Int, toSlot: Int) {
        val from = items[fromSlot]
        val to = items[toSlot]
        items[fromSlot] = to
        items[toSlot] = from
    }

    override fun isFull(): Boolean = this.items.count { it == Item.EMPTY_ITEM } == 0

    override fun iterator() = ItemIterator(this.items)
    override fun toString(): String {
        return "ItemContainer(items=$items)"
    }


}