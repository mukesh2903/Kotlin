fun main() {
  //  println( divideBy(arrayListOf(100, 200, 300, 7, 79)) { num: Int -> num / 10 })
  //  println(clientMessage(arrayListOf("Mukesh", "Satish", "Vijay")) { name: String -> "Hello $name"})

    val listNum = arrayListOf(10, 45, 64, 37, 80, 96)
    val resultList = listNum.map{
        if ( it % 2 == 0) it /2
        else it *2
    }.filter { it > 25 }

    println(resultList)
    println(filterNum(listNum).filter { it > 25})



}

fun filterNum(arrNum: ArrayList<Int>): ArrayList<Int> {
    for ( i in 0..<arrNum.size) {
        if ( arrNum[i] % 2 == 0 ) {
            arrNum[i] = arrNum[i] * 2
        } else {
            arrNum[i] = arrNum[i] / 2
        }
    }
    return arrNum

}

fun divideBy(arr: ArrayList<Int>, hdf:(Int) -> Int): List<Int> {
    for ( i in 0..<arr.size) {
        if ( arr[i] % 2 == 0 ) {
            arr[i] = hdf(arr[i])
        }
    }
    return arr
}


fun clientMessage(nameList: ArrayList<String>, strMsg:(String) -> String) : ArrayList<String> {
    for(i in 0..<nameList.size) {
        nameList[i] = strMsg(nameList[i])
    }
    return nameList
}