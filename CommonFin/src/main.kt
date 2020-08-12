interface openable <L>{
    val ark: L
    val masser: List<L>


}

class Contest<T>(var age: Int): openable<Int>{

    override var ark: Int = 32
        get() = field
        set(value){
        field = value
            }

    override var masser: MutableList<Int> = mutableListOf(1, 2)
        get() = field
        set(value){
            field = value
        }

    val temp: MutableList<T> = mutableListOf()
    val temp1: MutableMap<T, Int> = mutableMapOf()

    fun <K> temp1(){
        val byter: K
    }
}


fun main() {


}