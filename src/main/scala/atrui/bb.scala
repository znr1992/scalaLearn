package atrui

import java.util

import scala.collection.mutable.ArrayBuffer

object Tesase {
  def main(args: Array[String]): Unit = {
    val arr=Array[Double](1,-2,4,-5,0,-6,0,-1,3)
    var arr1 = arr.toBuffer
    println(arr1.sortWith(_>_))
  }
  def ar(n:Int):ArrayBuffer[Int]={
    val b =ArrayBuffer[Int]()
    for(i <- 0 until n){
      b+=(new util.Random).nextInt(n)
    }
    return b
  }
  def change(a:ArrayBuffer[Int]):ArrayBuffer[Int]={
    for(i <- 1 until a.length by 2){
      var c= a(i-1)
      a(i-1)=a(i)
      a(i)=c
    }
    return a
  }

}
