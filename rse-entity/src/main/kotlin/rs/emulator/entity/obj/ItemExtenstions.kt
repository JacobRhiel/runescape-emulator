package rs.emulator.entity.obj

import rs.emulator.cache.definition.definition
import rs.emulator.cache.definition.entity.ObjDefinition
import rs.emulator.storables.Item

fun Item.toDefinition() : ObjDefinition = definition().find(this.id)