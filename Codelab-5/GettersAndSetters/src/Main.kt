// Nombre: Hazley Jose Jarquin Gallo

/**
 * Ejemplo que demuestra el uso de setters y getters en Kotlin.
 * La clase `GettersAndSettersInKotlin` define una propiedad `x` y un resultado que
 * se calcula como el cuadrado de `x` a través de un getter y setter personalizados.
 */
class GettersAndSettersInKotlin(var x: Int = 10) {

    // Propiedad result, cuyo getter devuelve el cuadrado de 'x' y cuyo setter actualiza 'x' al cuadrado del valor proporcionado.
    var result: Int
        get() = x * x
        set(value) {
            x = value * value
        }

    /**
     * Función para imprimir el valor de 'x' y 'result'.
     */
    fun printResult() {
        println("El valor de X es: $x")
        println("El resultado (cuadrado de X) es: $result")
    }
}

/**
 * Función que crea un objeto de `GettersAndSettersInKotlin`, imprime los resultados,
 * modifica el valor de 'result' y lo vuelve a imprimir.
 */
fun buildResult() {
    val gettersAndSettersInKotlin = GettersAndSettersInKotlin(x = 29)
    gettersAndSettersInKotlin.printResult()

    // Establece un nuevo valor a través del setter de result, lo que modificará 'x'.
    gettersAndSettersInKotlin.result = 70
    gettersAndSettersInKotlin.printResult()
}


fun main() {
    buildResult()
}
