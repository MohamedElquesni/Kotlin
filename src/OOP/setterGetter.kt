package OOP

fun main() {
    val player1 = Player1(age = 33,team = "Liverpool")
    player1.name = "Mohamed Salah"
    println(player1.name)
}

class Player1(var age: Int, var team: String) {
    var name = ""
        get() {
            return "Player : $field"  // after getting from memory
        }
        set(value) {
            field = "Player : $value"  // before saving it to the memory
        }

    companion object

}