package exceptionally

import exceptionally.control.Return

/**
 * Typical function.
 *
 * @throws [Return] under all circumstances
 */
typealias Func = () -> Unit

/**
 * Internal wrapper to help facilitate _always_ returning when a function is finished
 */
internal fun FunctionWrapper(func: Func) {
    func()
    throw Return
}

fun call(func: Func) {
    try {

    } catch (r: Return) {

    }
}