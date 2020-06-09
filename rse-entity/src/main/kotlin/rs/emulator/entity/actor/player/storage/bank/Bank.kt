package rs.emulator.entity.actor.player.storage.bank

import rs.emulator.containers.ItemContainer
import rs.emulator.containers.ContainerState
import rs.emulator.items.Item

class Bank : ItemContainer(800) {
    override fun addItem(element: Item, containerState: ContainerState.() -> Unit) {
        TODO("Not yet implemented")
    }

    override fun removeItem(element: Item, containerState: ContainerState.() -> Unit) {
        TODO("Not yet implemented")
    }
}