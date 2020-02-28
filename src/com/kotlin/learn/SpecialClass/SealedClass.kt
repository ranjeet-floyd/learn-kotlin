// Sealed class restrict use of inheritance.

sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)

class Human(val humanName: String, val job:String): Mammal(humanName)

fun greetMammal(mammal:Mammal): String {
    when(mammal) {
        is Human -> return "Hello ${mammal.name}; You are working as a ${mammal.job}"
        is Cat ->  return "Hello ${mammal.name}"
    }

}

fun main(args: Array<String>) {
    println(greetMammal(Human("Ranjeet", "Engineer")))
    println(greetMammal(Cat("Cat")))
}

