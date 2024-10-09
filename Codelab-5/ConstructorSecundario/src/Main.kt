// Nombre: Hazley Jose Jarquin Gallo

/**
 * Cada constructor secundario debe llamar primero al constructor primario, ya sea
 * directamente usando this(), o indirectamente llamando a otro constructor secundario.
 * Esto significa que cualquier bloque `init` en el constructor primario se ejecutará para
 * todos los constructores, y todo el código del constructor primario se ejecutará primero.
 */
class Square(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    /**
     * Bloque init que se ejecuta cuando se crea una instancia de la clase `Square`.
     */
    init {
        println("Inicializando Square")
    }

    /**
     * Otro bloque init que calcula y muestra el volumen en litros del cubo (1 litro = 1000 cm^3).
     */
    init {
        println("Volumen: ${width * length * height / 1000} l")
    }

    /**
     * Constructor secundario que llama al constructor primario.
     * @param numberOfFish Número de peces, que se utiliza para calcular el tamaño del tanque.
     */
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 por pez + espacio adicional para que el agua no se derrame
        val tank = numberOfFish * 2000 * 1.1
        // Se calcula la altura necesaria en función del volumen del tanque.
        height = (tank / (length * width)).toInt()
    }

    /**
     * Función miembro utilizada para imprimir las dimensiones de la clase `Square`.
     */
    fun printSize() {
        println("Ancho: $width cm " +
                "Largo: $length cm " +
                "Altura: $height cm ")
    }
}

/**
 * Método que crea un objeto de la clase `Square` usando el constructor secundario.
 */
fun buildSquare() {
    val square = Square(numberOfFish = 29)  // Se crea un objeto con el constructor secundario.
    square.printSize()  // Imprime las dimensiones del objeto Square.
    println("Volumen: ${square.width * square.length * square.height / 1000} l")  // Imprime el volumen en litros.
}


fun main() {
    buildSquare()
}
