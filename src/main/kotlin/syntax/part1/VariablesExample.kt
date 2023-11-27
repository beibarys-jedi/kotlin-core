package syntax.part1
const val NAME = "JaMeS"
fun main() {
   /* const val - compile-time const value
    val - immutable value
    for const val use uppercase for naming*/

    val nameLowered = NAME.lowercase()	 // cannot be calculated at compile-time
    println(nameLowered)
}