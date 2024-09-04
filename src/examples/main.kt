package examples
fun main() {

    try {
        badRecursion()
    } catch (e: StackOverflowError) {
        println("Caught the SO!")
    }

}

fun badRecursion() {
    val asdf: Int = 100
    badRecursion()
}