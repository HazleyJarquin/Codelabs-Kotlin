// Nombre: Hazley Jose Jarquin Gallo

// Definición de una clase abstracta en Kotlin
abstract class ParentClass {
    // La propiedad abstracta 'value' de tipo Int debe ser implementada por las subclases
    abstract var value: Int
}

// Clase 'ChildClassA' que hereda de 'ParentClass' e implementa la propiedad abstracta
class ChildClassA : ParentClass() {
    // Implementación de la propiedad 'value' en la clase hija
    override var value: Int = 20
}

fun main() {
    // Creación de una instancia de 'ChildClassA'
    val obj = ChildClassA()

    // Imprime el valor de la propiedad 'value' de la instancia 'obj' en la consola
    println(obj.value)  // Salida: 20
}
