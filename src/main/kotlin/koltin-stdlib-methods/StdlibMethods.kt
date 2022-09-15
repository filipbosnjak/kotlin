package `koltin-stdlib-methods`

class StdlibMethods {


    var string1: String = "hello from spec methods"

    /** Decl of nullable string */
    var nullString: String? = "null"

    fun callLetOnString(){

        /**Let - let takes the object it is invoked upon as the parameter and returns the result of the lambda expression*/
        string1.let { letK -> println(letK) }.let { outer -> println("inner nested:  $outer") }

        nullString = "not null"

        /** Let can be useful for nullable properties - will execute if nullString is not null
         * Checks if the nullString is null and executes let only if it's not*/
        nullString?.let { println("$it -> printed cause not null") }

    }

    fun callRunOnString() {

        /**Run - Similar to the let function, the run function also returns the last statement. - does not support it keyword*/

        string1 = run{
            val newString1 = "new string 1"
            println("run: $newString1")

            //Return statement
            newString1
        }
    }

    var string2: String = "asd"
}