// with is non-extension function that can access members of
// its argument concisely.

class Configuration(var host:String, var port:Int)

fun main(args: Array<String>) {
    val configuration = Configuration(host="localhost", port=9000)
    // print config
    with(configuration){
        println("$host:$port")
    }

    // instead of
    println("${configuration.host}:${configuration.port}")

}