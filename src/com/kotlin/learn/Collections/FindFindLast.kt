fun main(args: Array<String>) {
    val words = listOf("Lets", "find", "something", "in", 
        "collection", "find", "findlast")
    val first = words.find {it.startsWith("some")}
    val last = words.findLast {it.startsWith("some")}

    val nothing = words.find {it.contains("nothing")}

    println("The first word start with \"some\" is $first ")
    println("The last word start with \"some\" is $last ")
    println("The first word contaning \"nothing\" is ${nothing?.let {"\"$it\""} ?: "null"} ")

    // first \ last
    val first = words.first()
    val last = words.last()

    println("First Word :  $first")
    println("last Word :  $last")
    // firstOrNull , lastOrNull
    val firstOrNull = words.firstOrNull();
    val lastOrNull = words.lastOrNull();

    println("firstOrNull :  $firstOrNull")
    println("lastOrNull :   $lastOrNull")
    // count

    val count  = words.count()
    println("Count Words : $count")
}