package Variables

fun main() {
    val fname : String = "Mohamed"
    val lname : String = "Hazem"
    val letter : Char = 'c'
    println(fname[0])
    println(letter)

    println("First Name : " + fname + " Last Name : " + lname)
    // or
    println("First Name : $fname Last Name : $lname")
}