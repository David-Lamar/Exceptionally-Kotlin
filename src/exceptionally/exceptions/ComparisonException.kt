package exceptionally.exceptions

import kotlin.RuntimeException

sealed class ComparisonException: RuntimeException()
object GreaterThanException: ComparisonException()
object EqualToException: ComparisonException()
object LessThanException: ComparisonException()

fun <T : Comparable<T>> exCompare(first: T, second: T) {
    val comp = first.compareTo(second)

    // Equal 0 case -- Can't divide by 0!
    try {
        1/comp
    } catch (e: ArithmeticException) {
        throw EqualToException
    }

    // Less than, -1 case. Can't access -1 index of arrays!
    try {
        listOf(Unit, Unit)[comp]
    } catch (e: Exception){
        throw LessThanException
    }

    // Default, Greater than, 1 case
    throw GreaterThanException
}