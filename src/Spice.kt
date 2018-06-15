class SimpleSpice {

    val name: String = "curry"
    private val spicyLevel: String = "mild"
    val heat: Int
        get() = when (spicyLevel) {
            "mild" -> 5
            else -> 0
        }
}

class Spice (val name: String, val spiciness: String = "mild" ){

    val heat: Int
        get() = when(spiciness) {
            "mild" -> 1
            "spicy" -> 2
            "hot" -> 3
            "very hot" -> 4
            "super hot" -> 5
            else -> 0
        }

    init {
        println("Spice $name created. Heat = $heat")
    }

    override fun toString(): String {
        return this.name
    }

}


fun makeSalt(): Spice = Spice("salt")

fun main(args: Array<String>) {
    var spice1 = SimpleSpice()
    println("Name = ${spice1.name} Heat = ${spice1.heat}")

    var spiceList = listOf<Spice>( Spice("paprika", "very hot"),
            makeSalt(),
            Spice("old spice", "spicy"),
            Spice("pepper", "hot"),
            Spice("red hot chilly pepper", "super hot") )
    var spice2 = Spice("flowers")
    var notSpicySpiceList = spiceList.filter { it.heat < 3 }
    println("List of not spicy spicies: ${notSpicySpiceList.toString()}")
    var salt = makeSalt()

}



