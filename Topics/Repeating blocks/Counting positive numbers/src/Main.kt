fun main() {
    val n = readln().toInt()
    var sum = 0
    repeat(n) {
        val pol = readln().toInt()
        sum += if (pol > 0) 1 else 0
    }
    print(sum)
}