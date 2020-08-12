fun convert(x: Double, converter: (Double) -> Double): Double{

    val result = converter(x)
    println("$x is converted to $result")
    return result

}


fun main() {
    convert(20.toDouble(), {println("GG")
        it * 1.8 + 32
                             })
}