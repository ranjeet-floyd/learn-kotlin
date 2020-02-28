package com.kotlin.learn

//

class Mutable<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString(): String {
        return "MutableStack(${elements.joinToString()})"
    }
}

fun <E> mutableStackOf(vararg elements: E) = Mutable(*elements)

fun main() {
    val list = Mutable<String>()
    list.push("Push Test")
    list.push("Push Test 2")

    println(list)

    val stack = mutableStackOf(1,2,3,4,5)
    println(stack)
}