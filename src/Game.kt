enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game {
    var path: MutableList<Directions> = mutableListOf(Directions.START)
    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }
    val end = { path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false }

    /* higher-order function - is a function that takes functions as an argument. */

    //Declaring a function that takes a lambda as its argument:
    fun move(where: () -> Boolean) {
        where.invoke()
    }

    fun makeMove(command: String?) {
        when (command){
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

fun main(args: Array<String>) {
    val game = Game()

    while (true) {
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
    }

    println(game.path)
}

