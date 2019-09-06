package atrui

object TestMatchCase3 {

  def main(args: Array[String]): Unit = {

    println(reduce(1, 2, 3, 4, 5))
  }
  def reduce[T] (n:T*):String={
    if(n.length==0)
    else return n.head+reduce[T](n.tail:_*)

  }









}
