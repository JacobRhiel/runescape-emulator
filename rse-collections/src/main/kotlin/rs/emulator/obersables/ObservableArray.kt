package rs.emulator.obersables

class ObservableArray<T>(
    val array: Array<T>,
    val placeHolder: T
) : MutableIterable<T> {

    val changeListeners : MutableList<(ObservableArray<T>, T, T) -> Unit> = mutableListOf()
    val size = array.size

    operator fun get(index: Int): T {
        return array[index]
    }

    operator fun set(index: Int, value: T) {
        val old = array[index]
        array[index] = value
        changeListeners.forEach { it(this, old, value) }
    }

    override fun iterator(): MutableIterator<T> = ObservableMutableIterator(this, placeHolder)
    override fun toString(): String {
        return "ObservableArray(array=${array.contentToString()})"
    }


}