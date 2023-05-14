fun main() {
    val invitation = readLine().toBoolean() // read other value in the same way
    val gift = readLine().toBoolean()// write your code here
    val enter = invitation && gift
    println(enter)
}