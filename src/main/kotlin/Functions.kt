
fun main(args: Array<String>) {
    functionThatReturnsVoid()
    functionWithDefaultParam()

    println("response to 'n':  ${respondToInput("n")}")
    println("compare: 1,5: ${compareSets(1,5)}")
}

fun functionThatReturnsVoid() {
    println("hello from void/Unit")
}

fun functionWithDefaultParam(string: String = "default") {
    println(string)
}

fun respondToInput(input: String) = when (input) {
    "y", "yes" -> "returns yes"
    "n", "no" -> "returns no"
    else -> "Dont understand"
}

fun compareSets(i: Int, j:Int): String = when (val set:Set<Int> = crateSet(i,j) /*setOf(i,j)*/ ) {
    setOf(1,1) -> "(${set.iterator().next()},2)"
    setOf(2,2) -> "(4,4)"
    else -> "($i,$j)"
}

fun crateSet(x:Int,y:Int): Set<Int> {
    return setOf(x,y)
}

/*

checking if instance of

fun checkClass(object) = when(object) {
    is Class1 -> ...
    is Class2 -> ...
}

* */