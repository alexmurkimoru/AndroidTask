package BusTask

class CityBus(
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
    var conversion : Int = 0
        private set
    private var currentAmountOfPassengers : Int = 0
    var formula : (Double) -> Double = ::fuelConsumption
        private set
    override fun fuelConsumption(distance: Double): Double {
        return (0.01 * 27.5 * distance)
    }

    override fun go(destination: String, distance: Double, fuelConsumptionFormula: (Double) -> Double ) {
        if(fuelLevel <= 0){
            println("There is no fuel, the bus cant go")
            return
        }
        mileage += distance
        fuelLevel -= fuelConsumptionFormula(distance)
        if (fuelLevel < fuelLevel*0.2) {
            warningMessage()
        }
        println("The next station is ${destination} don't forget to pay")

    }

    fun busStop(newPassengersAmount: Int, leavingPassengersAmount : Int){
        conversion += newPassengersAmount
        currentAmountOfPassengers -= leavingPassengersAmount
        if((currentAmountOfPassengers + newPassengersAmount)<=passengersMaxAmount)
            currentAmountOfPassengers += newPassengersAmount
        else{
            println("Not all new passengers are allowed")
            println("${newPassengersAmount - (passengersMaxAmount - currentAmountOfPassengers )} have to wait for another bus")
            currentAmountOfPassengers = passengersMaxAmount
        }
    }

    fun openTheWindow(){
        repeat(5){
            println("Somebody opens the window")
            println("Granny closes the window")
        }
        println("Granny wins")
    }



}