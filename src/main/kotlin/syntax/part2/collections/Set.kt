package syntax.part2.collections

fun main() {
    val numbers = setOf(1, 3, 9)
    val letters = setOf("A", "B", "C")
//    println(numbers)
//    println(letters)

    val sortedSet  = sortedSetOf(2, 4, 3, 5, 1)
    sortedSet.add(6) // добавляем 6
    sortedSet.remove(1) // удаляем 1
    println(sortedSet) //

    val linkedHashSet = linkedSetOf(5, 1, 2, 3, 9, 4)
    linkedHashSet.add(44)
    linkedHashSet.remove(2)
    println(linkedHashSet) // [5, 1, 3, 9, 4, 44]

}