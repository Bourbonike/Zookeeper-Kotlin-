fun main() {
    val user = readln().toInt()
    if (user < 0) {
        println("negative")
    }
    if (user > 0) {
        println("positive")
    }
    if (user == 0) {
        println("zero")
    }
}