data class temp(val a: Int) {

    var age = a
    fun test1() {
        println("GG")
    }

}

fun main() {
    val maps: MutableMap<String, Int> = mutableMapOf("First" to 1, "Second" to 2, "Third" to 3)

    println(maps.values.sumBy{it})
    println(maps.keys)

    for((k, v) in maps.entries){
        print(k + " " + v)
        //println(v)
    }

}