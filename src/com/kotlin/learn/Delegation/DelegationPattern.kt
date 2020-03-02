// Delegation pattern
/*
 Kotlin supports easy implementation of the delegation pattern 
 on the native level without any boilerplate code.
 */

 interface SoundBehavior {
     fun makeSound() 
 }

 class ScreamBehavior(val n:String): SoundBehavior {
     override fun makeSound() =  println("${n.toUpperCase()} !!!")
 }

 class RockAndRollBehavior(val n:String): SoundBehavior {
     override fun makeSound() = println("Rock and Roll : $n")
 }

// Tom Araya is the "singer" of Slayer
// The delegate object by 'by' keyword.
 class TomAraya(n:String): SoundBehavior by ScreamBehavior(n)

 // Elvis Rock and Roll
 class ElvisPresley(n:String) : SoundBehavior by RockAndRollBehavior(n)

 fun main(args: Array<String>) {
     val tomAraya = TomAraya("Thrash Metal")
     tomAraya.makeSound()
     // ... 
     val elvisPresley = ElvisPresley("Dancing to Jailhouse Rock.")
     elvisPresley.makeSound()
 }