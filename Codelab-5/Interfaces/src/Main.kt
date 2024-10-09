// Nombre: Hazley Jose Jarquin Gallo

/**
 * Creación de una interfaz llamada `BankMethods` con un método abstracto `deposit()`.
 */
interface BankMethods {
    /**
     * Método abstracto `deposit` que debe ser implementado por las clases que hereden de esta interfaz.
     */
    fun deposit()
}

/**
 * Clase `Bank` que implementa la interfaz `BankMethods` y sobrescribe el método `deposit()`.
 */
class Bank : BankMethods {
    /**
     * Implementación del método `deposit()` de la interfaz `BankMethods`.
     * Este método imprime un mensaje al ser llamado.
     */
    override fun deposit() {
        println("Llamando al método de la interfaz BankMethods...")
    }
}


fun main() {
    val bankObj = Bank()
    bankObj.deposit()
}
