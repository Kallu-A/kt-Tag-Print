private const val reset = "\u001B[0m"
private const val open = "\u001B[37m["
private const val close = "\u001B[37m] "

@JvmOverloads
fun error(message: String = "") = "$open\u001B[31mERROR$close$reset$message"
@JvmOverloads
fun warning(message: String = "") = "$open\u001B[33mWARNING$close$reset$message"
@JvmOverloads
fun data(message: String = "") = "$open\u001B[35mDATA$close$reset$message"
@JvmOverloads
fun info(message: String = "") = "$open\u001B[36mINFO$close$reset$message"
@JvmOverloads
fun deadly(message: String = "") = "$open\u001B[31mDEADLY$close\u001B[31m$message"
@JvmOverloads
fun comment(message: String = "") = "${open}COMMENT$close$message"

@JvmOverloads //work better with print
fun input(message: String = "") = "$open\u001B[35mINPUT$close$message \n \u001B[35m--> $reset"