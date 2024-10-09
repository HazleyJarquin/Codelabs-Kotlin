// Nombre: Hazley Jose Jarquin Gallo

/**
 * Método que muestra el uso del operador de rango en Kotlin
 * Pruebe un rango en una declaración if. En Kotlin, la condición que prueba también puede usar rangos.
 * Aquí, el rango comienza de 1 a 100 (.. representa hasta aquí)
 */
fun testRangeOperator(){
    val fish = 50
    if (fish in 1..100) {
        println(fish)
    }
}

fun main() {
    testRangeOperator()
}