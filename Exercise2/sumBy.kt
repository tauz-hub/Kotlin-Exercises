package Exercise2
import org.junit.Test


//Calcule o número de elementos de uma lista.

fun <T> length(list: List<T>): Int = list.sumBy { 1 }

class sumBy {
    @Test
    fun test4() {
        println(length(listOf(1, 1, 2, 3)))
        println(length(listOf(1, 1, 2, 3, 5)))
        println(length(listOf(1, 1, 2, 3, 5, 6)))
        println(length(emptyList<Int>()))
    }
}

