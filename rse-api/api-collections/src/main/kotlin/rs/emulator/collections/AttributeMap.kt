package rs.emulator.collections

class AttributeMap(
    private val map: MutableMap<String, Any> = mutableMapOf(),
    private val saveList: MutableList<String> = mutableListOf()
) : Copyable<AttributeMap> {

    fun isPersistent(key: String): Boolean = saveList.find { it == key } != null

    inline operator fun <reified T : Any> get(key: String): T {
        return getAttribute(key) as T
    }

    operator fun <T : Copyable<T>> set(key: String, save: Boolean = false, value: T) {
        setAttribute(key, save, value)
    }

    operator fun set(key: String, save: Boolean = false, value: Number) {
        setAttribute(key, save, value)
    }

    operator fun set(key : String, save : Boolean = false, value : String) {
        setAttribute(key, save, value)
    }

    operator fun set(key: String, save: Boolean, value: Boolean) {
        setAttribute(key, save, value)
    }

    fun getAttribute(key: String): Any? {
        return map[key]
    }

    private fun setAttribute(key: String, save: Boolean, value: Any) {
        map[key] = value
        if (save) saveList.add(key)
    }

    override fun copy(): AttributeMap {
        val attrMap = AttributeMap()
        attrMap.saveList.addAll(this.saveList)
        this.map.forEach { (t, u) ->
            when (u) {
                is Copyable<*> -> {
                    u.copy()?.let { attrMap.map.put(t, it) }
                }
                else -> attrMap.setAttribute(t, false, u)
            }
        }
        return attrMap
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AttributeMap

        if (map != other.map) return false
        if (saveList != other.saveList) return false

        return true
    }

    override fun hashCode(): Int {
        var hash = 0
        map.forEach {
            hash += it.value.hashCode()
        }
        return hash
    }


}