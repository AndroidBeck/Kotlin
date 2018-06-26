import java.util.*

fun main(args: Array<String>) {

//    println( 2.plus(71).plus(233).minus(13).div(30).plus(1) )
//
//    var list: List<Int?> = listOf(null, null)
//    var list2:List<Int>? = null
//
//    //Elvis operator
//    var nullTest2: Int? = null //1
//    println(nullTest2?.inc() ?: 0)
//
//    val trout = "trout"
//    var haddock = "haddock"
//    var snapper = "snapper"
//    println("I like to eat $trout and $snapper, but not a big fan of $haddock.")
//
//    print("Enter fish name: ")
//    var fishName =  readLine()
//    println ( when(fishName?.length ?: 0){
//        0 -> "Fish name cannot be empty"
//        in 3..12 -> "Good fish name"
//        else -> "OK fish name"
//    } )
//
//    var list3 : MutableList<Int> = mutableListOf()
//    for (i in 0..100 step 7) list3.add(i)
//    print(list3)
//
//    var list1: MutableList<String> = mutableListOf()
//    for (i in 11..15) {
//        list1.add(i.toString())
//    }
//    println(list1)
//
//    dayOfWeek()
//
//    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
//    val sorted = spices.sortedBy { it.length }
//    println(sorted)
//
//    val filtered = spices.filter { it[0] == 'c' && it[it.length-1] == 'e' }
//    println(filtered)
//    val filtered2 = spices.filter{it.startsWith('c')}.filter{it.endsWith('e')}
//    println(filtered2)

//    Pairs

//    val equipment = "fishnet" to "catching fish" to "of big size" to "and strong"
//    println(equipment)
//    println("${equipment.first} \n ${equipment.first.first} \n${equipment.second}")

//    val equip = ("fishnet" to "catching fish") to ("of big size" to "and strong")
//    println(equip)
//    println("${equip.first} \n ${equip.first.first} \n${equip.second}")

//    val fishnet = "fishnet" to "catching fish"
//    val (tool, use) = fishnet
//    println("The $tool is a tool to $use")
//    println(fishnet.toString())
//    println(fishnet.toList())


}

fun dayOfWeek() {
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}

