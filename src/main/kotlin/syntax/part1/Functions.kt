fun main() {
    println(sum(1,2))
    println(mul(1,2))
    printMul(10, 20)
}
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun mul(a: Int, b: Int) = a * b
fun printMul(a: Int, b: Int): Unit {
    println(mul(a, b))
}

