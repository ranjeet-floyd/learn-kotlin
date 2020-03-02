/*
A map is a collection of key/value pairs, 
where each key is unique and is used to retrieve the 
corresponding value. For creating maps, 
there are functions mapOf() and mutableMapOf(). 
A read-only view of a mutable map can be obtained by 
casting it to Map. 

 */

 //  mapOf , mutalbeMapOf
 const val POINT_X_PASS:Int = 15
 val EZPassAccounts: MutableMap<Int,Int> 
    = mutableMapOf(1 to 100, 2 to 200, 3 to 100)

val EZPassReport: Map<Int,Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int){
    if(EZPassAccounts.containsKey(accountId)){
        println("Updating $accountId ...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINT_X_PASS
    }
    else {
        println("Error while updating ... $accountId")
    }
}

fun accountsReport(){
    println("EZ-Pass report....")
    EZPassReport.forEach{
        k,v -> println("Id $k : $v")
    }
}

fun main(args: Array<String>) {
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(5)
}