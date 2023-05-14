fun main() {
    val n = readln().toInt()
    var sumA = 0
    var sumB = 0
    var sumC = 0
    var sumD = 0
    repeat(n) {
        val student = readln().toInt()
        sumA += if (student == 5) 1 else 0
        sumB += if (student == 4) 1 else 0
        sumC += if (student == 3) 1 else 0
        sumD += if (student == 2) 1 else 0
    }
    print("$sumD ")
    print("$sumC ")
    print("$sumB ")
    print("$sumA ")
}
// put your code here
