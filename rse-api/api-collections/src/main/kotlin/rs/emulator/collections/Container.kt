package rs.emulator.collections

interface Container<T> : MutableIterable<T> {
    fun add(element : T)
    fun remove(element: T)
}