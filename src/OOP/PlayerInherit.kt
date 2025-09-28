package OOP

open class Person(var name: String, var age: Int) {
    fun eat() {
        println("eating")
    }
}
class Doctor(name: String, age: Int, var company: String): Person(name, age) {

}
class Engineer(name: String, age: Int, var company: String) : Person(name, age){

}