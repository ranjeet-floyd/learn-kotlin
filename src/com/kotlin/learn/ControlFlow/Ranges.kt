// Ranges

fun main(args: Array<String>) {
    for (i in 0..3) {
        print(i)
    }

    println("")

    for(i in 2..8 step 2){
        print(i)
    }

    println(" ")

    for(i in 3 downTo 0) {
        print(i)
    }
    println("")

    // char ranges
    for(c in 'a'..'d'){
        print(c)
    }
    println("")


    for(c in 'z' downTo 's' step 2){
        print(c)
    }
    println(" ")

//
val x =2

if(x in 1..5){
    print("x in range of 1 to 5")
}


}