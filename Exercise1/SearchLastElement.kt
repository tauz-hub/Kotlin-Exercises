package Exercise1

import org.junit.Test

class SearchLastElement {
    // 1- Find the last element of a list.
    fun <T> last(list: List<T>): T? = if (list.isNotEmpty()) list[list.lastIndex] else null

    @Test
    fun main() {
        println(last(listOf(1, 2, 3, 4, 5, 6, 7, 8)))
        println(last(listOf(1, 3, 5, 4)))
        println(last(emptyList<Int>()))
        println(last(listOf("a", "b", "c")))
    }
}
