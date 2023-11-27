package syntax.part1

fun main() {
    val a: Int = 1	// immediate assignment

    var b = 2		// 'Int' type is inferred
    b = a 			// Reassigning to 'var' is okay

    val c: Int		// Type required when no initializer is provided
    c = 3			// Deferred assignment
    // a = 4			// Error: Val cannot be reassigned
    print(a)
    print(b)
    print(c)
//    print(d)
}