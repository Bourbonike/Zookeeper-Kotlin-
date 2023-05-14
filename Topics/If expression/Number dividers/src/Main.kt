fun main() {
    val user = readln().toInt()
    val list = mutableListOf(2, 3, 5, 6)
    list.forEach {
        if (user % it == 0) {
            println("Divided by $it")
        }
    }
    // put your code here
}
