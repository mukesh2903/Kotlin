package com.mukesh.practive.calculator

fun main(args: Array<String>) {

    val factory = CarFactory()
    val myCar = factory.provideCars()
    println(myCar.speed)
    myCar.drive()
    myCar.park()

}

interface CarTypes{
    val speed: Int
    fun drive()
    fun park()
}

class BMW:CarTypes {
    override var speed = 100

    override fun drive() {
        println("BMW Driving !!")
    }

    override fun park() {
        println("BMW Parking !!")
    }

}


class Mercedes:CarTypes {
    override var speed = 200

    override fun drive() {
        println("Mercedes Driving !! ")
    }

    override fun park() {
        println("Mercedes Parking !! ")
    }

}

class CarFactory() {
    fun provideCars(): CarTypes {
        return BMW()
    }
}