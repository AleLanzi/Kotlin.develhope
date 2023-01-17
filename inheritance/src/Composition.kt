fun main(){
val children2 = Children2("anna")
   children2.person()

}
interface Parent2{
    val name : String
    fun person(){}
}
class Children2(override val name: String): Parent2{
    override fun person() {
        println("$name is a member of the family")
    }
}
//esercizio svolto durante correzione con tutor
