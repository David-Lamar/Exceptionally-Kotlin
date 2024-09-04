package exceptionally.control

import exceptionally.Func
import exceptionally.FunctionWrapper
import exceptionally.exceptions.BooleanException
import exceptionally.exceptions.FalseException
import exceptionally.exceptions.TrueException

/**
 * Exception based control structure for handling alternative branching paths. Used in cases where something _else_
 * needs to happen if the primary branch is not taken.
 *
 * Parallel control structure to "else" and "else if"
 */
object BranchFailureException : RuntimeException()

/**
 * Exception based control structure for handling branching under different conditions.
 *
 * Parallel control structure to "if".
 *
 * @throws [BranchFailureException] if [ex] throws a [FalseException]
 * @throws [Return] if [block] is executed successfully
 */
fun branch(
    ex: BooleanException,
    block: Func,
) {
    try {
        throw ex
    } catch (t: TrueException) {
        FunctionWrapper { block() }
    } catch (f: FalseException) {
        throw BranchFailureException
    }
}
