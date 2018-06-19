package Spices

fun main(args: Array<String>) {
    val curry = Curry("mild")
    println("${curry.prepareSpice()}")
    println("${curry.color}")

}

//Making Spice a sealed class helps keep all the spices together in one file.
abstract sealed class Spice (val name: String, val spiciness: String = "mild", color: SpiceColor):
        SpiceColor by color {

    override fun toString(): String = this.name

    abstract fun prepareSpice()

}

interface Grinder {
    fun grind()
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor: SpiceColor {
    override val color = Color.YELLOW
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