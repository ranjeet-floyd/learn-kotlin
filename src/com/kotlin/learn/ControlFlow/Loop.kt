fun main(args: Array<String>) {
    // support loops :  for, while, do-while

    // for
    val cakes = listOf("Carror", "Cheese", "Chocolate")

    for (cake in cakes) {
        println("Yummy, its a $cake cake !")
    }

    // while and do-while
    var cakesEaten = 0 
    var cakesBaked = 0

    while(cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }
    // do-while
    do {

        bakeACake()
        cakesBaked++
    } while(cakesBaked < cakesEaten)
    
    // iterators

    val zoo = Zoo(listOf(Animal("Zebra"), Animal("Lion")))

    for(animal in zoo) {
        println("Watch out, its a ${animal.name}")
    }
     
}

fun eatACake() = println("Eat a Cake")

fun bakeACake() = println("Bake a Cake")

// Iterators

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}
