fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy", "Cloudy", -1))
    println(whatShouldIDoToday(getMood()))
}

fun whatShouldIDoToday(mood : String, weather : String = getDefWeather(),
                       temperature : Int = getDefTemperature()) : String {

    return when {
        isHappySunny(mood, weather) -> "go for a walk"
        !isHappy(mood) && !isSunny(weather) -> "Do not get up"
        isHappy(mood) && temperature < 0 -> "Go skiing!!!"
        mood == "neutral" && !isSunny(weather) -> "Work a lot"
        weather == "Stormy" && temperature > 17 -> "Go kitesurfing"
        isHot(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}


fun isHappy(mood: String) = mood == "happy"
fun isSunny(weather: String) = weather =="Sunny"
fun isHappySunny(mood: String, weather: String) = isHappy(mood) && isSunny(weather)
fun isHot(temperature: Int) = temperature > 28

fun getDefTemperature(): Int {
    return 24
}

fun getDefWeather(): String {
    return "Sunny"
}

fun getMood(): String {
    print("Enter your mood: ")
    return readLine()!!.toString()
}
