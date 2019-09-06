package atrui

import scala.math._

object TestMatchCase {

  def main(args: Array[String]): Unit = {

    val re = reduce[String](Array("a","b","c"),_+" ,"+_)
    val re1 = reduce[Int](Array(1,2,3,4),_+_)
    println(re)
    println(re1)
  }
  def reduce[T] (arr:Array[T],op:(T,T)=>T)={
    var tmp = arr(0)
    for(i <- 1 until arr.length){
      tmp =op(tmp,arr(i))
    }
    tmp
  }









}
