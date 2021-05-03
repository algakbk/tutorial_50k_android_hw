//1) Проделать все примеры что были в уроке
//Задание 1:
//Опишите в виде классов следующие предметы: Кот, Еда, Бумага, Бойлер
//(для воды), Батарейка, Жидкость, Кружка, Коробка, Студент, СотрудникКомпании;
//Задание 2:
//Создайте класс Кот со следующими полями: имя, возраст, уровень сытости,
//уровень воды. И реализуйте в нем следующие методы: 1) вывод имени, возраста,
//начального уровня сытости и уровня воды, 2) метод, меняющий параметры
//сытости и воды и дальнейший их вывод;
//3) Изучить Data-классы в котлин
//Дополнительная литература
//https://kotlinlang.ru/docs/reference/classes.html
//https://metanit.com/kotlin/tutorial/4.1.php
//классы

class Cat(val name: String, var age: Int, var satietyLevel: String, var waterLevel: Double){
    fun introduceYourSelf(){
        println("Name: $name \nAge: $age\nSatiety Level: $satietyLevel\nWater Level: $waterLevel")
    }

    fun changeSatietyWater(satietyLevel: String, waterLevel: Double){
        this.satietyLevel = satietyLevel
        this.waterLevel = waterLevel
        println("Satiety Level: ${this.satietyLevel}\\nWater Level: ${this.waterLevel}\"")
    }
}
class Food()
class Paper()
class Boiler()
class Battery()
class Liquid()
class Cup()
class Box()
class Student()
class EmployeeOfOrganization()