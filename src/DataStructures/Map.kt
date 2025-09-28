package DataStructures

fun main() {
    val mutMap = mutableMapOf(
        "Aly" to 25,
        "Ahmed" to 30
    )
    println(mutMap["Aly"])
    mutMap.put("Mohamed", 35)
}