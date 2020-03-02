// partition split the collection 

fun main(args: Array<String>) {
    val numbers = listOf(1,-2,3,-4,5)
    val evenOdd = numbers.partition{it % 2 == 0 }
    val (positives,  negatives) = numbers.partition{it > 0}

    println("Numbers :  $numbers")
    println("Even Numbers :  ${evenOdd.first}")
    println("Odd Numbers :  ${evenOdd.second}")

    println("Positive Numbers : $positives")
    println("Negative Numbers : $negatives")
}