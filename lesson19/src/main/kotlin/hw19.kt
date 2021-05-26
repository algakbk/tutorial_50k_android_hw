/**
1) Проделать все примеры что были в уроке
Задание 1:
На основании Задания 1 ДЗ №18, измените классы на data классы, и
сделайте следующее: 1) вывод всех параметров каждого описанного класса, 2)
выведите их Хэш-коды, 3) и сделайте сравнение
Задание 2:
Создайте data-класс Книга со следующими полями: название, автор, год
издания. И реализуйте: 1) создайте несколько книг, и один из них копирует данные
другого; 2)сделайте изменение параметров название и год издание;
3) Изучить Data-классы в котлин
 **/

fun main(){
    val cat1 = Cat("Kisa", 1, "hungry", 2.2)
    val cat2 = Cat("Musya", 1, "hungry", 2.2)

    println(cat1.toString())
    println(cat2.toString())
    println(cat1.hashCode())
    println(cat2.hashCode())
    println(cat1 == cat2)

    val book1 = Book("Kotlin", "Jetbrains", 2010)
    val book2 = Book("Python", "Python", 1999)
    val book3 = book1

    println()
}

data class Cat(
    val name: String,
    var age: Int,
    var satietyLevel: String,
    var waterLevel: Double){

        fun introduceYourSelf(){
            println("Name: $name \nAge: $age\nSatiety Level: $satietyLevel\nWater Level: $waterLevel")
        }

        fun changeSatietyWater(satietyLevel: String, waterLevel: Double){
            this.satietyLevel = satietyLevel
            this.waterLevel = waterLevel
            println("Satiety Level: ${this.satietyLevel}\\nWater Level: ${this.waterLevel}\"")
        }
}

data class Book(
    val name: String,
    val author: String,
    val year: Int){

}