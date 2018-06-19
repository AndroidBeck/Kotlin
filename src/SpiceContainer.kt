

data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}

fun main(args: Array<String>) {
    val spiceCabinet = listOf(
            SpiceContainer(Spice("curry", "mild")),
            SpiceContainer(Spice("pepper", "hot")),
            SpiceContainer(Spice("salt", "mild")) )

    for (element in spiceCabinet) println(element.label)

}