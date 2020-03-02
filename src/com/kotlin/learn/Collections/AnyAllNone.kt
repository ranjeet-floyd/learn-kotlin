//

fun main(args: Array<String>) {
    val numbers = listOf(1,-2,3,-4,5,-6)
    val anyNegative = numbers.any { it< 0 }
    val anyGT6 = numbers.any { it > 6 }

    println("Numbers :  $numbers")
    println("anyNegative :  $anyNegative")
    println("anyGT6 : $anyGT6")

    val allEven = numbers.all{it%2 == 0}

    val allLess6 = numbers.all{it < 6}

    println("allEven :  $allEven")
    println("allLess6: $allLess6")

    val allEven_ = numbers.none { it % 2 == 1}
    val allLess6_ = numbers.none { it > 6 }

    println("allEven : $allEven_")
    println("allLess6 : $allLess6_")
}