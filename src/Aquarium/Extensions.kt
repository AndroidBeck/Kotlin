package Aquarium

/**
 * Extension functions in Kotlin
 */

//Not Kotlin style
//fun String.hasSpaces(): Boolean {
//    val found: Char? = this.find {it == ' '}
//    return found != null
//}

//we dont need explicitly call 'this'
fun String.hasSpaces() = find {it == ' '} != null

fun extensionsExample() {
    "Does it have spaces?".hasSpaces()
}

open class AquariumPlant(val color: String, private val size: Int)
class GreenLeafyPlant(size: Int) : AquariumPlant("Green", size)

//We couldn't do it on size param because it's private
fun AquariumPlant.isRed() = color == "Red"

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun staticExample() {
    val plant = GreenLeafyPlant(50)
    plant.print()
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()
}

val AquariumPlant.isGreen: Boolean
    get() = color == "Green"

fun propertyExqample() {
    val plant = AquariumPlant("Green", 50)
    println(plant.isGreen)
}

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

fun nullableExtension() {
    val plant : AquariumPlant? = null
    plant.pull()
}

fun main(args: Array<String>) {
    staticExample()
    propertyExqample()
    nullableExtension()
}
