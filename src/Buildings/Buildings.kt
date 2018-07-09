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

fun main(args: Array<String>) {
    val building = Building(Wood())
    building.build()
}
