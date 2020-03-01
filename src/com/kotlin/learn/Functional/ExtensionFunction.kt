// Extension Functions and Properties
// Kotlin lets you add new members to any class with the extensions mechanism.
data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxBy {it.price}?.price ?: 0F

fun Order.maxPricedItemName() = this.items.maxBy {it.price}?.name ?: "NO_PRODUCTS"

fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"

val Order.commaDelimitedItemNames: String
    get() = items.map {it.name}.joinToString()

fun main(args: Array<String>) {
    val order = Order(listOf(Item("Bread", 25.0F),Item("Wine", 29.0F), Item("Water",12.0F) ))
    println("Max Priced Item name : ${order.maxPricedItemName()}")
    println("Max Priced Item Value : ${order.maxPricedItemValue()}")
    println("Items : ${order.commaDelimitedItemNames}")
    // Generic
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
}





