package Aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {

    val size: Int

    init {
        println("First init block")
    }

    constructor() : this(true, 9) {
        println("Running secondary constructor")
    }

    init {
        if (friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }

    init {
        println("3rd init block.. $volumeNeeded.. ${this.size}")
    }

}

fun makeDefaultFish() = Fish(true, 50)

fun fishExample() {
    val fish = Fish(true, 20)
    println("Is fish friendly? ${fish.friendly}. Volume needed = ${fish.size}")
}