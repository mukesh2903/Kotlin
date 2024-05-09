package com.mukesh.practive.calculator

fun main(args:Array<String>){
    val animalList = listOf("cat", "dog", "elephant", "zebra", "monkey")

    animalList.map {it}
        .filter { it.length > 3 }
        .let(::println)
        /*
        .let{
            println(it)
            println("Size of the list is ${it.size}")
        }

         */
}

