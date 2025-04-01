package org.example

object linearSearch {
  def main(args: Array[String]): Unit = {
 println(" enter list of array by the space")
    val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    println("enter target element")
    val target = scala.io.StdIn.readLine().toInt
    for (i <- arr.indices) {
      if (arr(i) == target) {
        println(s"Element $target found at index $i")
        return
      }
    }
      println(s"Element $target not found in the array ${arr.mkString(",")}")
  }

}
