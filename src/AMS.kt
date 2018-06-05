import java.util.*

fun main(args: Array<String>) {

    println("${if (args[0].toInt() < 12) "Good Morning Kotlin" else "Good Night Kotlin"}")
//    feedTheFish()
    println(fitMoreFish(10.0, listOf(3,3,3)))
    println(fitMoreFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(fitMoreFish(9.0, listOf(1,1,3), 3))
    println(fitMoreFish(10.0, listOf(), 7, true))
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
        else -> "Unknown food"
    }
}

fun randomDay(): String {
    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}

fun fitMoreFish(tankSize: Double,
                currentFish: List<Int>,
                fishSize: Int = 2,
                hasDecorations: Boolean = true) : Boolean {

    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)

//    var allFishSize : Int = 0
//    for (fish in currentFish) {
//        allFishSize += fish
//    }
//    var k = 1.0
//    if (hasDecorations) k = 0.8
//    return (tankSize * k >= allFishSize + fishSize)
}