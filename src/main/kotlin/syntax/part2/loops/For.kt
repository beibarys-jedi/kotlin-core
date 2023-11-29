package syntax.part2.loops

fun main() {
    for (i in 1..5){
        print(i)
    }
    println()

    val students = arrayListOf<String>()
    students.add("Beibut")
    students.add("Azat")
    students.add("Anara")

    for(student in students){
        println("Student $student")
    }
}