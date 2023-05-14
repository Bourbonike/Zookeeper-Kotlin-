fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    val todaySecondsAll = totalSeconds % (60 * 60 * 24)
    val hours = todaySecondsAll / 3600
    val minutes = totalSeconds % 3600 / 60
    val seconds = totalSeconds % 3600 % 60
    println("$hours:$minutes:$seconds")
}
// $hours:$minutes:$seconds