
fun main() {

    val animal = "cats"
    println( "The Age of the animal $animal: " + animalAge("cats"))

}

fun animalAge(animal:String): Int {
    val age = when (animal.trim())  {
        "cats" -> 15
        "dogs" -> 10
        "rabbit" -> 12
        else -> 20
    }
    return age
}