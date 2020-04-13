package rs.emulator.storables

import it.unimi.dsi.fastutil.ints.IntComparators
import rs.emulator.Storable
import rs.emulator.attributes.AttributeMap
import rs.emulator.attributes.Copyable

data class Item(override val id: Int, override var amount: Int = 1, val attributes: AttributeMap) :
    Storable, Copyable<Item>, Comparable<Item> {
    constructor(id: Int, amount: Int = 1) : this(id, amount, AttributeMap()) {
        this["stackable"] = false
        this["twoHanded"] = false
        this["equip_slot"] = -1
    }

    inline operator fun <reified T : Any> get(key: String): T {
        return attributes[key]
    }

    operator fun set(key: String, save: Boolean = false, value: Number) {
        attributes[key, save] = value
    }

    operator fun set(key: String, save: Boolean = false, value: Boolean) {
        attributes[key, save] = value
    }

    operator fun <T : Copyable<T>> set(key: String, save: Boolean, value: T) {
        attributes[key, save] = value
    }

    operator fun plusAssign(other: Item) {
        this.amount += other.amount
    }

    operator fun plusAssign(value: Int) {
        this.amount += value
    }

    operator fun minusAssign(other: Item) {
        this.amount -= other.amount
    }

    operator fun minusAssign(value: Int) {
        this.amount -= value
    }

    operator fun compareTo(amount: Int): Int = IntComparators.NATURAL_COMPARATOR.compare(this.amount, amount)

    override fun compareTo(other: Item): Int {
        return when {
            this == EMPTY_ITEM -> 1
            other == EMPTY_ITEM -> -1
            else -> 0
        }
    }

    fun isIdentical(other: Item): Boolean = this.hashCode() == other.hashCode()
    fun copy(newAmount: Int = this.amount): Item {
        return Item(id, newAmount, attributes.copy())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Item

        if (id != other.id) return false
        if (amount != other.amount) return false
        if (attributes != other.attributes) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + attributes.hashCode()
        return result
    }

    override fun toString(): String {
        return "Item(id=$id, amount=$amount, hashCode=${hashCode()})"
    }

    override fun copy(): Item {
        return this.copy(this.amount)
    }

    companion object {
        val EMPTY_ITEM = Item(-1, 0)

        fun asStackable(id: Int, amount: Int = 1): Item {
            val item = Item(id, amount)
            item["stackable"] = true
            return item
        }

    }
}