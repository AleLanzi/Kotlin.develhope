fun main(){
    
    //Ho dovuto creare un nuovo file dato che il vecchio non veniva caricato in quanto danneggiato(????)

    val intList = listOf(1, 2, 3, 4, 5)
    val stringList = intList.map { it.toString() }
    stringList.forEach {println(it)}

}