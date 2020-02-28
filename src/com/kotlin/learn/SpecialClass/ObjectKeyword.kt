import  java.util.Random
class  LuckDispatcher {
   fun  getNumber(){
       var obj = Random()
       println(obj.nextInt(900))
   }
}

// Object Expression

fun rentPrice(standardDays:Int, festivityDays:Int, specialDays:Int){
    val dayRate = object {
        var standard : Int = 30*standardDays
        var festivity: Int = 50*festivityDays
        var special: Int = 100*specialDays
    }

    var total = dayRate.standard + dayRate.festivity + dayRate.special
    println("Total price : $$total")
}

fun main(args: Array<String>) {
    val d1 = LuckDispatcher()
    d1.getNumber()
    // Object Exression
    rentPrice(10, 2, 1)

}