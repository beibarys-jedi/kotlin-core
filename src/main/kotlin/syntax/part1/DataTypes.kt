package syntax.part1

fun main() {
    var name: String = "James"
    var weight: Double = 95.4
    var year: Int = 2023
    var initial: Char = 'B'

    println("name = ${name}")
    println("weight = ${weight}")
    println("year = ${year}")
    println("initial = ${initial}")

    for (c in name){
        print("$c ") // same as print(c+" ")
    }

}