package rs.emulator.tools.osrsbox

import com.fasterxml.jackson.databind.json.JsonMapper
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.internal.LinkedTreeMap
import com.google.gson.stream.JsonReader
import java.io.BufferedReader
import java.io.File

/**
 *
 * @author Chk
 */
object OSRSBoxParser
{

    @JvmStatic
    fun main(args: Array<String>)
    {

        val mapper = JsonMapper()

        val root = mapper.readValue(
            File("D:\\RuneScape\\Private Servers\\Junk\\runescape-emulator\\rse-tools\\src\\main\\resources\\items-complete.json"),
            HashMap::class.java
        )

        val abc = mutableListOf<ItemEquip>()

        root.forEach { id, map ->

            val entry = map as HashMap<*, *>

            entry.forEach { field, value ->
                val f = field as String
                if (f == "equipment")
                {
                    if(value == null) return@forEach
                    val info = value as HashMap<*, *>
                    info.forEach { key, value ->

                        if (key == "slot")
                        {
                            abc.add(ItemEquip(Integer.valueOf(id as String), EquipmentSlots.values().first { it.id == (value as String) }.slot))
                        }
                    }

                }
            }

        }

        abc.sortedBy { it.id }.forEach { println(it) }

    }

    data class ItemEquip(val id: Int, val slot: Int)
    {
        override fun toString(): String = "$id : $slot"
    }


    enum class EquipmentSlots(val id: String, val slot: Int)
    {

        HEAD("head", 0),
        CAPE("cape", 1),
        AMULET("neck", 2),
        WEAPON("weapon", 3),
        BODY("body", 4),
        SHIELD("shield", 5),
        LEGS("legs", 7),
        GLOVES("hands", 9),
        BOOTS("feet", 10),
        RING("ring", 12),
        AMMO("ammo", 13),
        TWO_HANDED("2h", 14)
        ;

    }

    class Items(var array: Map<Any, Any>)

    data class ItemsComplete(
        val id: Int,
        val name: String,
        val members: Boolean,
        val tradeable: Boolean,
        val tradeable_on_ge: Boolean,
        val stackable: Boolean,
        val noted: Boolean,
        val noteable: Boolean,
        val linked_id_item: Int,
        val linked_id_noted: Int,
        val linked_id_placeholder: Int,
        val placeholder: Boolean,
        val equipable: Boolean,
        val equipable_by_player: Boolean,
        val equipable_weapon: Boolean,
        val cost: Int,
        val lowalch: Int,
        val highalch: Int
    )

}