package syntax.part1

fun main() {
    // In this task, you learn about arrays and lists, and you learn different ways to create loops in the Kotlin programming language.

    val school = listOf("NIS", "KTL", "Fizmat") // list cannot be changed
    println(school)

    // mutableList below can be changed
    val techUniversities = mutableListOf("KBTU", "SDU", "IITU", "AITU")
    println(techUniversities)
    techUniversities.remove("AITU")
    println(techUniversities)

    // array size is fixed
    val richSchool = arrayOf("Hailey", "NIS IB", "NurOrda")
    println(java.util.Arrays.toString(richSchool))

    // arrays can contain different types, but if you need same type use intArray
    val simpleSchool = intArrayOf(1, 73, 8, 83)
    println("simpleSchool = ${java.util.Arrays.toString(simpleSchool)}")
}