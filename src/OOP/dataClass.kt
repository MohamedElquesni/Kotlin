package OOP

fun main() {
    val player1 = Player("Mo salah", 33, "Liverpool")
    val player2= player1.copy(age = 34)
}

//data class allows us to use the copy function to copy the object to another class
data class Player(var name : String, var age : Int, var team : String) {

}