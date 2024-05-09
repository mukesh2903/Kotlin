package com.mukesh.practive.calculator

import kotlin.random.Random

fun main(args: Array<String>) {
    val coffeeShop = CoffeeShop()
    val myCoffee = coffeeShop.purchaseCoffee()
    myCoffee.wakeYouUp()
    myCoffee.quenchYourThirst()



}

interface Coffee {
    fun wakeYouUp()
    fun quenchYourThirst()

}

class Arabia():Coffee {
    override fun wakeYouUp() {
        println("Arabia Coffee wakes you up !")
    }
    override fun quenchYourThirst() {
        println("Arabia Coffee quench your thirst")
    }
}

class Robusta():Coffee {
    override fun wakeYouUp() {
        println("Robusta Coffee wakes you up !")
    }
    override fun quenchYourThirst() {
        println("Robusta Coffee quench your thirst")
    }
}

class CoffeeShop {
    fun purchaseCoffee():Coffee {
        val randomNumber = System.currentTimeMillis()
        if ( randomNumber % 2 == 0L )
            return Arabia()
        else
            return Robusta()
    }



}

