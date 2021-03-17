/** main launch the app*/
fun main() {
    println(tagError("Issue on the runtime"))
    println(tagWarning("Be careful to that"))
    println(tagInfo("Information for the user"))
    println(tagData("important data to show"))
    println(tagDeadly("end of the program because of an error"))
    println(tagComment("Comment for the dev"))
    println(tagInput("coord in the board like 'X Y'"))

    print(tagError())
    print(tagDeadly())
    print(tagWarning())
    println(tagData("You can combine the tags"))

}