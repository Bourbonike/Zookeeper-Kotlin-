fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val result = a >= b && a <= c || a <= b && a >= c
    println(result)
    // put your code here
}