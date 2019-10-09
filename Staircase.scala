import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    // Complete the staircase function below.
    def staircase(n: Int) {
        var stringBuild : String = ""
        var count : Int = 1
        var end : Int = n
        var space_string : String = " "
        var hash_string : String = "#"
        var final_string : String = ""
        val builder = StringBuilder.newBuilder
        
        for(i<- 1 to n ) {
            for(i<- 1 to (n) ){
                builder.append(space_string)
            } 
            for(i<- 1 to count){
                builder.append(hash_string)
            }
        }
        val result = builder.toString()
        println(result)
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        staircase(n)
    }
}
