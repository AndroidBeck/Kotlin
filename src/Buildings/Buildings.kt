package Buildings

open class BaseBuildingMaterial {
    open val numberNeeded = 1
}

class Wood: BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick: BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<T: BaseBuildingMaterial>(val buildingMaterial: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded * buildingMaterial.numberNeeded

    fun build() {
        println("Required ${buildingMaterial::class.simpleName}: $actualMaterialsNeeded")
    }
}

fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if(building.actualMaterialsNeeded < 500) println("Small building")
    else println("Large building")
}

fun main(args: Array<String>) {
    val building = Building(Wood())
    building.build()
    isSmallBuilding(building)
    isSmallBuilding(Building(Brick()))
}
