data class temp(val a: Int) {

    var age = a
    fun test1() {
        println("GG")
    }

}

fun main() {

    val list_test: List<Int> = mutableListOf(1, 2, 3, 12, 7, 5)
    //val temp_1 = list_test.groupBy { it  }.forEach{ println(it.key)}
    val list_String = listOf("Topa", "Bopa", "Opa")

    val temp_2 = list_test.fold(0) { start: Int, item: Int -> start + item }
    println(list_test.sum())
    println(temp_2)

    // Промежуточный результат записыается в старт
    val temp_3 = list_String.fold("") { start: String, item: String -> start + item + " " }
    println(temp_3)
    
    // reduce
    val temp_4 = list_String.reduce() { start: String, item: String -> start + item + " " }
    println(temp_4)

}

