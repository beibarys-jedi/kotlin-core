package syntax.part1.bitwise

fun main() {
    val number1 = 12
    val number2 = 25
    val resultOr: Int
    val resultXor: Int
    val resultAnd: Int

    resultOr = number1 or number2   // result = number1.or(number2)
    resultAnd = number1 and number2   // result = number1.or(number2)
    resultXor = number1 xor number2   // result = number1.or(number2)
    println("resultOr = ${resultOr}")
    println("resultAnd = ${resultAnd}")
    println("resultXor = ${resultXor}")
}