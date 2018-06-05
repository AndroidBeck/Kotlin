fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        var day = getBirthday()
        fortune = getFortune(day)
        println("\nYour fortune for $day is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getFortune(birthday: Int): String {
    return when(birthday) {
        in 1..10 -> "Wreck a pegleg!"
        in 12..15, 19 -> "Take it easy"
        in 20..30 -> "Nice day to you sir!"
        else -> "Get luck!"
    }
}

fun getBirthday(): Int {
    print("Enter your B-day: ")
    return readLine()?.toIntOrNull() ?: 1
}
