import java.time.LocalDate

fun main(args: Array<String>) {
    val list = listOf("a", "b" ,"c")

    for (s in list) {
      //println(s)
    }

    val list2 = listOf("one", "two", "three")

    for ((index, element) in list2.withIndex()) {
        println("$index, $element")
    }

    //for (i in 1..9) included 1, until -> excluded
    // 9 downTo 1 step 2

    fun isLetter(c: Char): Boolean = c in 'a'..'z' || c in 'A'..'Z'
    fun notDigit(c: Char): Boolean = c !in '0'..'9'

    val now = LocalDate.now()
    val startDate = now.minusDays(2)
    val endDate = now.plusDays(3)

    if (now in startDate..endDate) {
        println(now)
        println(startDate.dayOfWeek)
        println(endDate)
    }

    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
 }

fun isValidIdentifier(s: String): Boolean {
    /*
    item.isEmpty() checks only the length of the string
    item.isBlank() checks the length and that all the chars are whitespaces
    */
    if (s.isBlank()) return false
    val bool1 =  s.first() in 'a'..'z' || s.first() in 'A'..'Z' || s.first() == '_'
    var bool2 = true

    for (i in 1..s.length-1) {
        bool2 = s[i] in 'a'..'z' || s[i] in 'A'..'Z' || s[i] in '0'..'9' || s[i] == '_'
    }
    return bool1 && bool2
}