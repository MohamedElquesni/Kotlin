package Functions

fun main() {
    fun repeatAction(times: Int, action: () -> Unit) {
        for (i in 1..times) {
            action()   // run the lambda
        }
    }
    //repeat(3, {println("Hello")
    repeatAction(3, { println("Hello") }) //pass the lambda expression directly
    repeatAction(3) {println("Hello")}  //since the last parameter it is expecting is lambda you can pass it like that
    repeatAction(3, {sayHello()}) //pass the lambda expression containing another function
    repeatAction(3, ::sayHello) //pass the function by reference
}
fun sayHello() {
    println("Hello")
}
