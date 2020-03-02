// run scope function ... 

fun main(args: Array<String>) {
    fun getNullableLength(ns:String?) {
        println("For \"ns\":")
        ns?.run {
            println("\t is empty = " + this.isEmpty())
            println("\t length = ${this.length}")
            length // return .. last expression 
        }
    }

    getNullableLength(null)
    getNullableLength("")
    getNullableLength("Some String with Kotlin")
}