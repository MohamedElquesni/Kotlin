package Functions

fun greeting(n : Int = 1, m : Int = 4) {
    // instructions
    println("Open Door $n times");
    println("Wait for $m minutes");
}
// -----------------------------------------------------------------------------------
fun add(number1 : Int, number2 : Int) : Int {
    return number1 + number2
}
//or
fun add2(number1 : Int, number2 : Int) : Int = number1 + number2

// -----------------------------------------------------------------------------------

fun main() {
    /*
    greeting (1) // then moves by order where n = 1
    greeting(m = 3) // named parameters which means --> m = 3
    */
    val sum = add(3, 4)
    val sum2 = add(number1 = 3, number2 = 4)
    println(sum)
    println(sum2)
}