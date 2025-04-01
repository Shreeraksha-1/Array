package org.example

object printAlternates {
  def main(args: Array[String]): Unit = {
    println("Enter numbers separated by spaces:")
    val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    for(i <- arr.indices by 2){
      print(arr(i)+ " ")
    }
  }
}