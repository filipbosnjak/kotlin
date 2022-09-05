import `koltin-stdlib-methods`.StdlibMethods

fun main(args: Array<String>) {

    //Val constant - cannot be reassigned
    //Var - variable - can be reassigned

    val string: String = "first string"
    val string2: String = "second and $string"

    println("string $string2")
    println("2*2 = ${firstFun(2,2)}")

    val string3: String = 123.toString();
    val integer1: Int = "123".toInt()

    //Kotlin has no primitives

    //PAIRS

    val pair: Pair<Int, Int> = Pair(2,3);
    println("$pair")

    val stdlib:StdlibMethods = StdlibMethods()

    stdlib.callLetOnString()
}

fun firstFun(num1: Int, num2: Int): Int {
    return num1*num2
}