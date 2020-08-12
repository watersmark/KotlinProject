fun main() {

    // Работаем с лямбда выражениями

    val temp1: (Int, Int) -> Int =  {x: Int, y: Int -> x + y}
    println(temp1(6 , 3))

    val temp2: (Int, Int) -> Unit = {x, y -> x + y}
    println(temp2(3, 4))

    val temp3: () -> String = {"This is horosho"}
    println(temp3())

    val temp4: (Int) -> Double = {it + 3.4}
    println(temp4(1))

    
}