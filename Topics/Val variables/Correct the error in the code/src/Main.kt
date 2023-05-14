const val CONST = 3_000
fun main() {

    val numberLists = mutableListOf(1, 2, 3, 4, 5)
    for (num in numberLists) {
        num *= CONST
    }
    println(numberLists)
}