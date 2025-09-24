fun main() {
    val isCold = false

    val acValue : Int = when (isCold) {
        true -> 20
        else -> 40
    }

    when (acValue) {
        20 -> println("Closing AC")
        30,40 -> println("Opening AC")
    }
}