package Aquarium

class Aquarium {
    var width: Int = 20
    var length: Int = 100
    var height: Int = 40

    var volume: Int
        get() = width * length * height / 1000
        set(value) {value * 1000 / (width * length)}
}