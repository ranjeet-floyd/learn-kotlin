package com.kotlin.learn

// Variables types in Kotlin don't allow the
// assignment of null. If you nedd a variables that
// can be null, declare it nullable by adding ? at
// end of its type.
fun main() {

    var neverNull: String = "This can't be null"

//    neverNull = null

    var nullable: String? = "You can keep a null here"

    nullable = null

    var inferredNonNull = "The compiler assume non-null"

//    inferredNonNull = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    strLength(neverNull)
//    strLength(nullable)


    println(describeString("ThisIsNotEmpty"))

}

fun describeString(maybeString: String?): String {
    return if (maybeString != null && maybeString.length > 0) {
        "String of Lenght ${maybeString.length}"
    } else {
        "Empty or Null String"
    }
}
