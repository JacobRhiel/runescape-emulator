package rs.emulator.container

import rs.emulator.Storable

class ContainerIterator<T : Storable>(private val array : Array<ContainerIndex<T>>, private var index : Int = 0) : Iterator<ContainerIndex<T>> {
    override fun hasNext(): Boolean = index < array.size
    override fun next(): ContainerIndex<T> = array[index++]
}