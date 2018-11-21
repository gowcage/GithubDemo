package jiuwu.gqz.testlib

class Utils {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    val product: (Int, Int) -> Int = { a, b -> a * b }

    val quotient = { a: Int, b: Int -> a / b }
}