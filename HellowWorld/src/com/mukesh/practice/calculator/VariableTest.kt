package com.mukesh.practive.calculator

fun main() {
    val personalInfo = PersonalInfo()
    println(personalInfo.height)
    personalInfo.updateHeightSize(10, 10)
    println("${personalInfo.height},  ${personalInfo.size}")


}

class PersonalInfo() {
    var height: Int = 0
    var size: Int = 0

    fun updateHeightSize(height: Int, size: Int) {
        this.height = height
        this.size = size
    }


}
