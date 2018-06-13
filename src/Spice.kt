class SimpleSpice {

    val name: String = "curry"
    private val spicyLevel: String = "mild"
    val heat: Int
        get() = when (spicyLevel) {
            "mild" -> 5
            else -> 0
        }
}

fun main(args: Array<String>) {
    var spice1 = SimpleSpice()
    println("Name = ${spice1.name} Heat = ${spice1.heat}")
}



