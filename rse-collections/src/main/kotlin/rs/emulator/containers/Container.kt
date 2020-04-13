package rs.emulator.containers

interface Container<T> : MutableIterable<T> {
    fun add(element : T)
    fun remove(element: T)
}