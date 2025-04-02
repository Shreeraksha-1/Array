package org.example

object GenerateSubarrays {
  def main(args: Array[String]): Unit = {
    println("Enter array element speared by space")
    val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    for (i <- arr.indices; j <- i until arr.length) {
      println(arr.slice(i, j + 1).mkString("[", ", ", "]"))
    }

  }

}
