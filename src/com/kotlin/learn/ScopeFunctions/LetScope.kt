// Let - Kotlin standard library function
// Used for Scoping and Null-checks
// access block by reference by 'it'
fun customPrint(s:String) { print(s.toUpperCase()) }


fun main(args: Array<String>) {
    val empty = "test".let {
        customPrint(it)
        it.isEmpty() // return 
    }
    println(" is empty: $empty")

    fun printNotNull(str:String?) {
        println("Printing \"$str\":")

        str?.let {
            print("\t")
            customPrint(it)
            println() //  return
        }
    }

    printNotNull(null)
    printNotNull("My String")
}