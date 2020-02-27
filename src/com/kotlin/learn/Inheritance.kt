package com.kotlin.learn

// Kotlin fully support the traditional object
// oriented inheritance

open class Dog {
    open fun sayHello() {
        println("Wow Wow!")
    }
}

// The empty parentheses () indicate an invocation of the superclass default constructor.
class Doggy : Dog() {
    override fun sayHello() {
        println("Wif Wif Doggy")
    }
}


// Inheritance with parameterized consss
open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says grrhh !")
    }
}

class SiberianTiger : Tiger("Siberia")


// Passing Constructor Args to Superclass

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name , the lion from $origin")
    }
}

class AsianLion(name: String) : Lion(name = name, origin = "India")

fun main() {
    val dog: Dog = Doggy()
    dog.sayHello()
    //

    val tiger = SiberianTiger()
    tiger.sayHello()

    //
    val lion = AsianLion("Super")
    lion.sayHello()
}