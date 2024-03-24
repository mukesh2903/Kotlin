import java.util.Calendar

fun main() {

    /*
    println("Please enter your birth year !")
    val bYear = readLine()?:""
    val birthYear = bYear.toInt()

    val calendar = Calendar.getInstance()
    val currentYear = calendar.get(Calendar.YEAR)
    println("The birth year is : $birthYear")
    println("The Current Year is : $currentYear")
    println("The Age is : ${currentYear - birthYear}" )



    val num = 200
    println(num::class.java)

     */

    val items = arrayListOf<String>("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removedItems = listOf<String>("pen", "paper", "mug", "phone")
    
    items.removeAll(removedItems)
    println(items)


}