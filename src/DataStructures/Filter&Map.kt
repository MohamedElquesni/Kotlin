package DataStructures

import OOP.Player

fun main() {
    val player1 = Player("Mohamed Salah", 33, "Liverpool")
    val player2 = Player("Cristiano Ronaldo", 39, "Al Nassr")
    val player3 = Player("Lionel Messi", 37, "Inter Miami")
    val player4 = Player("Kylian Mbappé", 26, "Real Madrid")
    val player5 = Player("Kevin De Bruyne", 34, "Manchester City")

    val players = listOf(player1, player2, player3, player4, player5)
    val liverpoolPlayers = players.filter{
        it.team == "Liverpool"
    }
    // filter the object on the true condition variable

    // maps the Object to the returned lambda expression
    val playersNames = players.map {
        it.name
    }
    println(liverpoolPlayers)
}
