// delegating properties calls of the property 
// set and get methids to a certain object.
// Delegate object should have the method 'getValue'
// For mutable properties 'setValue'
import kotlin.reflect.KProperty
class Example {
    var p: String by Delegate() // delegate prop to instance of class Delegate.

    override fun toString() = "Example class"

}

class Delegate {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thak you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop:KProperty<*>, value:String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.p)
    //e.p = "New"

    println(e)
}