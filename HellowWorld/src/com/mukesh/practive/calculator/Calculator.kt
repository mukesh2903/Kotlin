package com.mukesh.practive.calculator

fun main() {
    val cal = Calculator()
    cal.num=20
    println(cal.add())
    cal.num=30
    println(cal.subtract())

}

class Calculator {
    var sum: Int = 0
    var num: Int = 0

    fun add(): Int {
        sum += num
        return sum
    }
    fun subtract(): Int {
        sum -= num
        return sum
    }
    fun multiple(): Int {
        sum *= num
        return sum
    }

    fun divide(): Int {
        if(num==0) {
            println("Please enter some other number as can't divide by zero !")
        } else{
            sum /= num
        }
        return sum

    }

    fun reset(): Int {
        sum = 0
        return sum
    }

}