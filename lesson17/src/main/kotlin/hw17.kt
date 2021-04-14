import kotlin.math.pow

//1)      Проделать все примеры что были в уроке
//2)    Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).Сколько денег будет на счету через 3 года (с учётом сложных процентов)?Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
//3)      Изучить функций в Kotlin

fun main(){
    println(getDeposit(100, 10, 3))
}

fun getDeposit(value: Int, percentage: Int, period: Int) = value * (1 + percentage.toDouble() / 100).pow(period.toDouble())

fun getDeposit(value: Double, percentage: Double, period: Double) = value * (1 + percentage / 100).pow(period)