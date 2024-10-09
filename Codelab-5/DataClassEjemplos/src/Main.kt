// Nombre: Hazley Jose Jarquin Gallo

/**
 * Clase de datos llamada Decoration con una propiedad "rocks" de tipo String.
 * La clase data en Kotlin genera automáticamente métodos útiles como toString(), equals(), y copy().
 */
data class Decoration(val rocks: String)

/**
 * Función que crea una instancia de la clase Decoration y la imprime.
 */
fun makeDecorations() {
    val decoration1 = Decoration("granito")
    println(decoration1)
}

// Aquí se define una clase de datos con 3 propiedades.
data class Decoration2(val rocks: String, val wood: String, val diver: String)

/**
 * Función que crea una instancia de la clase Decoration2 y asigna sus propiedades a variables.
 * Luego imprime la instancia y las variables.
 */
fun makeDecorations2() {
    val d5 = Decoration2("cristal", "madera", "buzo")
    println(d5)

    // Asignar todas las propiedades de Decoration2 a variables utilizando destructuring.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

/**
 * Función principal que ejecuta las funciones makeDecorations y makeDecorations2.
 */
fun main(){
    makeDecorations()
    makeDecorations2()
}
