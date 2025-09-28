package Variables

fun main() {
    val byteNum: Byte = 127      // range: -128 to 127      cannot be automated
    val shortNum: Short = 32     // range: -32,768 to 32,767  cannot be automated
    val intNum: Int = 32       // range: -2,147,483,648 to 2,147,483,647 can be automated
    val longNum: Long = 32L      // L suffix for Long literal can be automated

    println("Byte: $byteNum")
    println("Short: $shortNum")
    println("Int: $intNum")
    println("Long: $longNum")
}
