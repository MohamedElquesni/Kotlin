package Functions/*
lambda --> Anonymous function with no name

{ parameter1: Type, parameter2: Type -> body }   I am saying here that this function will take two parameters of type and return what is inside the body

 */

fun main() {
    /*
        val hello --> variable called hello
       :() -> Unit --> type function that takes nothing and return nothing
       = {println("Hello")} --> body of the function
    */
    val hello: () -> Unit = {println("Hello")}
    val hello2 = {println("Hello")}
    println(hello) // I am referring to the function only
    hello() // I am calling the function

    //--------------------------------------------------------------------------
    val greet = { name : String -> println("Hello $name")}
    //or
    val greet2: (String) -> Unit = {println("Hello $it")}

    greet("Ahmed")
    greet2("Ahmed")


    // Multiple parameters
    val multiply: (Int, Int) -> Int = {a, b -> a * b }
    val multiply2 = {a : Int, b : Int -> a * b}


}
