package com.mukesh.practive.calculator

fun main() {
    val account = BankAccount()
    account.bankAccount = 300
    account.bankAccount = 400
    account.bankAccount = 200
}


class BankAccount() {
    var creditRating = 500
    var bankAccount = 0
        get() = field
        set(value) {
            println("The value of bankAccount is $bankAccount")
            if (value > bankAccount)
                creditRating++
            else
                creditRating--
            field = value
            println("The value of bankAccount is $bankAccount")
            println("New credit Rating is $creditRating")
        }
}