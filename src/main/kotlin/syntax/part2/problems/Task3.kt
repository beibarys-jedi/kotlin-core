val scan2 = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val n = scan2.nextInt()

    var result = 0

    for (i in 1..n) {
        if (isPrime(i)) result += i
    }

    println(result)
}

fun isPrime(n: Int): Boolean {
    if (n < 2) return false

    if (n == 2) return true

    for (i in 2 until n) // until заменяет выражение 2..n-1
        if (n % i == 0) return false

    return true
}
