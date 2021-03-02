// Take the sum of integers between a,b
object SumInts extends  App {
   def sumInts(a:Int,b:Int) : Int = {
     if(a>b) {0}
     else {
       println(a)
       a + sumInts(a + 1, b)
     }
   }

  val t = sumInts(5,7)
  println(t)
}


//functions types
// Higher order functions
// Type function
// Anonymous functions


//object excercise2{
//  def sum(f:Int=>Int,a:Int,b:Int){
//    def loop(a:Int,acc:Int){
//       if(a>b) acc
//       else loop(a+1,f(a)+acc)
//       loop(a,0)
//   }
//  sum(x=>x*x,3,5)



