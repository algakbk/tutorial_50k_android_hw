
fun main(){
    val person = Person("Asan", "Uson", 27)

    println(person.name)
    println(person.surName)
    println(person.age)
//    println(person.address)
    person.introduceYourSelf()

    val employee = Employee("Elon", "Musk", 40, 20)
    employee.introduceYourSelf()
}


open class Person(val name: String, val surName: String, val age: Int){
//    var address: String? = null
//    constructor(name: String, surName: String, age: Int, address: String) : this(name, surName, age) {
//        this.address = address
//    }

    open fun introduceYourSelf(){
        println("my name is $name, I love programming")
    }
}

class Employee(name: String, surName: String, age: Int, val experience: Int) : Person(name, surName, age){

    override fun introduceYourSelf() {
        println("My names is $name $surName, I have $experience years of experience")
    }
}