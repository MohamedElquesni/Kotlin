package DataStructures

fun main() {
    val imutSet = setOf(1, 2, 2, 2, 3, 3, 3)
    val mutSet = mutableSetOf(1, 2, 3, 3, 4, 4, 4)
    //imutSet.add(4) -> will not work
    mutSet.add(454)

}