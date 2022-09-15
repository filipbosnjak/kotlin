class Properties (val width: Int, val height: Int) {
    var mutableProperty: String = "asda"
    val immutableProperty: String = "immutable"

    //Area Property
/*    var area: Int
        get() = width * height
        //set(width: Int) = this.mutableProperty = width*/
}

fun main(args: Array<String>) {
    val prop: Properties = Properties(2,2)
    println(prop.mutableProperty)

    prop.mutableProperty = "new"
    //prop.immutableProperty = "asd" error
    println(prop.mutableProperty)
    println(prop.height)
}