package org.example

object findLargest {
  def main(args : Array[String]): Unit = {
    val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    var largest = arr(0)
    for (i <- arr.indices) {
      if (arr(i) > largest)
        largest = arr(i)
    }
    println(largest)

  }

}
