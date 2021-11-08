package Exercise4

import org.junit.Test

//If a list contains repeated elements, they should be replaced with a single copy of the element.
// The order of the elements should not be changed.

fun <T> compress(list: List<T>, index: Int): List<T> =
    list.fold(emptyList<T>()) { result, value ->
        println(result+  " and value: " + value)
        if (result.isNotEmpty() && result.last() == value) result
        else result + value
    }

class Compress {
    @Test
    fun main(){
        println(compress("aaaabccaadeeee".toList(),0))
    }
}