package rs.emulator.containers.items

import rs.emulator.obersables.ObservableArray
import rs.emulator.storables.Item

class ItemIterator(private val items: ObservableArray<Item>, private var slot: Int = 0) : MutableIterator<Item> {
    override fun hasNext(): Boolean = slot < items.size

    override fun next(): Item = items[slot++]

    override fun remove() {
        items[slot] = Item.EMPTY_ITEM
    }
}