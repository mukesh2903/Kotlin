package com.mukesh.practive.calculator

fun main(){
    val daughter = Daughter("Hindi")
    println(daughter.hairColor)
    daughter.message("Hi")

}



open class Mon(nativeTongue: String) {
    val hairColor = "brown"
    val eyeColor = "blue"

    fun message(msg:String) {
        println("Mom Says $msg")
    }
}

class Daughter(nativeTongue: String):Mon(nativeTongue) {

}


