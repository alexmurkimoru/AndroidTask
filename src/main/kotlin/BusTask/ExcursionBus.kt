package BusTask

import java.util.Date

class ExcursionBus(
    private val mark : String,
    private val number: String,
    private val yearOfRelease : Int,
    private var mileage : Double,
    private val passengersMaxAmount : Int,
    private val maxFuelLevel : Double,
) : Bus {
    override var fuelLevel: Double = maxFuelLevel
    override val fuelType: Petrol = Petrol.DT
    override val maxFuelLevelInfo: Double = maxFuelLevel

    private var passengersList = emptyArray<String>()
    var formula : (Double) -> Double = ::fuelConsumption
        private set

    override fun fuelConsumption(distance: Double): Double {
        return (0.01 * 33.6 * distance)
    }

    override fun go(destination: String, distance: Double, fuelConsumptionFormula: (Double) -> Double) {
        if(fuelLevel <= 0){
            println("There is no fuel, the bus cant go")
            return
        }
        mileage += distance
        fuelLevel -= fuelConsumptionFormula(distance)
        if (fuelLevel < fuelLevel*0.2){
            warningMessage()
        }
        println("The excursion group has arrived to  \"${destination}\"  \nCurrent level of fuel: ${fuelLevel} л.")
    }

    fun addPassenger(vararg names : String){
        for (arg in names) {
            if (passengersList.size < passengersMaxAmount) {
                passengersList += names
                println("The passenger $arg was added to passengers list")
            } else {
                println("The bus is packed, choose another one")
            }
        }
    }

    fun getOutForExcursion(){
        println("${passengersList.contentToString()} are getting out")
    }

}