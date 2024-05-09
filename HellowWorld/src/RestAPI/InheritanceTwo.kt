package RestAPI


fun main() {
    val student = Student("Mukesh")
    val instructor = Instructor("Satish")

    println("name is : ${student.name}")
    println("name is : ${instructor.name}")
    student.login()

}
open class User(val name:String) {
    open fun login() {
        println("User Logged in !!")
    }
}

class Student(name:String) : User(name)

class Instructor(name:String) : User(name)





