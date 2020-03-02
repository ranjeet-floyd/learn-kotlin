// A List of Ordered collection of Items.

// MutableList or List -> standard libray mutableListOf
//and listOf    

val systemUsers: MutableList<Int> = mutableListOf(1,2,3)
val sudoers: List<Int> = systemUsers

fun addSudoer(newUser:Int){
    systemUsers.add(newUser)
}

fun getSudos() = sudoers

fun main(args: Array<String>) {
    addSudoer(4)
    println("Total sudoers: ${getSudos().size}")
    
}