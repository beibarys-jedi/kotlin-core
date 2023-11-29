package syntax.part2.collections

fun main() {
    val words: Array<String> = arrayOf("a", "b", "c", "d", "e")
    val number = intArrayOf(11, 22, 33)
    for (i in number){
//        println(i)
    }

    var char = charArrayOf('a', 'b', 'c', 'd')
    for (c in char){
//        println(c)
    }
    var num = arrayOf(1, 2, "1", 'c', false)
    for (n in num){
        print(n)
    }
}
