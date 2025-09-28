package Loops

fun main() {
    //default step 1
   for (item in 1..10)
       println(item)

    // step
    for (item in 1..10 step 2)
        println(item)

    //downTo
    for (item in 1 downTo 3)
        println(item)
}