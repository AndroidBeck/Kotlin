import java.util.*

fun main(args: Array<String>) {

    val rollDice = {Random().nextInt(12) + 1}

    val rollDice2 = {numSides : Int -> Random().nextInt(numSides) + 1}

    val rollDice3 = {numSides : Int -> if (numSides == 0) 0
        else Random().nextInt(numSides) + 1}

    val rollDice4: (Int) -> Int = {numSides -> if (numSides == 0) 0
    else Random().nextInt(numSides) + 1}

    println(rollDice)
    println(rollDice2(7))
    println(rollDice2(8))
    println(rollDice3(0))
    println(rollDice4(0))

    gamePlay(rollDice4(12))
}

fun gamePlay(roll: Int) {
    println(roll)
}