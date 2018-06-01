import java.time.MonthDay
import java.util.*

fun main(args: Array<String>) {
    dayOfWeek()
}

fun dayOfWeek() {
    print("What day is it today?")
    var cal = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    var strDay: String = ""
    when(cal) {
        1 -> strDay = "Sunday"
        2 -> strDay = "Monday"
        3 -> strDay = "Tuesday"
        4 -> strDay = "Wensday"
        5 -> strDay = "Thursday"
        6 -> strDay = "Friday"
        7 -> strDay = "Saurday"
        else -> strDay = "Uncknown day"
    }
    println("It's $strDay !")
}