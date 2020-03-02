// Destructuring Declarations

fun findMinMax(list: List<Int>) : Pair<Int,Int> {
    return Pair(50, 100)
}

fun main(args: Array<String>) {
    val (x, y, z) =arrayOf(5,10,15)

    println("x : $x , y : $y and z : $z")

    val map = mapOf("Alice" to 21, "Bob" to 25)

    for ((name, age) in map) {
        println("$name is $age year old.")
    }

    val (min, max) = findMinMax(listOf(100, 90, 80))

    println("min : $min and max : $max ")
}