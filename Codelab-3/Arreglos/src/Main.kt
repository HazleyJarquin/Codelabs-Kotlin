// Nombre: Hazley Jose Jarquin Gallo

/**
 * Al igual que otros lenguajes, Kotlin tiene matrices.
 * A diferencia de las listas en Kotlin, que tienen versiones mutables e inmutables,
 * no existe una versión mutable de una matriz.
 * Una vez que crea una matriz, el tamaño es fijo.
 * No puede agregar ni eliminar elementos, excepto si los copia a una nueva matriz.
 **/


/**
 * Método para imprimir matrices declaradas e imprimir valores de la matriz definida
 * Declarar una matriz de cadenas utilizando arrayOf.
 * Utilizar la utilidad de matriz java.util.Arrays.toString() para imprimirla.
 * Salida=> [tiburón, salmón, pececillo]
 */
fun howToArraysInKotlin() {
    val school = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school))
}

/**
 * Método que declara una matriz con tipos mixtos
 * Una matriz declarada con arrayOf no tiene un tipo asociado a los elementos,
 * por lo que puedes mezclar tipos, lo cual es útil. Declara una matriz con diferentes tipos.
 * Salida=> [fish, 2]
 */
fun usingMixTypesArrays() {
    val mix = arrayOf("fish", 2)
    println(java.util.Arrays.toString(mix))
}

/**
 * Método que utiliza solo un tipo de matriz...
 * También puede declarar matrices con un tipo para todos los elementos.
 * Declare una matriz de números enteros utilizando intArrayOf().
 * Existen constructores correspondientes, o funciones de instanciación, para matrices de otros tipos.
 * Salida=> [1, 2, 3]
 */
fun usingOneTypeOfArrayOnly() {
    val numbers = intArrayOf(1, 2, 3)
    println(java.util.Arrays.toString(numbers))
}

/**
 * Método que combina dos matrices...
 * combina dos matrices con el operador +.
 * Salida=> [4, 5, 6, 1, 2, 3] y 3
 */
fun combiningTwoArrays() {
    val numbers = intArrayOf(1, 2, 3)
    val numbers3 = intArrayOf(4, 5, 6)
    val foo2 = numbers3 + numbers
    println(java.util.Arrays.toString(foo2))
    //Printing specific values
    println(foo2[5])
}

/**
 * Pruebe diferentes combinaciones de matrices y listas anidadas.
 * Como en otros lenguajes, puede anidar matrices y listas.
 * Es decir, cuando coloca una matriz dentro de una matriz,
 * tiene una matriz de matrices, no una matriz aplanada del contenido de las dos.
 * Los elementos de una matriz también pueden ser listas, y los elementos de las listas pueden ser matrices.
 * Salida=> [[I@28a418fc, [Atlantic, Pacific], salmon]
 */
fun arrayOfArrays() {
    val numbers = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    val oddListNew = listOf(java.util.Arrays.toString(numbers), oceans, "salmon")
    println(oddList)
    println(oddListNew)
}

/**
 * Método para inicializar matrices con código en lugar de inicializarlas a 0
 * Salida=> [0, 2, 4, 6, 8]
 */
fun initializingArrays() {
    val array = Array(5) { it * 2 }
    println(java.util.Arrays.toString(array))
}
fun main() {

    howToArraysInKotlin()
    usingMixTypesArrays()
    usingOneTypeOfArrayOnly()
    combiningTwoArrays()
    arrayOfArrays()
    initializingArrays()

    }
