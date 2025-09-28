package DataStructures

fun main() {
    val immList = listOf(1,2,3) // immutable (cannot be changed)
    //myList[1] = 10 won't work

    val  mList = mutableListOf(1,2,3) // mutable
    mList[1] = 10
    mList.add(4)

}