fun convert(x: Double, converter: (Double) -> Double): (Double) -> Double{

    val result = converter(x)
    println("$x is converted to $result")
    return {it + 344}

}


fun main() {

    val a: (Double) -> Double = convert(40.toDouble(), {it + 32})
    println(a(56.0))

}