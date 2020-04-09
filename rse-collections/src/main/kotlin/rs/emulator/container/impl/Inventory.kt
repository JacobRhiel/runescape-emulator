package rs.emulator.container.impl

import rs.emulator.container.Container
import rs.emulator.container.ContainerIndex
import rs.emulator.container.ResultSet
import rs.emulator.container.ResultType
import rs.emulator.container.events.ContainerEvent
import rs.emulator.storables.Item

class Inventory(updateListener : (Array<ContainerIndex<Item>>) -> Unit = {}) : Container<Item>(Array(28, init = {
    ContainerIndex(
        it,
        Item.EMPTY_ITEM
    )
}), updateListener = updateListener) {

    override fun add(value: Item): ResultSet<Item> {
        val isStackable: Boolean = value["stackable"]
        val resultSet = ResultSet<Item>()
        if (isStackable) {
            val con = this.find { it.value.isIdentical(value) }
            if (con != null) {
                //Must do it this way cause x + x and += x conflict, kotlin bug?
                resultSet.add(
                    value.copy(value.amount + con.value.amount),
                    ResultType.MODIFIED
                )
                fireEvent(ContainerEvent(this, resultSet))
                if (!resultSet.cancelled) {
                    con.value += value
                }
            } else {
                val copied = value.copy()
                resultSet.add(copied)
                fireEvent(ContainerEvent(this, resultSet))
                if (!resultSet.cancelled) {
                    this[nextSlot()] = copied
                }
            }
        } else if (value.amount > 1) {
            var amt = value.amount
            while (amt > 0) {
                val copied = value.copy(1)
                resultSet.add(copied)
                fireEvent(ContainerEvent(this, resultSet))
                if (!resultSet.cancelled) {
                    this[nextSlot()] = copied
                    amt--
                } else {
                    break
                }
            }
        } else {
            resultSet.add(value)
            fireEvent(ContainerEvent(this, resultSet))
            if (!resultSet.cancelled) {
                this[nextSlot()] = value.copy()
            }
        }
        if(!resultSet.cancelled) {
            fireUpdate()
        }
        return resultSet
    }

    override fun remove(value: Item): ResultSet<Item> {
        val resultSet = ResultSet<Item>()
        val isStackable: Boolean = value["stackable"]
        val item = this.find { it.value.isIdentical(value) }
        if (item != null) {
            if (isStackable) {
                if((item.value.amount - value.amount) <= 0) {
                    resultSet.add(item.value, ResultType.REMOVED)
                    item.value = Item.EMPTY_ITEM
                } else {
                    resultSet.add(item.value, ResultType.MODIFIED)
                    item.value -= value
                }
            } else {
                var amount = value.amount
                for (con in this) {
                    if(amount <= 0)
                        break
                    if(con.value.isIdentical(value)) {
                        resultSet.add(con.value, ResultType.REMOVED)
                        con.value = Item.EMPTY_ITEM
                        amount--
                    }
                }
            }
        }
        if(!resultSet.cancelled) {
            fireUpdate()
        }
        return resultSet
    }

    private fun nextSlot(): Int = this.indexOfFirst { it.value == Item.EMPTY_ITEM }

}