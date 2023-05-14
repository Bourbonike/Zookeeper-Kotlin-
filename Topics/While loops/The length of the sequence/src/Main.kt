import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var sum = 0
    do {
        val number = scanner.nextInt()
        val sum1 = sum++
        if (number == 0) {
            println("$sum1")
        }
    } while (scanner.hasNextInt())
}
