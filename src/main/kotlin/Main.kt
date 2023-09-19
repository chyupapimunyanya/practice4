fun main(args: Array<String>) {
//Задача 1
    fun printFullName(firstName : String, lastName : String){
        println(firstName + " " + lastName)
    }
    printFullName("Андрей", "Быкадоров")
//------------------------------

//Задача 2
    val firstName = "Андрей"
    val lastName = "Быкадоров"
    printFullName(firstName, lastName)
//----------------------------

//Задача 3
    fun calculateFullName(firstName : String, lastName : String): String{
        return "${firstName} ${lastName}"
    }
    val fullName = calculateFullName(firstName, lastName)
//------------------------

//Задача 4
fun calculateFullName2(firstName : String, lastName : String): Pair<String, Int>{
    return Pair(fullName, fullName.length-1)
}
//-------------------------

}

