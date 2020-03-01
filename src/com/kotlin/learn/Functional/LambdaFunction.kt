/*
 ("lambdas") are a simple way to create functions ad-hoc. 
 Lambdas can be denoted very concisely in many cases 
 thanks to type inference and the implicit it variable.
 */

 fun main(args: Array<String>) {
     val upperCase1: (String) -> String = { str:String -> str.toUpperCase() } 

     val upperCase2: (String) -> String = { str -> str.toUpperCase() }

     val upperCase3 = { str:String -> str.toUpperCase() }
    //  val upperCase4 = { str -> str.toUpperCase() }

     val upperCase5:(String) -> String = { it.toUpperCase() }
     val upperCase6:(String) -> String = String::toUpperCase

     println(upperCase1)
     println(upperCase2)
     println(upperCase3)
    //  println(upperCase4)
     println(upperCase5)
     println(upperCase6)

 }