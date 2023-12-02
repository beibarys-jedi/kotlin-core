import syntax.part3.task1.Aquarium

fun main() {
    val myAquarium = Aquarium()
    println(myAquarium.width)
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}