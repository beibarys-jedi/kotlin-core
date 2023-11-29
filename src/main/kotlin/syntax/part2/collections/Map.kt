package syntax.part2.collections

fun main() {
    val map = mapOf(123 to "number1", 345 to "number2", 678 to "number3")
    println("map = ${map}")

    val map2 = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)

    println(map2.getValue("One"))
    println(map2["Two"])
}