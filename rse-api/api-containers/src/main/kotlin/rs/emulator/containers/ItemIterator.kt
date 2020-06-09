package rs.emulator.containers

import rs.emulator.collections.observables.ObservableArray
import rs.emulator.items.Item

class ItemIterator(private val items: ObservableArray<Item>, private var slot: Int = 0) : MutableIterator<Item> {
    override fun hasNext(): Boolean = slot < items.size

    override fun next(): Item = items[slot++]

    override fun remove() {
        items[slot] = Item.EMPTY_ITEM
    }
}