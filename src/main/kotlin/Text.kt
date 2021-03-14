import TextString.Companion.close
import TextString.Companion.open
import TextString.Companion.reset

internal class TextString{

    companion object {
        internal const val reset = "\u001B[0m"
        internal const val open = "\u001B[37m["
        internal const val close = "\u001B[37m] "
    }
}

fun error(message: String = "") = "$open\u001B[31mERROR$close$reset$message"

fun warning(message: String = "") = "$open\u001B[33mWARNING$close$reset$message"

fun data(message: String = "") = "$open\u001B[35mDATA$close$reset$message"

fun info(message: String = "") = "$open\u001B[36mINFO$close$reset$message"

fun deadly(message: String = "") = "$open\u001B[31mDEADLY$close\u001B[31m$message"

fun comment(message: String = "") = "${open}COMMENT$close$message"