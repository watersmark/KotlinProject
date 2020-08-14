data class temp(val a: Int) {

    var age = a
    fun test1() {
        println("GG")
    }

}

fun main() {

    val temp: List<Int> = listOf(1, 3, 4, 2)

    val summ_temp_int = temp.sumBy{it + 32}
    val summ_temp = temp.sumByDouble { (it * 32).toDouble() }
    

}

