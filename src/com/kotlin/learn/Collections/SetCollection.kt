// A Set is an unordered collection that doest not
// support duplicates. 
// setOf mutableSetOf

val openIssues : MutableSet<String> = mutableSetOf("Set1", "Set2")

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if(isAdded) " Registered correctly." else "Marked duplicate and rejected"
 }

 fun main(args: Array<String>) {
     val aNewIssue : String = "Set3"
     val alreadyNewIssue: String = "Set1"

    println("Issues $aNewIssue ${getStatusLog(addIssue(aNewIssue))}") 
    println("Issues $alreadyNewIssue ${getStatusLog(addIssue(alreadyNewIssue))}") 
 }