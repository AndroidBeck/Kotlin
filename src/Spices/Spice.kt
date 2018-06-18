package Spices

fun main(args: Array<String>) {

}

abstract class Spice ( val name: String, open val spiciness: String = "mild"){

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

    abstract fun prepareSpice()

}

class Curry(override val spiciness: String): Spice("Curry", spiciness) {
    override fun prepareSpice() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}