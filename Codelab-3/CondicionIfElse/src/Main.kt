// Nombre: Hazley Jose Jarquin Gallo
/**
 * Método simple que indica el uso de If y Else en Kotlin
 * Escribir una declaración if/else.
 */
fun useIfAndElse(){
    val numberOfFish = 50
    val numberOfPlants = 23

    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }
}

/**
 * Método que indica el uso de la escalera If y Else if en Kotlin
 * Escribe un if con múltiples casos. Para condiciones más complicadas,
 * usa el and lógico && y el or lógico ||. Como en otros lenguajes,
 * puedes tener múltiples casos usando else if.
 */
fun ifElseLadder(){
    val numberOfFish = 50
    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }
}


fun main() {
    useIfAndElse()
    ifElseLadder()
}