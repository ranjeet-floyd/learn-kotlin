package com.kotlin.learn

//Infix Functions
// Member functions and extensions with a single parameter can
// be turned info Infix Functions.

fun main(){
    infix fun Int.times(str: String)= str.repeat(this)
    println(2 times "Hello Infix !! ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other:String) = Pair(this, other)
    val myPair = "Mclaren" onto "Lucas"
    println(myPair)
    
    val sophia = Person("Sophia")
    val claudia = Person("Claudia")

    val likes  = sophia likes claudia
    println( likes)
    
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person): MutableList<Person> {
        likedPeople.add(other)
        return likedPeople
    }

}
