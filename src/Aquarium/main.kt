package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    //Kotlin will call getter method even if it looks like we're calling gor the property directly
    println("length  = ${myAquarium.length} \n" +
            "width = ${myAquarium.width} \n" +
            "height = ${myAquarium.height}")

    myAquarium.height = 80
    println("new height = ${myAquarium.height}")
    println("volume = ${myAquarium.volume}")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium volume = ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Small Aquarium2 volume = ${myAquarium2.volume} \n" +
            "length  = ${myAquarium2.length} \n" +
            "width = ${myAquarium2.width} \n" +
            "height = ${myAquarium2.height}")
}
