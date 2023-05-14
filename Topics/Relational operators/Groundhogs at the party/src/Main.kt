fun main() {
    val res = readln().toInt()
    val week = readln().toBoolean()
    val result: Boolean = (10 <= res && res <= 20) && !week) || (15 <= res && res <= 25) && week)
    println(result)
    // write your code here
}