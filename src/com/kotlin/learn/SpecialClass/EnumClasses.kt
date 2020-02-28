/* Enum classes  are used to model types that 
represent a finite set of distinct values, 
such as directions, states, modes, and so forth.
 */
enum class State {
    IDLE, RUNNING, FINISHED
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb==RED.rgb)
}

fun main(args: Array<String>) {
    val state = State.RUNNING
    val message = when(state) {
        State.IDLE -> "System is Idle"
        State.RUNNING -> "System is Running"
        State.FINISHED -> "System is Finished"
    }
    println(message)
    // color
    val color = Color.RED
    println(color)

    println(color.containsRed())
    println(Color.BLUE.containsRed())

}