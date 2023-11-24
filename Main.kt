import java.util.Scanner

/**
 * Represents a Fibonacci number that is able to
 * describe itself and to tell the next number in the sequence.
 */
abstract class Fib {
    abstract val n: Int
    abstract fun next(): Fib
    override fun toString() = n.toString()
}

/**
 * Represents a Fibonacci number from two sequential Fibonacci numbers.
 */
open class AnyFib(val n1: Fib, val n2: Fib) : Fib() {
    var done = false

    override val n: Int by lazy { n1.n + n2.n }

    override fun next() = AnyFib(n2, this)
}

/**
 * The first Fibonacci number is a singularity.
 */
object firstFib : Fib() {
    override val n = 0
    override fun next() = object: Fib() {
        override val n = 1
        override fun next() = AnyFib(firstFib, this)
    }
}

/**
 * The program takes a number n as input and then prints
 * the first n numbers of the Fibonacci sequence.
 */
fun main() {
    val fibSeq = generateSequence(firstFib as Fib) { it.next() }
    val n = Scanner(System.`in`).nextInt()
    println(fibSeq.take(n).joinToString(separator=" "))
}
