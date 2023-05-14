import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    val balance2 = balance
    var sum = 0
    var input: Int
    while (scanner.hasNextInt()) {
        input = scanner.nextInt()
        sum = sum + input
        if (balance - input >= 0) {
            balance = balance - input
        } else {
            print("Error, insufficient funds for the purchase. Your balance is $balance, but you need $input.")
        }
    }
    val result = balance2 - sum
    if (scanner.hasNextInt() == false && result >= 0) print("Thank you for choosing us to manage your account! Your balance is $result.")
}