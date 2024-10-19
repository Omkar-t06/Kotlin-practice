fun main() {
    val aChar: Char = 'a'
    val aNumericChar = '1'
    val newLineChar = '\n'

    val aString: String = "Hello Kotlin"
    val escaped = "Hello \n World"
    print(escaped)

    val raw = """
        Some
        multiline
    text
        is going on
    here
    """.trimMargin()

    println(raw)

    val concatString: String = "Hello" + "Kotlin"
    val concatNumber = "The number" + 10
    println(concatNumber)

    val aNumber = 10
    val concatTemplate = "The number $aNumber"
    println(concatTemplate)

    val someString = " "
    println(someString.isEmpty())
    println(someString.isNotEmpty())
    println(someString.isNotBlank())
    println(concatString.contains("Kotlin"))
}