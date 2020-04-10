package rs.emulator.obersables

class ObservableMutableIterator<T>(val array : ObservableArray<T>, val removedPlateHolder : T, private var index : Int = 0) : MutableIterator<T> {
    override fun hasNext(): Boolean = index < array.size

    override fun next(): T = array[index++]

    override fun remove() {
        array[index] = removedPlateHolder
    }
}