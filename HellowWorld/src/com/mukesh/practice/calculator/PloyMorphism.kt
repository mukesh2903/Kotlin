package com.mukesh.practive.calculator

fun main() {
    val hello = Translator()
    hello.helloMessage()
    println( hello.helloMessage("French"))
    println( hello.helloMessage("Spanish"))

}

class Translator() {
    fun helloMessage(){
        println("Hello Everyone !")
    }

    fun helloMessage(languageType:String):String {
        val msg = when(languageType) {
            "French" -> "Bonjour !"
            "Spanish" -> "Viola!"
            else -> "Hello"
        }
        return msg
    }

}

