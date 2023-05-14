fun main() {
    val n = readln().toInt()
    val numbers: MutableList<Int> = mutableListOf()
    repeat(n) {
        val next = readln().toInt()
        if (next % 4 == 0) {
            numbers += next
        }
    }
    var largestElement = numbers[0]
    for (number in numbers) {
        if (largestElement < number) {
            largestElement = number
        }
    }
    println(largestElement)
}
// put your code here
