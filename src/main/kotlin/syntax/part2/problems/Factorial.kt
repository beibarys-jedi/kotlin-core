import java.util.*

val scan1: Scanner = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val n = scan1.nextInt()

    var result = 1
    for(i in 1..n){
        result *= i
    }

    println(result)
}
