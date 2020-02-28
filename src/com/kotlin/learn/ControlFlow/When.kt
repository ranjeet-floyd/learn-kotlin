// When instead of the widely used switch statement.

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases("hello")
    cases(MyClass())
    //
    println("When Expression !!")
    println(whenAssign("Hello"))
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

class MyClass

// When expression
fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "One"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}
