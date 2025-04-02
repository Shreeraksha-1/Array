package org.example

object RemoveDuplicates {
  def main(args: Array[String]): Unit = {
    println("Enter array element speared by space")
    val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    val distinctValues = arr.distinct
    println(distinctValues.mkString(" "))
  }
}
