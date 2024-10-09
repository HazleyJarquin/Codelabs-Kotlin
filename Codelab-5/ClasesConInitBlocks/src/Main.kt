// Nombre: Hazley Jose Jarquin Gallo


class Box(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    // Bloque de inicialización, ejecutado al crear la instancia
    init {
        println("Inicializando el acuario")
    }

    // Segundo bloque de inicialización que calcula y muestra el volumen
    init {
        // 1 litro = 1000 cm^3
        println("Volumen: ${width * length * height / 1000} l")
    }

    /**
     * Función miembro dentro de la clase utilizada para imprimir las dimensiones de la clase Box
     */
    fun printSize() {
        println("Ancho: $width cm " +
                "Largo: $length cm " +
                "Altura: $height cm ")
    }
}

/**
 * Método utilizado para crear un objeto de la clase Box, modificar sus valores y finalmente
 * imprimir esos valores usando el método printSize() dentro de la clase Box.
 * El constructor de la clase Box contiene valores predeterminados; si no se pasan
 * valores, tomará los predeterminados.
 */
fun buildBox() {
    // Creación de un objeto con valores predeterminados
    val buildFeature1 = Box()
    buildFeature1.printSize()

    // Altura y largo predeterminados, ancho modificado
    val buildFeature2 = Box(width = 25)
    buildFeature2.printSize()

    // Ancho predeterminado, altura y largo modificados
    val buildFeature3 = Box(height = 35, length = 110)
    buildFeature3.printSize()

    // Todos los valores personalizados
    val buildFeature4 = Box(width = 25, height = 35, length = 110)
    buildFeature4.printSize()
}

/**
 * Función principal que ejecuta el método buildBox para demostrar
 * las diferentes formas de crear objetos de Box y mostrar sus dimensiones.
 */
fun main() {
    buildBox()
}
