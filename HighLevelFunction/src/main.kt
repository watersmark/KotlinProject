data class temp(val a: Int) {

    var age = a
    fun test1() {
        println("GG")
    }

}

fun main() {

    val list_test: List<Int> = mutableListOf(1, 2, 3, 12, 7, 5)
    val temp1 = list_test.filter { it > 3 }.map { it  }

    
    for(i in temp1){
        println(i)
    }

}

