package Exercise3

import org.junit.Test

//Find out if a list is a palindrome.

//old method
//fun <T> isPalindrome(list: List<T>): Boolean {
//    list.forEach() {
//        if(it != list[ list.size - list.indexOf(it) - 1]){
//            return false
//        }
//    }
//    return true
//}

//new method recursive
tailrec fun <T> isPalindrome(list: List<T>): Boolean =
    when {
        list.size <= 1              -> true
        list.first() != list.last() -> false
        else                        -> isPalindrome(list.drop(1).dropLast(1))
    }

class IsPalindrome {

    @Test
    fun main(){
        println( isPalindrome (listOf ( 1 , 2 , 3, 2, 1 ))) //true
        println( isPalindrome (listOf ( 1 , 2 , 3, 4, 2, 1 ))) //false
    }
}
