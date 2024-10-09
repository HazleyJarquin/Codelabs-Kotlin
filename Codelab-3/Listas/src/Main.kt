//Nombre: Hazley Jose Jarquin Gallo

/**
 * Las listas son un tipo fundamental en Kotlin y son similares a las listas en otros lenguajes.
 */

/**
 * Declara una lista usando listOf e imprímela.
 * Nota: Esta lista no se puede modificar.
 * Salida => [item1, item2, item3]
 */
fun usingListOf(){
    val school = listOf("item1", "item2", "item3")
    println(school)
}

/**
 * Declarar una lista que se puede modificar mediante mutableListOf.
 * Nota: Esta lista se puede modificar.
 * Cómo eliminar un elemento de una lista mutable.
 * Cómo agregar un elemento a una lista mutable.
 * Salida=> [atún, salmón, tiburón1]
 */
fun usingMutableList(){
    val myList = mutableListOf("tuna", "salmon", "shark")
    //List.remove será "verdadero" porque la lista siempre se modifica como resultado de esta operación.
    myList.remove("shark")
    //List.add será "verdadero" porque la lista siempre se modifica como resultado de esta operación.
    myList.add("shark1")
    println(myList)
}

fun main(){
    usingListOf()
    usingMutableList()
}