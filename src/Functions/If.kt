package Functions

fun main() {
    val isCold = false

    if (isCold) {
        println("Wear")
    }
    else {
        println("Do not Wear")
    }

    //
    var acValue : Int = if (isCold) {
                30
                //will always take the last Integer here
            } else {
                20
            }
}