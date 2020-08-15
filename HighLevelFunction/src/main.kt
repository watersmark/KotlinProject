data class temp(val a: Int) {

    var age = a
    fun test1() {
        println("GG")
    }

}

fun main() {

    val list_test: List<Int> = mutableListOf(1, 2, 3, 12, 7, 5)
    val new_1 = list_test.filter{it > 3}.forEach{ println(it)}

}

