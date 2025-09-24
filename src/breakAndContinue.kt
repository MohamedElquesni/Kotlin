fun main() {
    // break
    for (item in 0..5) {
        println(item)
        if (item == 3) {
            break
        }
    }
    for (item in 0..5) {
        if (item == 3)
            continue
        println(item)
    }
}