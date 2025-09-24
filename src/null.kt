fun main() {
    var default : Int = 5
    val nul : Int? = null
    val nullable :Int? = 5
    /*
    num = null will fail in kotlin
    why ?
    kotlin enforces null safety which does not allow
       variables to be null by default
    Solution --> apply ? after the variable type
     */
    println(default)

    // !! --> the variable will never be null
    println(nullable!!.toLong())

    // ?. --> if null do not apply the function
    println(nul?.toLong())

    // assign to a value if the variable pointing at is null
    val assignIfNotNull = nul ?: 5
    println(assignIfNotNull.toLong())
}