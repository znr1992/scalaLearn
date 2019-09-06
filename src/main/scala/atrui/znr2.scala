package atrui


object TestCase1 {

  def main(args: Array[String]): Unit = {
//    val str = "creat"*3
//    val s:BigDecimal = f(2,30)
//    println(s)
    var i = 1
    myWhile(i<100){
      println(i)
      i+=1
    }
  }
//    def f(n:Int): Int ={
//      if(n==1)1
//      else  return n * f(n-1)
//    }
//    def f(n:Int,m:Int): Int ={
//    if(m==1) {
//       n
//    }else  return n*f(n,m-1)
//  }

  def myWhile(con: => Boolean)(cp: => Unit){
    if(con){cp
    myWhile(con)(cp)}
  }









}
