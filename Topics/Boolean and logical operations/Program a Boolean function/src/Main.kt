fun main() {
    val x = readLine().toBoolean() // read other values in the same way
    val y = readLine().toBoolean()
    val z = readLine().toBoolean()
// write your code here
    val xyz = !(x && y) || z
    println(xyz)
}