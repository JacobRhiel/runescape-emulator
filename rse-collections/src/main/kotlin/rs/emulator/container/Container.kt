package rs.emulator.container

import rs.emulator.Storable
import rs.emulator.container.events.ContainerEvent

abstract class Container<T : Storable>(
    private val items: Array<ContainerIndex<T>>,
    private val listeners: MutableList<(ContainerEvent<T>) -> Unit> = mutableListOf(),
    private var updateListener: (Array<ContainerIndex<T>>) -> Unit = {}
) : Iterable<ContainerIndex<T>> {

    abstract fun add(value: T): ResultSet<T>
    abstract fun remove(value: T): ResultSet<T>

    operator fun get(index: Int) = items[index]
    operator fun set(index: Int, value: T) {
        if (index != -1) {
            items[index].value = value
        }
    }

    fun swap(from: Int, to: Int): ResultSet<T> {
        val fromValue = this.items[from]
        val toValue = this.items[to]
        this.items[to] = fromValue
        this.items[from] = toValue
        val resultSet = ResultSet<T>()
        resultSet.add(fromValue.value, ResultType.SWAP)
        resultSet.add(toValue.value, ResultType.SWAP)
        fireEvent(ContainerEvent(this, resultSet))
        updateListener(this.items)
        return resultSet
    }

    fun addChangeListener(func: (ContainerEvent<T>) -> Unit) {
        listeners.add(func)
    }

    fun removeChangeListener(func: (ContainerEvent<T>) -> Unit) {
        listeners.remove(func)
    }

    fun fireEvent(event: ContainerEvent<T>) {
        listeners.forEach { it(event) }
    }

    fun fireUpdate() {
        updateListener(this.items)
    }

    fun setUpdateListener(updateListener: (Array<ContainerIndex<T>>) -> Unit) {
        this.updateListener = updateListener
    }

    override fun iterator(): Iterator<ContainerIndex<T>> = ContainerIterator(items)

    override fun toString(): String {
        return "Container(items=${items.contentToString()})"
    }


}