package Aquarium

const val rocks = 3
val number = 5
const val num = 5

const val CONSTANT = "top-level constant"

object Constants {
    const val CONSTANT2 = "object constant"
}

val foo = Constants.CONSTANT2

class myClass {
    companion object {
        const val CONSTANT3 = "constant inside companion"
    }
}