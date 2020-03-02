fun main(args: Array<String>) {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val doubled = numbers.map{x -> x*2}
    val tripled = numbers.map{it*3}

    println("Numbers :  $numbers")
    println("Doubled: $doubled")
}