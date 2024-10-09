// Nombre: Hazley Jose Jarquin Gallo
/**
 * Método Creando una matriz.
 * Utilizando un bucle for para iterar a través de la matriz e imprimir los elementos.
 * Salida=> tiburón salmón pececillo
 */
fun iterateArrayValuesInKotlin() {
    val school = arrayOf("shark", "salmon", "minnow")
    for (element in school) {
        print("$element ")
    }
}

/**
 * Método que recorre elementos e índices al mismo tiempo...
 * En Kotlin, puedes recorrer los elementos y los índices al mismo tiempo.
 * Salida=> El elemento en 0 es un tiburón
 * El elemento en 1 es un salmón
 * El elemento en 2 es un pececillo
 */
fun iteratingThroughIndexAndElementsInKotlin() {
    val school = arrayOf("shark", "salmon", "minnow")
    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }
}

/**
 * Método que utiliza rangos en bucles e imprime valores
 * Salida => 12345
 */
fun rangeLoopInKotlin() {
    for (i in 1..5) print(i)
    for (i in 'd'..'g') print(i)
}

/**
 * Método que utiliza DownTo en bucles e imprime valores
 * Salida => 54321
 */
fun usingDownToInLoopInKotlin() {
    for (i in 5 downTo 1) print(i)
}

/**
 * Método que utiliza Step en bucles e imprime valores
 * Salida => 35
 */
fun usingStepInLoopsInKotlin() {
    for (i in 3..6 step 2) print(i)
}

/**
 * Método que utiliza el bucle while en Kotlin
 * Salida=> 50 burbujas en el agua
 */
fun useWhileLoopInKotlin() {
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")
}

/**
 * Método que utiliza el bucle do While en Kotlin
 * Salida=> 49 burbujas en el agua
 */
fun usingDoWhileInKotlin() {
    var bubbles = 50
    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

}

/**
 * Método que utiliza el bucle de repetición en Kotlin
 * Salida=> Un pez está nadando
 * Un pez está nadando
 */
fun usingRepeatInKotlin() {
    repeat(2) {
        println("A fish is swimming")
    }
}

fun main() {
    iterateArrayValuesInKotlin()
    println()
    iteratingThroughIndexAndElementsInKotlin()
    println()
    rangeLoopInKotlin()
    println()
    usingDownToInLoopInKotlin()
    println()
    usingStepInLoopsInKotlin()
    println()
    useWhileLoopInKotlin()
    println()
    usingDoWhileInKotlin()
    println()
    usingRepeatInKotlin()
}