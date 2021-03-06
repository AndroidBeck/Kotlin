
fun main(args: Array<String>) {
    for (i in 1..10) {
        var fortune = getFortuneCookie()
        println("Your fortune is: ${fortune}")
        if (fortune.contains("Take it easy ")) break

    }
}

fun getFortuneCookie() : String {
    val listOfFortunes: List<String> = listOf(
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")

    print("Enter you birthday: ")
    var birthday = readLine()!!.toIntOrNull() ?: 1
    return listOfFortunes[birthday%listOfFortunes.size]
}

