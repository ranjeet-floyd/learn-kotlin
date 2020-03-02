// Zip
fun main(args: Array<String>) {
    val A = listOf("a","b", "c")
    val B = listOf(1,2,3,4)

    val resultPair = A zip B // infix notation
    val resultReduce = A.zip(B) {a,b -> "$a$b"}

    println("ResultPair : $resultPair")
    println("ResultReduce : $resultReduce")

    // getOrElse
    println(A.getOrElse(1) {42})
    println(A.getOrElse(100) {100})
}