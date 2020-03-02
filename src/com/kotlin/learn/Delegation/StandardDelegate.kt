/*  The Kotlin standard library contains a bunch of 
useful delegates, like 'lazy', 'observable', and others. 
You may use them as is. For example lazyis used for 
lazy initialization.
*/

class LazySample {
    init {
        println("Created")
    }
    val lazyStr : String by lazy { // blockingLazy()
        println("Computed !")
        "my Lazy"
    }
}

// storing properties in Map .. useful in JSON parsing
class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

fun main(args: Array<String>) {
    val sample = LazySample()
    println("lazyStr = ${sample.lazyStr}")
    println("= ${sample.lazyStr}")
    // 
    val user = User(mapOf(
        "name" to "Ranjeet Kumar",
        "age" to 30
    ))
    println("name = ${user.name}, age = ${user.age}")
}

