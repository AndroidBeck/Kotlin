package Aquarium

class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40){

    var volume: Int
        get() = length * width * height / 1000
        set(value) {height = value * 1000 / (length * width)}

    var water = volume * 0.9

    constructor(numberOfFish: Int): this() {
        val water: Int = numberOfFish * 2000 //cm3
        val tank: Double = 1.1 * water
        height = (tank / (length * width)).toInt()

    }
}