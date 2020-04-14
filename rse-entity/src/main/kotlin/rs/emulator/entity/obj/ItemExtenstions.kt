package rs.emulator.entity.obj

import rs.emulator.cache.definition.definition
import rs.emulator.cache.definition.entity.ObjDefinition
import rs.emulator.storables.Item

fun Item.toDefinition() : ObjDefinition = definition().find(this.id)

fun ObjDefinition.toItem(amount : Int = 1, init : Item.(ObjDefinition) -> Unit = {}) : Item {
    val item = Item(this.identifier, amount)
    item["stackable"] = stackable
    item["equip_slot"] = equipSlot
    init(item, this)
    return item
}