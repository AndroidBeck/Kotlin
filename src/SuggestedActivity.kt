fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy", "Cloudy", -1))
}

fun whatShouldIDoToday(mood :String, weather : String = "Sunny", temperature : Int = 24) : String {
    return when {
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        mood == "bad" && weather == "Rainy" -> "Do not get up"
        mood == "happy" && temperature < 0 -> "Go skiing!!!"
        else -> "Stay home and read."
    }
}
