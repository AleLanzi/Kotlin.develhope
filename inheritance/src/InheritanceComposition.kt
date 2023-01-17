fun main(){
    val children1 = Children("Gigino")
    children1.family()
}

open class Parent(open var parentName : String){
    fun family() {
        println("${parentName} is a member of the family")
    }
}

class Children(override var parentName : String ): Parent(parentName){

}
//esercizio svolto durante correzione con tutor
