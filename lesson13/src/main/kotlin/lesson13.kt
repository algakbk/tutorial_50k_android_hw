
fun main(){
    val numList = intArrayOf(10, 2, 10, 3, 1, 2, 5, 2,-1, 3)
    for (i in numList.indices){
        for (j in 0 until numList.size-1){
            if (numList[j] > numList[j+1]){
                val temp = numList[j]
                numList[j] = numList[j+1]
                numList[j+1] = temp
            }
        }
    }
    for (num in numList){
        println(num)
    }
}