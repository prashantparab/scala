object InsertionSort {
  def insertionSort(values : Array[Int]): Array[Int] = {
    var j : Int = 0
    for(i<- 1 to values.length-1){
      val key = values(i)
      j = i -1
      while (j>=0 &&  values(j) > key){
        println("jjj"+j)
        values(j + 1) = values(j)
        j = j-1
      }
      values(j+1) = key
    }
    values
  }

  def main(args: Array[String]): Unit = {
    val unsortedArr = Array(1,3,2,8,6,4,3,2)
    val sortedArr = insertionSort(unsortedArr)
    println(sortedArr.mkString(" "))
  }
}
