
fun main(){
//    sayHelloKotlin("Kotlin", 3)
//    val max = getMax(5, 6)
    println(getMax(5,6))
    println(getMax(6,6, 5))
    println(getMax(7.8,6.8))
    sayHello(name = "Java", reps = 3)

    printInts(1,2,3,4)


}

fun printInts(vararg ints: Int){
    for (i in ints)
        println(i)
}

fun sayHello(name: String = "Kotlin", reps: Int = 1){
    var counter = reps
//    for (i in 0 until reps)
//        println("Hello $name! Where are you?")

    while (counter > 0){
        println("Hello $name! Where are you?")
        counter--
    }
}

fun getMax(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

// есть ошибка в алгоритме
fun getMax(num1: Int, num2: Int, num3: Int): Int {
  return when{
      num1 > num2 && num1 > num3 -> num1
      num2 > num1 && num2 > num3 -> num2
      else -> num3
  }
}

fun getMax(num1: Double, num2: Double): Double{
    return if (num1 > num2) num1 else num2
}

