object MaxCount {
    def maxCount(arr : Array[Int]) = {
        var max : Int = 0
        var count : Int = 0 
        for(i<- 0 to (arr.length-1)){
            var num = arr(i)
            if(num==max){
                count +=1
            } else if(num > max){
                max = num 
                count = 1 
            }
        }
        println (count)
    }

    def main(args: Array[String]) = {
        val arr = Array(4,5,3,2,4)
        maxCount(arr)
    }
}
