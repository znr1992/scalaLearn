import scala.util.control.Breaks

object TestMatchCase {

  def main(args: Array[String]): Unit = {
//    println(add)
    println(sum(100,103))
  }
  def add {
    println(3)
  }

  def sum(a:Int,b:Int):Int={
    var sum = 0
    Breaks.breakable{
      for(i <- a to b){
        for(j <- 2 until i){
          if(i/j==0){
            Breaks.break()
          }
        }
        sum += i
      }
    }
    return sum
  }



}
