object Test {
    def bubbleSort(numbers : Array[Int])  = {
       for(i<-1 until numbers.length){
            for (j<- 0 until (numbers.length-1)) {
                if(numbers(j) > numbers(j+1)){
                    val x = numbers(j)
                    println(x)
                    numbers(j) = numbers(j+1)
                    numbers(j+1) = x
                }
            }
        }
    }

    def main(args: Array[String]) = {
        val array1 = Array(3,5,8,9,7)
        bubbleSort(array1)
        println("test")
        println(array1.deep.mkString("\n"))
    }
}
