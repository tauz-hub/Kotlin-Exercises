package Exercise3

import org.junit.Test

//`flatten a nested list structure`

fun flatten(list: List<Any>): List<Any> =
    list.flatMap {
        if (it is List<*>) flatten(it as List<Any>) else listOf(it)
    }
class Flatten {

    @Test
    fun main(){
        println(flatten(listOf(listOf(1, 1), 7, 2, listOf(3, listOf(5, 8)))))
        //output [1, 1, 7, 2, 3, 5, 8]
    }
}