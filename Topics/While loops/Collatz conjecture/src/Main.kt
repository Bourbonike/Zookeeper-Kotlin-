fun main() {
    var n = readln().toInt()
    print("$n ")
    do {
        if (n % 2 == 0) {
            n /= 2
        } else if (n == 1) {
            break
        } else {
            n = 3 * n + 1
        }
        print("$n ")
    } while (n > 1)
    // put your code here
}