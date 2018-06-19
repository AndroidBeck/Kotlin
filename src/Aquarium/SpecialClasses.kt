package Aquarium

object MobyDickWhale {
    val author = "Herman Melville"

    fun jump() {
        //...
    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

//can subclass sealed class only in this file..
// Kotlin knows staticly about all of the subclasses
sealed class Seal

class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String = when(seal) {
        is SeaLion -> "SeaLion"
        is Walrus -> "Walrus"
}
