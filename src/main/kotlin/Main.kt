fun main(args: Array<String>) {
//Задача 1
    fun printFullName(firstName : String, lastName : String){
        println(firstName + " " + lastName)
    }
    printFullName("Алексей", "Гниловский")
//------------------------------

//Задача 2
    val firstName = "Алексей"
    val lastName = "Гниловский"
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

//Задача 5
    fun primeNumber(n: Int):Boolean{
    if (n < 2) return false
        for (i in 2..n - 1) {
        if (n % i == 0) return false
    }
    return true
    }
    println(primeNumber(4))
//--------------------

//Задача 6
    fun fibonacci(n: Int) : Int{
        var num1 = 0
        var num2 = 1
        var num3: Int
    if (n == 0) return 0
        else if (n == 1) return 1
    else
        for (i in 2 until n+1)
        {
            num3 = num1 + num2
            num1 = num2
            num2 = num3
            }
        return num2
    }
    println(fibonacci(9))
//---------------------
}

