package syntax.part1

fun main() {
    createMessage("Beibarys", "Astana", 30)
}

fun createMessage(name: String, location: String, age: Int) {
    println("My name is ${name}. I am from ${location}, and I am ${age} years old.")
}