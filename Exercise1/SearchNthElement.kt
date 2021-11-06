package Exercise1

import org.junit.Test

class SearchNthElement {
    fun <T> nth(list: List<T>, index: Int): T? = if (list.size >= index) list[index - 1] else null

    @Test
    fun test3() {
        nth(listOf(1, 1, 2, 3, 5, 8), 2)
        nth(listOf(1, 1, 2, 3, 5, 8), 5)
        nth(listOf(1, 1, 2, 3, 5, 8), 4)
    }
}
