package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    //Kotlin will call getter method even if it looks like we're calling gor the property directly
    println("width = ${myAquarium.width} \n" +
            "lenfth = ${myAquarium.length} \n" +
            "height = ${myAquarium.height}")

    myAquarium.height = 80
    println("new height = ${myAquarium.height}")
    println("volume = ${myAquarium.volume}")

}
