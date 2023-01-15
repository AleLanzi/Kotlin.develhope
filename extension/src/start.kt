fun main(){

    fun <T> List<T>.filterByValue(predicate: (T) -> Boolean): List<T> {
        val result = mutableListOf<T>()
        forEach { if (predicate(it)) result.add(it) }
        return result
    }

    fun <T> List<T>.printValues() {
        forEach { println(it) }
    }

    val myList = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900, 1000)
    val filteredList = myList.filterByValue { it < 500 }
    filteredList.printValues()

}




