package syntax.part2.collections

fun main() {
    var mentors: List<String>
    mentors = listOf("Beibarys", "Aslan", "Adi")
    println(mentors)

    var students = mutableListOf("Aigerim", "Ain", "Nurzhan", "Azamat")
    students.add(1, "Yerbol")
    println(students)
}