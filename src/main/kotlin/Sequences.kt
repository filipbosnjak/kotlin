fun main(args: Array<String>){

    //Sequences - equivalent to java streams
    val sequence = listOf(1,2,3).asSequence()

    sequence.map { it * it }.filter { it >= 2 }
    //With regular collections these operations produce new collections

    println(sequence.toList())
}