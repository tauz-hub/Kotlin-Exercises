package Exercise1

import org.junit.Test

class SearchPenultimateElement {
    //Encontre o penúltimo elemento de uma lista.]
    fun <T> penultimate(list: List<T>): T? = if (list.isNotEmpty() && list.size > 1) list[list.lastIndex - 1] else null

    @Test
    fun main() {
        println(penultimate(listOf(1, 2, 3, 4, 5, 6, 7, 8)))
        println(penultimate(listOf(1, 3, 5, 4)))
        println(penultimate(emptyList<Int>()))
        println(penultimate(listOf("a")))
    }
}
