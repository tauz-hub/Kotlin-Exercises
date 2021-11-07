package Exercise2

import org.junit.Test

//old method
//fun <T> reverse(list: List<T>): List<T> {
//    val result = LinkedList<T>()
//    list.forEach { result.addFirst(it) }
//    return result
//}

//new method recursive
fun <T> reverseRec(list: List<T>): List<T> =
    if (list.size > 1) reverseRec(list.drop(1)) + list.first() else list

class InvertAList {
    @Test
    fun test5() {
        println(reverseRec(listOf(1, 1, 2, 3, 5, 8)))
    }
}
