// Nombre: Hazley Jose Jarquin Gallo

/**
 * En Kotlin, defines el constructor directamente en la declaración de la clase,
 * especificando los parámetros dentro de los paréntesis como si la clase fuera un método.
 * Al igual que con las funciones en Kotlin, esos parámetros pueden incluir valores predeterminados.
 */
class BuildFeature(length: Int = 100, width: Int = 20, height: Int = 40) {
    // Dimensiones en cm
    var length: Int = length
    var width: Int = width
    var height: Int = height

    /**
     * Función miembro dentro de la clase usada para imprimir las dimensiones de la clase Aquarium
     */
    fun printSize() {
        println("Ancho: $width cm " +
                "Largo: $length cm " +
                "Altura: $height cm ")
    }
}

/**
 * Método utilizado para crear un objeto de BuildFeature y modificar los valores de sus variables,
 * finalmente imprimiendo esos valores utilizando el método printSize() dentro de la clase BuildFeature.
 * El constructor de la clase BuildFeature contiene valores predeterminados; es decir, si no se
 * pasan valores, tomará los valores predeterminados.
 */
fun buildFeature() {
    // Creación de un objeto con valores predeterminados
    val buildFeature1 = BuildFeature()
    buildFeature1.printSize()

    // Altura y largo predeterminados, ancho modificado
    val buildFeature2 = BuildFeature(width = 25)
    buildFeature2.printSize()

    // Ancho predeterminado, altura y largo modificados
    val buildFeature3 = BuildFeature(height = 35, length = 110)
    buildFeature3.printSize()

    // Todos los valores personalizados
    val buildFeature4 = BuildFeature(width = 25, height = 35, length = 110)
    buildFeature4.printSize()
}

/**
 * Función principal que ejecuta el método buildFeature para demostrar
 * las diferentes formas de crear objetos de BuildFeature y mostrar las dimensiones.
 */
fun main(){
    buildFeature()
}
