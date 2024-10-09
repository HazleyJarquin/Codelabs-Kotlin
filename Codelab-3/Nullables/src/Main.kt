// Nombre: Hazley Jose Jarquin Gallo

//Elimine el comentario de la línea inferior para ver el error de tiempo de compilación.
// Como de forma predeterminada, las variables no pueden ser nulas en Kotlin.
//var rocks: Int = null

/**
 * Cómo podemos asignar valores nulos a una variable en Kotlin
 * Use el operador de signo de interrogación, ?, después del tipo para indicar que una variable puede ser nula.
 * Declare un Int? y asígnele un valor nulo.
 */
var marbles: Int? = null

/**
 * Antigua forma de comprobar si una variable es nula o no
 */
fun oldWayNullCheck() {
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }
    println(fishFoodTreats)
}

/**
 * Método Kotlin para comprobar si una variable es nula o no
 * Ahora veamos el método Kotlin para escribirlo, usando el operador ?
 */
fun kotlinWayOfCheckingNull() {
    var fishFoodTreats = 6
    fishFoodTreats = fishFoodTreats?.dec()
    println(fishFoodTreats)
}

/**
 * Uso del operador ternario en Kotlin
 * También puedes encadenar pruebas nulas con el operador ?:. Observa este ejemplo
 */
fun ternaryOperatorInKotlin() {
    var fishFoodTreats = 6
    fishFoodTreats = fishFoodTreats?.dec() ?: 0
    println(fishFoodTreats)
}

/**
 * Código a continuación dentro del método para permitir NullPointerExceptions
 * !! (operador de aserción no nulo o Double Bang) convierte cualquier valor en un tipo no nulo y lanza una excepción si el valor es nulo
 * Y esto lanzará la siguiente excepción
 * Excepción en el hilo "principal" kotlin.KotlinNullPointerException
 */
fun allowingNonNullValues() {
    val s: String? = null
    val len = s!!.length
    println(len)
}

fun main() {
    oldWayNullCheck()
    kotlinWayOfCheckingNull()
    ternaryOperatorInKotlin()
    allowingNonNullValues()
}