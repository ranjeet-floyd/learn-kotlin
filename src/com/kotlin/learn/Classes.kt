package com.kotlin.learn

class Customer

class Contact(val id: Int, var email:String)

fun main(){
    val customer = Customer()

    val contact = Contact(1, "test@gmail.com")

    println(contact.id)

    contact.email = "test2@gmail.com"

    println(contact.email)
}