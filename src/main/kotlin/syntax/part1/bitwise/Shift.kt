package syntax.part1.bitwise

fun main(args: Array<String>) {
    val number = 212
    // The shl function shifts bit pattern to the left by certain number of specified bits, and zero bits are shifted into the low-order positions.
    println(number shl 1)
    println(number shl 0)
    println(number shl 4)
    // The shr function shifts bit pattery to the right by certin number of specified bits.
    println(number shr 1)
    println(number shr 0)
    println(number shr 8)
}