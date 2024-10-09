// Nombre: Hazley Jose Jarquin Gallo
/**
 * Método que aplica el filtro y filtra el elemento de la lista que comienza con p
 * El filtro devuelve una nueva lista
 */
fun applyFiltersInList(){
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println( decorations.filter {it[0] == 'p'})
}

fun main(){
    applyFiltersInList()
}