import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var sum = 0
    while (scanner.hasNextInt()) {
        val number = scanner.nextInt()
        if (number > sum) {
            sum = number
        }
        if (number == 0) {
            println("$sum")
            return
        }
    }
}