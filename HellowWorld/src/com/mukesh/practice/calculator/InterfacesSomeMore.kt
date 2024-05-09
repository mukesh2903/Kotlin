package com.mukesh.practive.calculator

fun main(args:Array<String>){
    var rent: CarRental = UtilityCar().rent()
    rent.drive()
    rent = LuxuryCar().rent()
    rent.drive()




}

interface CarRental {
    fun drive()
}

class NormalCar: CarRental {
    override fun drive() {
        println("Its a Utility Car, Cheap and help you to reach destination !")
    }

}

class Limousine: CarRental {
    override fun drive() {
        println("Its Limousine and quite comfortable !")
    }
}

class UtilityCar {
    fun rent(): CarRental {
        return NormalCar()
    }
}


class LuxuryCar {
    fun rent(): CarRental {
        return Limousine()
    }
}