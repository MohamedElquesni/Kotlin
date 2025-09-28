package DataStructures

fun main() {
    val numArray = arrayOf(1, 2, 3) //array of integers
    val stringArray = arrayOf(1,"ahmed") //array of any
    println(numArray[1])
    val array = Array(3) {
        i -> 0 // which mean set the index at i to 0
    }
    for (item in array) {
        println(item)
    }
}