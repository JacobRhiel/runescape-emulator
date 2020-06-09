package rs.emulator.entity.actor.player.storage

import rs.emulator.collections.Storable
import rs.emulator.collections.AttributeMap
import rs.emulator.collections.Container
import rs.emulator.containers.ItemContainer
import rs.emulator.entity.actor.player.storage.bank.Bank
import rs.emulator.entity.actor.player.storage.equipment.Equipment

class  StorageManager {

    val storageList = mutableMapOf<Int, Container<out Storable>>()
    val storageAttributes = mutableMapOf<Int, AttributeMap>()

    inline fun <reified T : Container<out Storable>> findByContainerKey(key: Int) = storageList[key] as T

    inline fun <reified T : Container<out Storable>> bind(key: Int, container: T, init: T.(AttributeMap) -> Unit = { _ -> }) {
        storageAttributes[key] = AttributeMap()
        init(container, storageAttributes[key]!!)
        storageList[key] = container
    }

    fun findAttributesFor(key : Int) : AttributeMap {
        val attributes = storageAttributes.getOrDefault(key, AttributeMap())
        storageAttributes[key] = attributes
        return attributes
    }

    fun inventory(): Inventory = findByContainerKey(93)
    fun equipment(): Equipment = findByContainerKey(94)
    fun bank() : Bank = findByContainerKey(95)

    fun invalidateStateFor(key : Int) {
        val con : ItemContainer = findByContainerKey(key)
        con.fireStateChange()
    }

}