// Nombre: Hazley Jose Jarquin Gallo

// En este ejemplo, la lambda toma un Int llamado dirty y devuelve dirty / 2
fun main(){
    var dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2}
    println(waterFilter(dirtyLevel))

    val waterFilter2: (Int) -> Int = { dirty -> dirty / 2 }
    println(waterFilter2(dirtyLevel))

}