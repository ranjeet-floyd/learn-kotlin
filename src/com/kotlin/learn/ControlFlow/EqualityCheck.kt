// == for structual , === for referential

fun main(args: Array<String>) {
    val authors = setOf("A1", "A2", "A3")
    val writers = setOf("A3", "A2", "A1")

    println(authors==writers)
    //
    println(authors===writers)
}