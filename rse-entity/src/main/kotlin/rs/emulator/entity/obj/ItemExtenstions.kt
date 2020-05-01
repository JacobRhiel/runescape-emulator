package rs.emulator.entity.obj

import rs.emulator.cache.definition.definition
import rs.emulator.cache.definition.entity.obj.ObjDefinition
import rs.emulator.storables.Item

fun Item.toDefinition() : ObjDefinition = definition().find(this.id)

fun ObjDefinition.createItem(amount : Int = 1, init : Item.(ObjDefinition) -> Unit = {}) : Item {
    val item = Item(this.id, amount)
    init(item, this)
    setAttributes(item)
    return item
}

fun ObjDefinition.setAttributes(item : Item) : Item {
    item["stackable"] = stackable
    item["equip_slot"] = equipSlot
    item["note_link"] = noteLinkId
    item["noted"] = noted
    item["placeholder_link"] = placeholderLink
    item["placeholder"] = isPlaceholder
    return item
}