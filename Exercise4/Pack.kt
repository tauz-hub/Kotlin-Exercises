package Exercise4

import org.junit.Test

//If a list contains repeated elements, they should be placed in separate sublists.

fun <T> pack(list: List<T>): List<List<T>> =
    if (list.isEmpty()) emptyList()
    else {
        val packed = list.takeWhile { it == list.first() }
        println(packed)
        listOf(packed) + pack(list.drop(packed.size))
    }

class Pack {

    @Test
    fun main(){
       println( pack( "aaaabccaadeeee".toList()) )
    }
}