package Aquarium5

data class Fish(var name: String)

fun main(args: Array<String>) {
    fishExamples()
}

fun fishExamples() {
    val fish = Fish("splashy")

    //Higher order funs
    /*with(fish.name) {
        //this.capitalize() - this is implicit so
        capitalize()
    } */
    myWith(fish.name) {
        println(capitalize())
    }
    //Run returns result of the lambda
    println(fish.run {name})
    //Apply returns (fish) object after applying the lambda
    println(fish.apply {  })

    val fish2: Fish = Fish(name = "splashy").apply { name = "Sharky" }
    println(fish2.name)

    println( fish.let { it.name.capitalize() }
            .let { it + "fish" }
            .let { it.length }
            .let { it + 31 } )
}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()

}
