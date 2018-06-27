package Aquarium

fun main(args: Array<String>) {
    val symptoms: MutableList<String> = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")
    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    println(symptoms.contains("red"))
    println(symptoms.contains("red spots"))
    println(symptoms.subList(4,symptoms.size))
    println("1 +5 +3 = ${listOf(1,5,3).sum()}")
    println("Number of letters: ${listOf("a", "bb", "ccc").sumBy { it.length }}")

    val cures: Map<String, String> = mapOf("white spots" to "Ich", "red spots" to "hole disease",
            "not eating" to "force feeding", "bloated" to "call for the doctor", "belly up" to "It's too late..")
    println(cures.get("white spots"))
    println(cures["white spots"])
    println(cures.getOrDefault("bloating", "Sorry, I don't know"))
    cures.getOrElse("bloating") {"No cure for this"}

    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrabber", 3)
    inventory.remove("fish net")
    println(inventory)

}