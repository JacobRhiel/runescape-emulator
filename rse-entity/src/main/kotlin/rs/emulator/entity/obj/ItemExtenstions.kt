package rs.emulator.entity.obj

import rs.emulator.cache.definition.definition
import rs.emulator.cache.definition.entity.ObjDefinition
import rs.emulator.storables.Item

fun Item.toDefinition() : ObjDefinition = definition().find(this.id)

fun ObjDefinition.createItem(amount : Int = 1, init : Item.(ObjDefinition) -> Unit = {}) : Item {
    val item = Item(this.identifier, amount)
    item["stackable"] = stackable
    item["equip_slot"] = equipSlot
    item["note_link"] = noteLinkId
    item["noted"] = noted
    item["placeholder_link"] = placeholderLink
    item["placeholder"] = isPlaceholder
    init(item, this)
    return item
}