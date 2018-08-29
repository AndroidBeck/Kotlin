enum class Directions() {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game() {
    var path: MutableList<Directions> = mutableListOf(Directions.START)

}