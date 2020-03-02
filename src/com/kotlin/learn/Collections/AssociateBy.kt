// AssociateBy and GroupBy 
fun  main(args: Array<String>) {
    
data class Person (val name:String, val city:String,
val phone:String)

val people = listOf(
    Person("Ranjeet", "Banglore", "6806806"),
    Person("Shefali", "Banglore", "6806806"),
    Person("Walmart", "Banglore", "6756565")
)

val phoneBook = people.associateBy {it.phone}
val cityBook = people.associateBy(Person::phone , Person::city)
val peopleCities = people.groupBy(Person::city, Person::name)
val peoplePhone = people.groupBy(Person::phone, Person::city)

println("People :  $people")
println("Phone Book : $phoneBook")
println("City Book :  $cityBook")
println("People Cities : $peopleCities")
println("People Phone : $peoplePhone")

}