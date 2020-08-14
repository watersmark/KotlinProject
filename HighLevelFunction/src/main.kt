data class temp(val a: Int) {

    var age = a
    fun test1() {
        println("GG")
    }

}

fun main() {
    val new1: temp = temp(112)
    val new2: temp = temp(141)
    val mass: MutableList<temp> = mutableListOf(new1, new2)

    println(mass.minBy { it.age })
    println(mass.maxBy { it.age })

}