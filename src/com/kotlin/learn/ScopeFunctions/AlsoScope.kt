// also works like 'apply'
// object refer as 'it' so it is easier to pass as an
// argument. This function is handy for embedding additional 
// actions, such as logging.

data class Person(var name:String, var age:Int, var about:String) {
    constructor() : this("", 0, "")
}

fun writeCreatingLog(p:Person) = println("A new person ${p.name} was created.")


fun main(args: Array<String>) {
    val jake = Person("Jake", 30, "Kotlin Developer")
    .also { // log and return same object.
        writeCreatingLog(it)
    }  

    println("$jake")
}