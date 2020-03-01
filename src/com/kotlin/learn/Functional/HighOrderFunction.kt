/* High Order function.
    is a function that takes another function as parameter 
    and/or returns a function.
*/

// taking functions as parameters
fun calculate(x:Int, y:Int, operation:(Int, Int) -> Int):Int {
    return operation(x, y)
}

fun sum(x:Int, y:Int) = x + y

// returning function
fun operation() : (Int) -> Int {
    return ::square
}

fun square(x:Int) = x * x


fun main(args: Array<String>) {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 6, {a, b -> a * b})
    println("Sum Result : $sumResult , Mul Result : $mulResult")
    //
    val func = operation() // return square function
    println("Square of 3 : ${func(3)}")
}


