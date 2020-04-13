package rs.emulator.entity.obj

import rs.emulator.cache.definition.definition
import rs.emulator.cache.definition.entity.ObjDefinition
import rs.emulator.storables.Item

object ObjFactory {

    fun createItem(id : Int, amount : Int = 1, init : Item.() -> Unit = {}) : Item {
        val item = Item(id, amount)
        val def : ObjDefinition = definition().find(id)
        item["stackable"] = def.stackable
        item["equip_slot"] = def.equipSlot
        init(item)
        return item
    }

    fun copyItem(item : Item, amount : Int = item.amount) : Item = item.copy(amount)

}