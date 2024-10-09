// Nombre: Hazley Jose Jarquin Gallo
import java.util.*    // Import requerido

/** * Método que utiliza el método Random del paquete util en Kotlin para generar un
 *  índice aleatorio y obtener * valor de la matriz de semanas */

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

/**
 * Método que utiliza el operador when para devolver valores en función de la entrada...
 */
fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

/**
 * Llamada al método que utiliza los métodos anteriores para generar valores...
 * Salida=> Hoy es jueves y los peces comen gránulos
 */
fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
}

/**
 * Funciones con parámetros y valores predeterminados...
 */
fun swim(speed: String = "fast") {
    println("swimming $speed")
}

/**
 * El valor predeterminado de un parámetro no tiene por qué ser un valor.
 * Puede ser otra función, como se muestra en el siguiente ejemplo parcial:
 */
fun usingMethodForDefaultValues(value:String=returnStringValue()){
    println("Value is $value")
}

// Método que devuelve un valor de cadena
fun returnStringValue()= "Testing value"

fun main(args: Array<String>) {
    feedTheFish()
    swim()   // usa la speed predeterminada
    swim("slow")   // argumento posicional
    swim(speed="turtle-like")   // parámetro nombrado
    usingMethodForDefaultValues()
}