package Aquarium

fun labels() {
     for (i: Int in 1..100) {
         loop@ for (j in 1..20) {
            if (i * j > 100) break@loop
            println("test: $i $j")
        }
    }
}

fun main(args: Array<String>) {
    labels()
}