package com.kotlin.learn


fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "This is function operator"
    println(str[0..10])

//    Functions with vararg Parameters

    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }

    printAll("Hello", "Hallo", "Salut", "Halo")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }

    printAllWithPrefix("Hello", "Vararg", "World", prefix = "Info ")


    fun log(vararg entries: String) {
        printAll(*entries)
    }


}