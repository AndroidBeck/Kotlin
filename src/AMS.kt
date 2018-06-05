import java.time.MonthDay
import java.util.*

fun main(args: Array<String>) {

    println("${if (args[0].toInt() < 12) "Good Morning Kotlin" else "Good Night Kotlin"}")
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and we'll fishes with: $food")
}

fun fishFood(day: String): String {
    return when(day) {
        "Sunday" -> "pellets"
        "Monday" -> "small fish"
        "Wednesday" -> "crabs"
        "Friday" -> "weed"
        "Saturday" -> "plankton"
        else -> "Uncknown food"
    }
}

fun randomDay(): String {
    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}

fun dayOfWeek() {
    println("What day is it today?")
    var cal = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    var strDay: String = ""

    println("It's $strDay !")
}