
fun main(){
    val person1 = Employee("Asan", "Uson", 27, 2)
    val person2 = Employee("Asan", "Uson", 27, 2)
//    val person2 = Employee("John", "Doe", 48, 10)
    val person3 = person1.copy(surName = "Usonov")

    println(person1.toString())
//    println(person1.hashCode())
//    println(person2.hashCode())
    println(person1 == person2)
    println(person1 == person3)
    println("person3: $person3")

}


data class Employee(
    val name: String,
    val surName: String,
    val age: Int,
    val experience: Int){

//    override fun toString(): String {
//        return "$name, $surName, $age, $experience"
//    }
}