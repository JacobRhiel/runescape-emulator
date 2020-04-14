package rs.emulator.entity.actor.player.storage.bank

import rs.emulator.obersables.ObservableArray
import rs.emulator.storables.Item

class BankIterator(private val items : ObservableArray<Item>, private val tab : Int = 0) : MutableIterator<Item> {

    override fun hasNext(): Boolean {
        TODO("Not yet implemented")
    }

    override fun next(): Item {
        TODO("Not yet implemented")
    }

    override fun remove() {
        TODO("Not yet implemented")
    }
}