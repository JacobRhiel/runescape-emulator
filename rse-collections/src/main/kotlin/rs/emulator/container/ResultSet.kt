package rs.emulator.container

import rs.emulator.Storable
import java.util.*

class ResultSet<T : Storable>(val resultMap: EnumMap<ResultType, MutableList<T>> = EnumMap(ResultType::class.java), var cancelled : Boolean = false) {

    init {
        for (value in ResultType.values()) {
            resultMap[value] = mutableListOf()
        }
    }

    fun add(value: T, type: ResultType = ResultType.ADDED) {
        resultMap[type]?.add(value)
    }

    fun forEachAdded(con: (T) -> Unit) = resultMap[ResultType.ADDED]?.forEach(con)

    fun forEachModified(con: (T) -> Unit) = resultMap[ResultType.MODIFIED]?.forEach(con)

    fun forEachRemoved(con: (T) -> Unit) = resultMap[ResultType.REMOVED]?.forEach(con)

}

enum class ResultType {
    MODIFIED,
    ADDED,
    REMOVED,
    SWAP
}