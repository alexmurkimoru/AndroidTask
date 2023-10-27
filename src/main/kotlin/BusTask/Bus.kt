package BusTask

interface Bus {
    var fuelLevel : Double
    val fuelType : Petrol
    val maxFuelLevelInfo : Double

    fun fuelConsumption(distance : Double) : Double

    fun go(destination : String, distance : Double, fuelConsumptionFormula : (Double) -> Double )

    fun warningMessage(){
        println("Warning: you're running out of fuel")
    }




}