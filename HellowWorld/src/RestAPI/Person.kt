package RestAPI

class Person (val name:String="", val age: Int=0) {
    var email = ""

    constructor(
        _email : String,
        _name : String,
        _age : Int
    ): this(_name, _age) {
        email = _email
    }

    fun action() {
        println("Person Walks !!")
    }

}


class Item() {
    var name: String = ""
    var price: Int = 0

        get() {
            println("Inside Getter !!")
            return field
        }

        set(value) {
            println("Inside Setter !!")
            if ( value >= 0 ) {
                field = value
            } else
                throw IllegalArgumentException("Negative value not allowed !!")
        }
    constructor(_name:String): this() {
        name = _name
    }


}

fun main() {
    val person = Person("Alex", 25)
    person.action()

    println("The person is ${person.name} and his age is ${person.age}")

    val item = Item("mukesh")
    item.name = "RAKESH"
    println("The name is ${item.name}")

    val personOne = Person("mukesh.kumar@target.com", "mukesh", 25)
    println("The email of the person is ${personOne.email} and name is ${personOne.name} and age is ${personOne.age}")

    item.price = 10
    println(item.price)





}