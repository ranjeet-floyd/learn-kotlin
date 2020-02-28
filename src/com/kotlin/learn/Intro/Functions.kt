package com.kotlin.learn

//https://play.kotlinlang.org/byExample/01_introduction/02_Functions
//Functions
// Default Parameters Values and Named Arguments

fun printMessage(message: String): Unit {
    println("Print Message : $message")
}

fun printMessageWithPrefix(message: String, prefix:String="Info"){
    println("[$prefix] $message")
}

fun sum(x:Int, y:Int) : Int {
    return x + y
}

fun multiply(x: Int, y:Int) = x * y

fun main(){
    printMessage("Hello Functions")
    printMessageWithPrefix("This is Log Message", "Info")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Debug", message = "This is Log Message")
    println(sum(1, 2))
    println(multiply(2, 5))
}
