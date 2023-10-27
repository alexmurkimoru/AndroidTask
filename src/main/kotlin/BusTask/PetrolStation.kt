package BusTask

enum class Petrol(val cost : Double){
    A92(cost = 48.0),
    A95(cost = 51.99),
    DT(cost = 56.99),
}

class PetrolStation(private val adress : String) {
    private var income : Int = 0

    fun fillTheBus(bus : Bus){
        val receipt : Double = (bus.maxFuelLevelInfo - bus.fuelLevel) * bus.fuelType.cost
        println("Bus is filled with ${bus.fuelType}")
        println("Total is $receipt rub")
    }
}