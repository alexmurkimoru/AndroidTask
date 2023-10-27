package BusTask

fun main(){
    val myCityBus : CityBus = CityBus(
        mark = "Lada",
        number = "А067АА77",
        yearOfRelease = 2010,
        mileage = 100.0,
        passengersMaxAmount = 55,
        maxFuelLevel = 460.0
    )

    val myExcursionBus : ExcursionBus = ExcursionBus(
        mark = "Mersedes",
        number = "А675АА79",
        yearOfRelease = 2023,
        mileage = 0.0,
        maxFuelLevel = 420.0,
        passengersMaxAmount = 60,
    )

    val myPetrolStation : PetrolStation = PetrolStation(adress = "Volokolamskya street, 28")

    myCityBus.busStop(15, 0)
    myCityBus.go("Pechatniky station", 3.0, myCityBus.formula)
    myCityBus.openTheWindow()
    myCityBus.busStop(100, 10)
    myCityBus.go("Lyblinskay street station", 1000.0, myCityBus.formula)
    myPetrolStation.fillTheBus(myCityBus)
    myExcursionBus.addPassenger(" Mary", "Mike", "Nikolas")
    myExcursionBus.go("Kolomna",300.0, myExcursionBus.formula)
    myExcursionBus.getOutForExcursion()




}

