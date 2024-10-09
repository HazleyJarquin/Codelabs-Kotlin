// Nombre: Hazley Jose Jarquin Gallo

/**
 * Ejemplo que muestra cómo crear y usar una clase y un objeto en Kotlin.
 */
class Aquarium {
    // Variables que definen las dimensiones del acuario.
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    /**
     * Función miembro dentro de la clase utilizada para imprimir las dimensiones del acuario.
     */
    fun printSize() {
        println("Ancho: $width cm " +
                "Largo: $length cm " +
                "Altura: $height cm ")
    }
}

/**
 * Método que se utiliza para crear un objeto de la clase `Aquarium`, modificar sus valores
 * y finalmente imprimir esos valores usando el método `printSize()` dentro de la clase `Aquarium`.
 */
fun buildAquarium() {
    val myAquarium = Aquarium()  // Creación de un objeto de la clase Aquarium.
    myAquarium.printSize()  // Imprime el tamaño inicial del acuario.
    myAquarium.height = 60  // Modificación de la altura del acuario.
    myAquarium.printSize()  // Imprime el tamaño actualizado del acuario.
}


fun main() {
    buildAquarium()
}
