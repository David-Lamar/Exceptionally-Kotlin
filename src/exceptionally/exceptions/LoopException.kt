package exceptionally.exceptions

import java.lang.RuntimeException

sealed class LoopException: RuntimeException()
sealed class LoopEnd: RuntimeException()
sealed class LoopContinue: RuntimeException()