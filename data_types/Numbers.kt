fun main() {
    val aInt:Int = 0
    val anotherInt = 0

    val aByte: Byte = 0
    val aShort: Short = 0

    val aLong: Long = 0
    val inferredInt = 10
    val inferredLong = 10000000000
    val anotherLong = 10L

    val unsignedInt: UInt = 0U
    val unsigedLong = 0UL

    val aDouble: Double = 5.5
    val aFloat: Float = 5.5f

    val inferredDouble = 5.5
    val inferredFloat = 5.5f

    println(5 == 4)
    println(10f > 4)
    println(10.3 < 6.7)

    println(10.5.toInt())
    println(10.9.toFloat())
    println(5.toULong())
    println(100_000_000.toByte())
}