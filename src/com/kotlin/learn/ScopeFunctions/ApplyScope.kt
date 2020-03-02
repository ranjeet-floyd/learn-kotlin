// Apply scope function.. execute a block of code
// on an object and return the object itself.
// Inside block refer by 'this' and handy for init objects.

data class Person(var name:String, var age:Int, var about:String){
   constructor(): this("", 0, "")
}
fun main(args: Array<String>) {
    val jake = Person()
    val stringDesc = jake.apply{
        name = "jake"
        age= 30
        about = "Kotlin developer"
    }.toString()
println(stringDesc)

}



