package exceptionally.exceptions

import java.lang.RuntimeException

sealed class BooleanException: RuntimeException()
object TrueException: BooleanException()
object FalseException: BooleanException()

fun Boolean.toEx() {
    try {
        exCompare(this, true)
    } catch (et: EqualToException) {
        throw TrueException
    } catch (lt: LessThanException) {
        throw FalseException
    }
}