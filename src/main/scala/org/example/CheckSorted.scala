package org.example

object CheckSorted {
  def main(args: Array[String]): Unit = {
    println("Enter array element speared by space")
    val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    var sorted = true
    for(i <- 1 until arr.length){
      if(arr(i)<=arr(i-1)){
        sorted =false
        println("NO")
        return
      }
    }
    println("Yes")
  }

}
