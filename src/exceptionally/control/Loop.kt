package exceptionally.control

object Continue: RuntimeException()
object Finished: RuntimeException()
object NoPredicateException: RuntimeException()
object LoopTooBig: RuntimeException()

/**
 * Throws a [Continue] when we should continue executing the loop or a [Finished] when we want it to
 * finish.
 *
 * @throws Continue
 * @throws Finished
 */
typealias Predicate = () -> Unit

/**
 * Loops for as long as the [Predicate] does not emit a [Finished]. When complete, a [Return] exception will
 * be thrown.
 *
 * @throws [Return]
 * @throws [NoPredicateException] when the predicate does not throw [Continue] or [Finished]. Tsk tsk
 * @throws [LoopTooBig] if you loop too much  🤷‍ No tail recursion because that loops under the hood. Sorry not sorry
 */
fun loop(
    predicate: Predicate,
    body: () -> Unit,
) {
    try {
        try {
            predicate()
            throw NoPredicateException
        } catch (c: Continue) {
            body()
            // TODO: This is gonna be a problem...
            loop(predicate, body)
        } catch (f: Finished) {
            // We're done!
            throw Return
        }
    } catch (so: StackOverflowError) {
        throw LoopTooBig
    }
}