// Named Argument

fun format(userName:String, domain:String) = "$userName@$domain"

fun main(args: Array<String>) {
    println(format("ranjeet", "walmart.com"))
    println(format("domain.com", "wrong"))
    println(format(userName="foo", domain="bar.com"))
    println(format(domain="foo.com", userName="bar"))
}
