// 

fun main(args: Array<String>) {
    val numbers = listOf(1,-2,8,-4,5)
    val tripled = numbers.flatMap{listOf(it,it,it)}

    println("Tripled : $tripled")
    val min = numbers.min()
    val max = numbers.max()
    println(" Ele  Min: $min and Max : $max")
    // sorted

    val naturalSorted = numbers.sorted()
    val inverted = numbers.sortedBy{-it}
    println("natural Sorted : $naturalSorted")
    println("inverted : $inverted")

}