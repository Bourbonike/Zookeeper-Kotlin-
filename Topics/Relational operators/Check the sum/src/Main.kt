fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val result = (a + b) == 20 || (a + c) == 20 || (b + c) == 20
    println(result)

    // put your code here
}