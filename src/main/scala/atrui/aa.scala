package com.atguigu.scala0508.day02.highfun

/**
  * Author lzc
  * Date 2019-09-04 16:15
  */
object ControlAbs3 {
  def main(args: Array[String]): Unit = {
//    printf("Hello,%s! Next year you will be %d.\n","zhg",23)
//    var sum = 0
//    for(ch <- "he") sum+=ch

//    println(lo(10,12,13))
    box("aaa")
    def box(s:String): Unit ={
      var border = "-"*s.length+"--\n"
      println(border+"|"+s+"|\n"+border)
    }
  }
  def lo(i:Int*): Int ={
    if(i.length==0)0
    else
      i.head + lo(i.tail:_*)
  }

  def myWhile(condition: => Boolean)(op: => Unit): Unit = {
    if(condition){
      op
      myWhile(condition)(op)
    }
  }
}

/*
myWhile


 */