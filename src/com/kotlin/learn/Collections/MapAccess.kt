// 
fun main(args: Array<String>) {
    val map = mapOf("key" to 42)
    val value1 = map["key"]
    val  value2 = map["key2"]
    val value3:Int = map.getValue("key")

    println("value1 : $value1 , value2 : $value2, value3 : $value3")

    val mapWithDefault = map.withDefault { k -> k.length}
    val value4 = mapWithDefault.getValue("key2")

    println("Value with Default value4 : $value4")

    try {
        map.getValue("anotherKey")
    }
    catch(e:NoSuchElementException) {
        println("Message : $e")
    }
}