package com.mukesh.practive.calculator

fun main(arr:Array<String>) {
    var myFood: Food = FastFoodRestaurant().buyFood()
    myFood.order()

    myFood = FrenchFoodRestaurant().buyFood()
    myFood.order()

}

interface Food {
    fun order()
}

class FastFood: Food {
    override fun order() {
        println("Order Fast Food and Ate !")
    }
    }

class FrenchFood: Food {
    override fun order() {
        println("Order French Food and it was a delight !")
    }
}

class FastFoodRestaurant {
    fun buyFood(): Food {
        return FastFood()
    }
}

class FrenchFoodRestaurant {
    fun buyFood(): Food {
        return FrenchFood()
    }
}

