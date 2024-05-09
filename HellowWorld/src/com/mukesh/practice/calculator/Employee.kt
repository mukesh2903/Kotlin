package com.mukesh.practice.calculator

data class Employee(val id: Int , val name: String)

fun main() {
    val emp1 = Employee(1, "mukesh")
    val emp2 = Employee(1, "mukesh")
    println(emp1)
    println(emp1 == emp2)
    val emp3 = emp1.copy(2, "satish")
    println(emp3)
}