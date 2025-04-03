package org.example

object ReverseArray {
  def main (args: Array[String]): Unit = {
    val arr= scala.io.StdIn.readLine().split(" ").map(_.toInt)
     val reverseArr= arr.reverse
    println(reverseArr.mkString(" "))
  }
}
