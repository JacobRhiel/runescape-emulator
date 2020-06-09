package rs.emulator.collections

interface StorableContainer<T> : Container<T> {

    fun nextSlot(): Int
    fun swap(fromSlot: Int, toSlot: Int)
    fun isFull() : Boolean

    fun hasSpace() = !isFull()

}