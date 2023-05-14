fun main() {
    val user = readLine()?.toInt()
    if (user != null) {
        if (user > 0) {
            println("YES")
        } else {
            println("NO")
        }
    }
}