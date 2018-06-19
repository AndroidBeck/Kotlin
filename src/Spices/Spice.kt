package Spices

fun main(args: Array<String>) {
    val curry = Curry("mild")
    println("${curry.prepareSpice()}")
    println("${curry.color}")

}

abstract class Spice (val name: String, val spiciness: String = "mild", color: SpiceColor):
        SpiceColor by color {

    override fun toString(): String = this.name

    abstract fun prepareSpice()

}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor: SpiceColor {
    override val color = "Yellow"
}

class Curry(spiciness: String, name: String = "Curry", color: SpiceColor = YellowSpiceColor):
        Spice(name, spiciness, color), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Grinding")
    }

}