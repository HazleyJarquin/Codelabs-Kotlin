// Nombre: Hazley Jose Jarquin Gallo

/**
 * Ejemplo que demuestra cómo la clase `ClassB` extiende y modifica las variables de la clase `ClassA`.
 * La clase `ClassA` tiene una propiedad `value` que es sobrescribible (open).
 */
open class ClassA {
    // Propiedad 'value' inicializada en 10, que es sobrescribible en las clases derivadas.
    open var value: Int = 10
}

/**
 * La clase `ClassB` hereda de `ClassA` y modifica el valor de la propiedad 'value'.
 * Contiene un método `printValue` que cambia el valor de 'value' y lo imprime.
 */
class ClassB : ClassA() {
    /**
     * Método que modifica la propiedad 'value' de la clase base y luego imprime su valor.
     */
    fun printValue() {
        value = 11
        println(value)
    }
}

fun main() {
    val obj = ClassB()
    obj.printValue()
}
