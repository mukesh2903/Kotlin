package com.mukesh.practive.calculator

fun main(){
    val rate = InterestRates()
    rate.account = 900.0
    rate.account = 2000.0
    rate.account = 10000.0
}

class InterestRates() {
    var rate = 0.0
    var account = 0.0
        get() = field
        set(value) {
            if (value < 1000)
                rate = 1.0
            else if (value < 10000)
                rate = 0.5
            else
                rate = 0.2
            field = value
            println("The account balance is $account and rate is $rate")
        }
}