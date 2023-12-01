import java.util.*

val scan: Scanner = java.util.Scanner(System.`in`)

fun main(args: Array<String>){
    val n = scan.nextInt()

    // необходимо записать вводимые числа в 2 массива и просуммировать
    var arr1 = IntArray(n) { 0 }
    var arr2 = IntArray(n) { 0 }

    for (i in 0..n-1) {
        arr1[i] = scan.nextInt()
    }

    for (i in 0..n-1) {
        arr2[i] = scan.nextInt()
    }

    for (i in 0..n-1) {
        println(arr1[i] + arr2[i])
    }
}