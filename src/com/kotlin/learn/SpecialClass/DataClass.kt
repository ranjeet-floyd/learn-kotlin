/*
    Defines a data class with the data modifier.
    Method toString is auto-generated, which makes println output look nice.
    Auto-generated equals considers two instances equal if all their properties are equal.
    Equal data class instances have equal hashCode().
    Auto-generated copy function makes it easy to create a new instance.
    When copying, you can change values of certain properties. copy accepts arguments in the same order as the class constructor.
    Use copy with named arguments to change the value despite of the properties order.
    Auto-generated componentN functions let you get the values of properties in the order of declaration.
 */
// Data classes use to store values.
data class User(val name:String, val id:Int)
fun main(args: Array<String>) {
    val user = User("Ranjeet", 1)
    println(user)

    val secondUser = User("Ranjeet", 1)
    val thirdUser = User("ThirdUser", 3)

    println("user==secondUser: ${user==secondUser}")
    println("user==thirdUser: ${user==thirdUser}")

    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

// Copy function
println(user.copy())
println(user.copy("ThirdUser")) // modified and copy
println(user.copy(id = 4)) // copy user and set id

// componentN function
// Auto-generated componentN functions let you get the values of properties in the order of declaration.
println("name :  ${user.component1()}")
println("id :  ${user.component2()}")


}

