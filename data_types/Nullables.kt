fun main() {
    var aNullableString: String? = null
    println(aNullableString?.length)
    aNullableString = "hehe"
    println(aNullableString!!.length) // asserts that value is not null
    aNullableString = null
    println(aNullableString?.length ?: "the value is null")
}