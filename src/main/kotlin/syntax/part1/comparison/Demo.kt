package syntax.part1.comparison

fun main() {
    val a = 12
    val b = 21
    if(a in 11..b)
        println("true")
    else
        println("text")
    val x = 12.0
    val y = 222.0
    println(x.equals(y))
    println(x.compareTo(y))
}