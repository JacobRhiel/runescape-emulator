package rs.emulator.entity.actor.player.storage

import rs.emulator.attributes.AttributeMap
import rs.emulator.containers.ItemContainer
import rs.emulator.containers.items.Inventory
import rs.emulator.containers.items.equipment.Equipment

class StorageManager {

    val storageList = mutableMapOf<Int, ItemContainer>()
    val storageAttributes = mutableMapOf<Int, AttributeMap>()

    inline fun <reified T : ItemContainer> findByContainerKey(key: Int) = storageList[key] as T

    inline fun <reified T : ItemContainer> bind(key: Int, container: T, init: T.(AttributeMap) -> Unit = { _ -> }) {
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

    fun invalidateStateFor(key : Int) {
        val con : ItemContainer = findByContainerKey(key)
        con.fireStateChange()
    }

}