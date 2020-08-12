typealias DoubleConversion = (Double) -> Double

// Использовали typealias
fun convert(x: Double, converter: DoubleConversion): DoubleConversion{

    val result = converter(x)
    println("$x is converted to $result")
    return {it + 344}

}


fun main() {




}